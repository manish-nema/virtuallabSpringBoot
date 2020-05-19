package com.ibm.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.productservice.dto.ProductDTO;
import com.ibm.productservice.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("product/{id}")
	public ResponseEntity<ProductDTO> searchByProductID(@PathVariable(value="id") Long id) {
		
					
		return ResponseEntity.ok().body(productService.getProductById(id));
		
	}

}
