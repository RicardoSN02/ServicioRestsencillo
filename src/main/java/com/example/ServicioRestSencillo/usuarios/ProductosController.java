/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ServicioRestSencillo.usuarios;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author rjsaa
 */
@RestController
@RequestMapping("productos")
public class ProductosController {
    
    
    private final ProductosService service;
    
    public ProductosController(ProductosService service){
        this.service = service;
    }
    
    //actualizar, borrar, consultar por id, consultar todo, y consultar por un parámetro en específico
    
    //agregar
    @PostMapping("/agregar/{nombre}&{descripcion}")
    public Productos guardarProducto(@RequestBody Productos producto){
        return service.guardarProducto(producto);
    }
    
    //actualizar
    @PutMapping("/editar/{id}&{nombre}&{descripcion}")
    public Productos actualizarProducto(@RequestBody Productos producto){
        return service.actualizarProducto(producto);
    }
    
    
    //borrar
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Long id){
        service.eliminarProductos(id);
    }
    
    //consultar por id
    
    @GetMapping("consultar/{id}")
    public Productos getProductoId(Long id){
        return service.consultarPorId(id);
    }
    
    //consultar todo
    @GetMapping("consultar")
    public List<Productos> getProductos(){
        return service.getProductos();
    }
    
    //consultar por un parametro
    
    @GetMapping("consultarNombre/{nombre}")
    public Productos getProductoNombre(String nombre){
        return service.consultarPorNombre(nombre);
    }
    
}
