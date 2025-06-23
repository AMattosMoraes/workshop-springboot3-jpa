package com.amattosmoraes.course.repositories;

import com.amattosmoraes.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
