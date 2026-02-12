package com.interview.order_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/{userId}")
    public List<OrderDto> getOrdersForUser(@PathVariable String userId) {
        return Arrays.asList(
                new OrderDto("ORD-001","Laptop",2100.00),
                new OrderDto("ORD-002","Headphones",1500)
        );
    }
}
