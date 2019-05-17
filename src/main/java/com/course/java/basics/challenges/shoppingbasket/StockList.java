package com.course.java.basics.challenges.shoppingbasket;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by dev on 16/02/2016.
 */
public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if(item != null) {
            // check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity
            if(inStock != item) {
                item.adjustStock(inStock.quantityAvailable());
            }

            list.put(item.getName(), item);
            return item.quantityAvailable();
        }
        return 0;
    }

    public int reserveStock (String item, int quantity) {
        StockItem inStock = list.get(item);

        if(inStock != null && quantity > 0) {
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if(inStock != null && quantity > 0) {
            return inStock.finaliseStock(quantity);

        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityAvailable();

            s = s + stockItem + "\t\tStock: " + stockItem.quantityAvailable() + "\tValue: ";
            s = s + String.format("%8.2f",itemValue);
            s = s + "\t\tReserved: " + stockItem.quantityReserved() + "\n";
            totalCost += itemValue;
        }
        return s + "\n----------------------------\n" +
                   "Total $" + String.format("%.2f", totalCost) + "\n" +
                "----------------------------\n\n";
    }
}
