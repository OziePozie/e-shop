package com.ozie.eshop.controller;

import com.ozie.eshop.model.Cart;
import com.ozie.eshop.model.User;
import com.ozie.eshop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/auth/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping
    public Cart getCartByUserId(Authentication authentication) {
        if (authentication != null) {
            User user = (User) authentication.getPrincipal();
            Long userId = user.getId(); // Предполагается, что у вас есть метод getId() в объекте User
            return cartService.getCartByUserId(userId);
        }

        return null;
    }



}
