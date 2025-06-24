package com.amattosmoraes.course.repositories;

import com.amattosmoraes.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
