package com.devsuperior.SemanaDevSuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.SemanaDevSuperior.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
}
