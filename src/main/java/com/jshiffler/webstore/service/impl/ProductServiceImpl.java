package com.jshiffler.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jshiffler.webstore.domain.Product;
import com.jshiffler.webstore.repository.ProductRepository;
import com.jshifler.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void updateAllStock() {
		List<Product> allProducts = productRepository.getAllProducts();
		for(Product product : allProducts){
			if (product.getUnitsInStock()<500)
				productRepository.updateStock(product.getProductId(), product.getUnitsInStock()+1000);
				
		}
		
	}
	
	
}