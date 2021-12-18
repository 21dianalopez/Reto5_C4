/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5_C4.repositories;

import com.example.Reto5_C4.entities.Clothe;
import com.example.Reto5_C4.repositoriesCrud.ClotheCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
* @author Diana L
 */
@Repository
public class ClotheRepository{
    
    @Autowired
    private ClotheCrudRepository repository;
    
    public Clothe createClothe(Clothe PrendaNueva){
        return repository.save(PrendaNueva);
    }
    
    public List<Clothe> getAllClothe(){
        return (List<Clothe>)repository.findAll();
    }
    
    public Optional<Clothe> getClotheReference(String reference){
        return repository.findByReference(reference);
    }
    
    public Optional<Clothe> getClotheId(Integer id){
        return repository.findById(id);
    }
    
    
    
    public void delete(Clothe clotheDelete){
        repository.delete(clotheDelete);
    }

   //Reto 5
    public List<Clothe> productByPrice(double precio){
        return repository.findByPriceLessThanEqual(precio);
    }
    //Reto 5
    public List<Clothe> findByDescriptionLike(String description){
        return repository.findByDescriptionLike(description);
    }
    
    
}
