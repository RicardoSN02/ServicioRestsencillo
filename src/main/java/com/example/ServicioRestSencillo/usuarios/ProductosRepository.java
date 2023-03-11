/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ServicioRestSencillo.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rjsaa
 */
@Repository
public interface ProductosRepository extends JpaRepository<Productos,Long>{
    
    Productos findByNombre(String nombre);
    
}
