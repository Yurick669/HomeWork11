package com.example.HomeWork11.Service;


import java.util.ArrayList;
import java.util.Map;

public interface ServiceCart {


    void addItemsToCart(ArrayList<Integer> idList);

    Map<Integer, Integer> getItemsFromCart();


}

