package com.cart.service;

import com.cart.entity.CartItem;
import java.util.List;

public interface CartService {
    List<CartItem> getCart(String loginId);
    void addToCart(String loginId, CartItem item);
    void removeFromCart(String loginId, Integer courseId);
}
