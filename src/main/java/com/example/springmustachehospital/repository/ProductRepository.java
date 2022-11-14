package com.example.springmustachehospital.repository;

import com.example.springmustachehospital.domain.Hospital;
import com.example.springmustachehospital.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

