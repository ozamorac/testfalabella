package com.test.apirest.models.services;

import java.util.List;

import com.test.apirest.models.entity.Product;

public interface IProductService {

	public List<Product> findAll();
	
	public Product findById(Long id);
	
	public Product save(Product product);
	
	public void delete(Long id);
	
}
