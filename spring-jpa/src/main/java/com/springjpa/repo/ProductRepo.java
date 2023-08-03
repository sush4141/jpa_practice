package com.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
