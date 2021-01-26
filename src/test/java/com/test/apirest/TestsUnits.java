package com.test.apirest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.apirest.models.dao.IProductDao;
import com.test.apirest.models.entity.Product;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestsUnits.class)
public class TestsUnits {

	@Autowired
    private IProductDao productDao;

    @Test
    public void contextLoads() { }
    
    @Test
    public void AddProduct_CreateNewProduct() {
    	Product product = new Product();
    	product.setSku("1234567");
    	product.setName("Test");
    	product.setSize("S");
    	product.setBrand("Test");
    	product.setPrice(new BigDecimal(0));
    	productDao.save(product);
        List<Product> products = (List<Product>) productDao.findAll();
        assertFalse(products.isEmpty());

        String name = "Test";
        Product productFind = productDao.findById(products.get(0).getId()).get();
        productFind.setName(name);
        productDao.save(productFind);

        product = productDao.findById(product.getId()).get();

        productDao.deleteById(product.getId());
        assertTrue( ((List<Product>) productDao.findAll()).isEmpty());
    }
}
