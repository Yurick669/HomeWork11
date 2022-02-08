package com.example.HomeWork11;

import java.util.HashMap;
import java.util.List;

public class Cart {
    private final HashMap<Integer, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public List<Integer> add(List<Integer> idList) {
        for (Integer newId : idList) {
            if (items.containsKey(newId)) {
                getItems().put(newId, getItems().getOrDefault(newId, 0) + 1);
            } else {
                items.put(newId, 1);
            }
        }
        return idList;
    }



    public HashMap<Integer, Integer> getItems() {
        return (HashMap<Integer, Integer>) items.clone();
    }
}
