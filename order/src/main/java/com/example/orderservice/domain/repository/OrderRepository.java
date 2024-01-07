package com.example.orderservice.domain.repository;

import com.example.orderservice.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom query methods can be added here if needed
}


