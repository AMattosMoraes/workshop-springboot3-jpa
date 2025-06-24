package com.amattosmoraes.course.repositories;

import com.amattosmoraes.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
