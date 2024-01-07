package com.example.orderservice.domain.events;

import java.util.Date;

import org.springframework.messaging.simp.annotation.SendToUser;

import com.example.orderservice.domain.model.Order;
import com.example.orderservice.infrastructure.AbstractEvent;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {
    private Long id;
    private String userId;
    private Long productId;
    private String productName;
    private Integer qty;
    private String address;
    private String status;
    private Date orderDt;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}