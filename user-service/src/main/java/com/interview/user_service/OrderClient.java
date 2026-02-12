package com.interview.user_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "order-service")
public interface OrderClient {

    @GetMapping("/orders/{userId}")
    List<OrderDto> getOrdersForUser(@PathVariable String userId);
}
