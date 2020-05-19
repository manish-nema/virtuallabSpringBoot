package com.ibm.productservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.productservice.domain.Product;
import com.ibm.productservice.dto.ProductDTO;
import com.ibm.productservice.dto.ProductMapper;
import com.ibm.productservice.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public ProductDTO getProductById(Long id) {
		Optional<Product> product= productRepository.findById(id);
		ProductDTO productDTO=null;
		if(product.isPresent()) {
			
			ProductMapper mapper=new ProductMapper();
			 productDTO=mapper.convertProductToProductDTO(product.get());
			
		}
		
		return productDTO;
	}

}
