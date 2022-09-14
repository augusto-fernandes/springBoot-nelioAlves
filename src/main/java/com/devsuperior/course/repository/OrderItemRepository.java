package com.devsuperior.course.repository;

import com.devsuperior.course.entities.OrderItem;
import com.devsuperior.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
