package org.example.spring.controller;

import org.example.spring.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("store/order")
public class OrderController {
    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam List<Integer> items) {
        return orderService.add(items);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return orderService.get();
    }
}
