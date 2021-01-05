package com.devsuperior.SemanaDevSuperior.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.SemanaDevSuperior.dto.ProductDTO;
import com.devsuperior.SemanaDevSuperior.entities.Product;
import com.devsuperior.SemanaDevSuperior.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository product; 

	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = product.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}
