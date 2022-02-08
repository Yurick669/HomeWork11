package com.example.HomeWork11.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

import com.example.HomeWork11.Cart;

@Configuration
public class ConfigClass {

    @Bean
    @SessionScope
    public Cart createCart(){
        return new Cart();
    }


}
