package com.devsuperior.SemanaDevSuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.SemanaDevSuperior.dto.OrderDTO;
import com.devsuperior.SemanaDevSuperior.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService order;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAllOrders() {
		List<OrderDTO> list = order.findAll();
		return ResponseEntity.ok().body(list);
	}
}
