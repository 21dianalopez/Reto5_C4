/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5_C4.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
* @author Diana L
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "clothe")
public class Clothe{
   
    @Id
    private String reference;
    private String category;
    private String size;
    private String description;
    private boolean availability;
    private Float price;
    private Integer quantity;
    private String photography;  
}

