/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ServicioRestSencillo.usuarios;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rjsaa
 */
@Getter
@Setter
@Entity(name="producto")
public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    Long id;
    String nombre;
    String descripcion;
    
    
}
