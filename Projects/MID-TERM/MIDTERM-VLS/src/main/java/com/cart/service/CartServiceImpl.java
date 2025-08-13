package com.cart.service;

import com.cart.entity.CartItem;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartServiceImpl implements CartService {

    // Key = loginId, Value = list of cart items
    private final Map<String, List<CartItem>> cartMap = new HashMap<>();

    @Override
    public List<CartItem> getCart(String loginId) {
        return cartMap.getOrDefault(loginId, new ArrayList<>());
    }

    @Override
    public void addToCart(String loginId, CartItem item) {
        List<CartItem> cartItems = cartMap.getOrDefault(loginId, new ArrayList<>());
        cartItems.add(item);
        cartMap.put(loginId, cartItems);
    }

    @Override
    public void removeFromCart(String loginId, Integer courseId) {
        List<CartItem> cartItems = cartMap.getOrDefault(loginId, new ArrayList<>());
        cartItems.removeIf(c -> Objects.equals(c.getCourseId(), courseId));
        cartMap.put(loginId, cartItems);
    }
}
