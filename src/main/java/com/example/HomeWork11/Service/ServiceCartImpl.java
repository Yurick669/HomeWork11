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

        for (Integer newId : id) {
            if (cart.getItems().containsKey(newId)) {
                cart.getItems().put(newId, cart.getItems().get(newId) + 1);
            } else {
                cart.getItems().put(newId, 1);
            }
        }
    }

    @Override
    public Map<Integer, Integer> getItemsFromCart() {
        return cart.getItems();
    }

}

