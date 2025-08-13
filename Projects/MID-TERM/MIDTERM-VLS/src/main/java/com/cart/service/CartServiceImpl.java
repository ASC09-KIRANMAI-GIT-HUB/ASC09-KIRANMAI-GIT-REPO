package com.cart.service;

import com.cart.entity.CartItem;
import com.course.entity.CourseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartServiceImpl implements CartService {

    // Key = loginId, Value = list of cart item

    private final List<CourseEntity> cart = new ArrayList<>();

    // Add course to cart
    public void addToCart(CourseEntity course) {
        cart.add(course);
    }


    @Override
    public List<CartItem> getCart(String loginId) {
        return Collections.emptyList();
    }

    @Override
    public void addToCart(String loginId, CartItem item) {

    }

    @Override
    public void removeFromCart(String loginId, Integer courseId) {

    }

}
