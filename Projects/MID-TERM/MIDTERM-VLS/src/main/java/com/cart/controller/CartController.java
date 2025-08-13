package com.cart.controller;

import com.cart.entity.CartItem;
import com.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/{loginId}")
    public List<CartItem> getCart(@PathVariable String loginId) {
        return cartService.getCart(loginId);
    }

    @PostMapping("/{loginId}")
    public String addToCart(@PathVariable String loginId, @RequestBody CartItem item) {
        cartService.addToCart(loginId, item);
        return "Course added to cart";
    }

    @DeleteMapping("/{loginId}/{courseId}")
    public String removeFromCart(@PathVariable String loginId, @PathVariable Integer courseId) {
        cartService.removeFromCart(loginId, courseId);
        return "Course removed from cart";
    }
}
