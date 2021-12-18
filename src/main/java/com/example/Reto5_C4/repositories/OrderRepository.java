/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5_C4.repositories;

import com.example.Reto5_C4.entities.Order;
import com.example.Reto5_C4.repositoriesCrud.OrderCrudRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;






/**
 *
* @author Diana L
 */
@Repository
public class OrderRepository {
    
    @Autowired
    private OrderCrudRepository repository;
    
    public List<Order> getAll(){
        return(List<Order>)repository.findAll();
    }
    public List<Order> getZone(String zone){
        return repository.findByZone(zone);
    }
    
    public List<Order> getIdSalesMan(Integer id){
        return repository.findBySalesMan(id);
    } 
    public List<Order> getStatus(String status){
        return repository.findByStatus(status);
    }
    public List<Order> getDate(Date fecha){
        return repository.findByRegisterDay(fecha);
    }
    
    public Optional<Order> getById(Integer id){
        return repository.findById(id);
    }
    
    public Order createOrder(Order order){
        return repository.save(order);
    }
    
    
    
   
}

