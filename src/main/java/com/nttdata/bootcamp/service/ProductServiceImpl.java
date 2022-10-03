package com.nttdata.bootcamp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.dto.Product;

@Service
public class ProductServiceImpl implements IProductService {

	// Puertos

	@Value("${server.port}")
	private String port;

	@Value("${product.product-name}")
	private String productName;

	// Revisar interfaz:

	@Override
	public Product getProduct(Integer id) {
		return new Product(id, "GET");
	}

	@Override
	public Product postProduct(Integer id) {
		return new Product(id, "POST");
	}
}
