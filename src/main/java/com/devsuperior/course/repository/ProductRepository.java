package com.devsuperior.course.repository;

import com.devsuperior.course.entities.Category;
import com.devsuperior.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
