package com.test.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.apirest.models.entity.Product;

public interface IProductDao extends JpaRepository<Product, Long> {

	@Query("from Product")
	public List<Product> findAllProducts();
	
}
