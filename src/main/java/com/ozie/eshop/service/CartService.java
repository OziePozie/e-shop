package com.ozie.eshop.service;

import com.ozie.eshop.model.Cart;
import com.ozie.eshop.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService  {
    @Autowired
    CartRepository cartRepository;

    public Cart getCartByUserId(Long userId) {

        return cartRepository.findByUserId(userId);
    }
}
