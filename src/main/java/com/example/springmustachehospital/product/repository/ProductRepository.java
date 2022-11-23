package com.example.springmustachehospital.product.repository;

import com.example.springmustachehospital.domain.Hospital;
import com.example.springmustachehospital.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

