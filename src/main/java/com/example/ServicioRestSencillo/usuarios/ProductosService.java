/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ServicioRestSencillo.usuarios;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author rjsaa
 */
@Service
public class ProductosService {
    
    //actualizar, borrar, consultar por id, consultar todo, y consultar por un parámetro en específico

    
    private final ProductosRepository repositorio;
    
    public ProductosService(ProductosRepository repositorio){
        this.repositorio = repositorio;
    }
    
    //guardar
    public Productos guardarProducto(Productos producto){
        return repositorio.save(producto);
    }
    
    //actualizar
    public Productos actualizarProducto(Productos producto){
        return repositorio.save(producto);
    }
    
    //eliminar
    public void eliminarProductos(Long id){
        Optional<Productos> productoOptional = repositorio.findById(id);
        
        if(productoOptional.isPresent()){
            repositorio.delete(productoOptional.get());
        }
        
        
    }
    
    //consultar por id
    public Productos consultarPorId(Long id){
        Optional<Productos> productoOptional = repositorio.findById(id);
        
        if(productoOptional.isPresent()){
            return productoOptional.get();
        }else{
            return null;
        }
    }
    
    
    //consultar todos
    public List<Productos> getProductos(){
        return repositorio.findAll();
    }
    
    //consultar por un parametro
    public Productos consultarPorNombre(String nombre){
        Productos producto = 
                repositorio.findByNombre(nombre);
        
        if(producto.toString().isEmpty()){
            return null;
        }else{
            return producto;
        }
    }
     
}
