package com.example.HomeWork11.Service;

import com.example.HomeWork11.Cart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class ServiceCartImpl implements ServiceCart {

    private final Cart cart;

    public ServiceCartImpl(Cart cart) {
        this.cart = cart;
    }


    @Override
    public void addItemsToCart(ArrayList<Integer> id) {


    }

    @Override
    public Map<Integer, Integer> getItemsFromCart() {
        return cart.getItems();
    }

}

