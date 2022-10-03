package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.dto.Product;
import com.nttdata.bootcamp.service.IProductService;

@RestController
@RequestMapping("/producto")


public class ProductController {

	// Corregir

	@Autowired
	Environment entorno;

	@Autowired
	private IProductService productService;

	@GetMapping(value = "/{id}")
	public Product getProduct(@PathVariable Integer id) {
		System.out.println("TEST G");
		Product producto = productService.getProduct(id);
		producto.setServerPort(entorno.getProperty("local.server.port"));
		return producto;
	}

	@PostMapping(value = "/{id}")
	public Product postProduct(@PathVariable Integer id) {
		System.out.println("TEST P");
		return productService.postProduct(id);
	}
}
