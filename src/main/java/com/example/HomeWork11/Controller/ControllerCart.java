package com.example.HomeWork11.Controller;


import com.example.HomeWork11.Service.ServiceCart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

@RestController
@RequestMapping("store/order")
public class ControllerCart {

    private final ServiceCart cartService;

    public ControllerCart(ServiceCart cartService) {
        this.cartService = cartService;
    }

    @GetMapping()
    public String helloMessage() {
        return "Страница корзины с покупками";
    }


    @GetMapping("/add")
    public String addItemsToCart(@RequestParam ArrayList<Integer> id) {
        cartService.addItemsToCart(id);
        return "Товар добавлен в корзину";
    }

    @GetMapping("/get")
    public String getItemsFromCart() {
        return cartService.getItemsFromCart() + "Список товаров";
    }

}