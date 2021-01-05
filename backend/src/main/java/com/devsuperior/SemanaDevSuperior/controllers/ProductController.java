package com.devsuperior.SemanaDevSuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.SemanaDevSuperior.dto.ProductDTO;
import com.devsuperior.SemanaDevSuperior.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService product; 
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAllProducts(){
		List<ProductDTO> list = product.findAll();
		return ResponseEntity.ok().body(list);
	}
}
