package com.amattosmoraes.course.repositories;

import com.amattosmoraes.course.entities.OrderItem;
import com.amattosmoraes.course.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
