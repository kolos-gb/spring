package org.example.spring.service.impl;

import org.example.spring.model.Basket;
import org.example.spring.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }


    @Override
    public String add(List<Integer> list) {
        basket.addOrder(list);
        return "SUCCESSFULLY ADDED";
    }

    @Override
    public List<Integer> get() {
        return basket.getOrder();
    }
}
