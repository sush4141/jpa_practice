package com.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
