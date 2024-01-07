package com.example.orderservice.application;

import com.example.orderservice.domain.commands.PlaceOrderCommand;
import com.example.orderservice.domain.commands.CancelOrderCommand;
import com.example.orderservice.domain.model.Order;
import com.example.orderservice.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody PlaceOrderCommand command) {
        // Implementation of order placement logic
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelOrder(@PathVariable Long id) {
        // Implementation of order cancellation logic
        return ResponseEntity.ok().build();
    }
}