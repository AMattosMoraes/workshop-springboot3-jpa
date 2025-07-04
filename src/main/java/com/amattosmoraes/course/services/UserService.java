package com.amattosmoraes.course.services;

import com.amattosmoraes.course.entities.User;
import com.amattosmoraes.course.repositories.UserRepository;
import com.amattosmoraes.course.services.exceptions.DatabaseException;
import com.amattosmoraes.course.services.exceptions.ResourcesNotFounfExceptions;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj =  repository.findById(id);
        return obj.orElseThrow(() -> new ResourcesNotFounfExceptions(id));
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
           throw new ResourcesNotFounfExceptions(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj){
       try {
           User entity = repository.getReferenceById(id);
           updateData(entity, obj);
           return repository.save(entity);
       } catch (EntityNotFoundException e){
           throw new ResourcesNotFounfExceptions(id);
       }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setphone(obj.getphone());
    }
}
