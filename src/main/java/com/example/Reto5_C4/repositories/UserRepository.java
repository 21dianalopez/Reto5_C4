/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5_C4.repositories;

import com.example.Reto5_C4.entities.User;
import com.example.Reto5_C4.repositoriesCrud.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
* @author Diana L
 */
@Repository
public class UserRepository {
    
    @Autowired
    private UserCrudRepository repository;
    
    public List<User> getAll(){
        return (List<User>) repository.findAll();
    }
    
    public Optional<User> getUser(int id){
        return repository.findById(id);
    }
    
    public User save(User user){
        
        return repository.save(user);
    }
    
      
    public void deleteUser(User userDelete){
        repository.delete(userDelete);
    }
      public List<User> birthtDayList(String monthBirthtDay) {
        return repository.findByMonthBirthtDay(monthBirthtDay);
    }

       
}
