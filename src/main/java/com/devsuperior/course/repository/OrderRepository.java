package com.devsuperior.course.repository;

import com.devsuperior.course.entities.Order;
import com.devsuperior.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
