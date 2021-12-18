/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5_C4.repositoriesCrud;

import com.example.Reto5_C4.entities.User;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
* @author Diana L
 */
public interface UserCrudRepository extends MongoRepository<User,Integer>{

    public List<User> findByMonthBirthtDay(String monthBirthtDay);
    List<User> findBybirthtDay(Date date);
    
}
