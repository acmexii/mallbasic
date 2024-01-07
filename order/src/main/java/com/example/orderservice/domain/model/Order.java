package com.example.orderservice.domain.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.util.Date;
import com.example.orderservice.domain.events.OrderPlaced;

@Entity
@Table(name = "order_table")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userId;
    private Long productId;
    private String productName;
    private Integer qty;
    private String address;
    private String status;
    private Date orderDt;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }
}