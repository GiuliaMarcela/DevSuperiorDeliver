package com.devsuperior.SemanaDevSuperior.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.SemanaDevSuperior.dto.OrderDTO;
import com.devsuperior.SemanaDevSuperior.entities.Order;
import com.devsuperior.SemanaDevSuperior.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository order; 
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = order.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
} 
