/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5_C4.repositories;

import com.example.Reto5_C4.entities.Persona;
import com.example.Reto5_C4.repositoriesCrud.personaCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
* @author Diana L
 */
@Repository
public class personaRepository {
    
    @Autowired
    private personaCrudRepository repository;
    
    public List<Persona> getAllPersona(){
        return repository.findAll();
    }
    public Optional<Persona> findID(Integer id){
        return repository.findById(id);
    }
    
    public Persona create(Persona nuevo){
        return repository.save(nuevo);
    }
    
    public void delete(Persona borrado){
        repository.delete(borrado);
    }
    
            
    
}
