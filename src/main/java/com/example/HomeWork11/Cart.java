package com.example.HomeWork11;

import java.util.HashMap;

public class Cart {
    private final HashMap<Integer, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
        System.out.println("1");
    }

    public HashMap<Integer, Integer> getItems() {
        return items;
    }
}

