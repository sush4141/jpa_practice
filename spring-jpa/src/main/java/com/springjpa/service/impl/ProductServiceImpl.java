package com.springjpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.entity.Category;
import com.springjpa.entity.Product;
import com.springjpa.repo.CategoryRepo;
import com.springjpa.repo.ProductRepo;
import com.springjpa.service.ProductService;

import jakarta.transaction.Transactional;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	CategoryRepo categoryRepo;
	
	@Autowired
	ProductRepo productRepo;

	@Override
	@Transactional
	public void saveProduct() {
		
		Product product1 = new Product();
		product1.setProductName("iPhone 14 Pro");
		
		Product product2 = new Product();
		product1.setProductName("Samsung s21 fe");
		
		Product product3 = new Product();
		product1.setProductName("LG QLED TV");
		
		Category category1 = new Category();
		category1.setCategory("Electronics");
		
		Category category2 = new Category();
		category1.setCategory("Phones");
		
		category1.getProductList().add(product1);
		category1.getProductList().add(product2);
		category1.getProductList().add(product3);
		
		category2.getProductList().add(product1);
		category2.getProductList().add(product2);
		
		categoryRepo.save(category1);
		categoryRepo.save(category2);
		
	}

}
