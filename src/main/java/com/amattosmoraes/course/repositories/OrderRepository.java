package com.amattosmoraes.course.repositories;

import com.amattosmoraes.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
