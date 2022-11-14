package com.example.springmustachehospital.repository;

import com.example.springmustachehospital.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
