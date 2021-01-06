package com.devsuperior.SemanaDevSuperior.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.SemanaDevSuperior.dto.OrderDTO;
import com.devsuperior.SemanaDevSuperior.dto.ProductDTO;
import com.devsuperior.SemanaDevSuperior.entities.Order;
import com.devsuperior.SemanaDevSuperior.entities.Product;
import com.devsuperior.SemanaDevSuperior.enums.OrderStatus;
import com.devsuperior.SemanaDevSuperior.repositories.OrderRepository;
import com.devsuperior.SemanaDevSuperior.repositories.ProductRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repOrder; 
	
	@Autowired
	private ProductRepository repProduct;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repOrder.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public OrderDTO insert(OrderDTO entityDTO) {
		Order order = new Order(null, entityDTO.getAddress(), entityDTO.getLatitude(), entityDTO.getLongitude(),
				Instant.now(), OrderStatus.PENDING);
		for(ProductDTO products : entityDTO.getProducts()) {
			Product product = repProduct.getOne(products.getId());
			order.getProducts().add(product);
		}
		order = repOrder.save(order);
		return new OrderDTO(order);
	}
} 
