package com.dh.clase32.controller;

import com.dh.clase32.entity.ParamStock;
import com.dh.clase32.entity.Producto;
import com.dh.clase32.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> registrarProducto(@RequestBody Producto producto){
        System.out.println(producto.toString());
        return ResponseEntity.ok(productoService.registrarProducto(producto));
    }

    @GetMapping
    public ResponseEntity<List<Producto>> listarProductos(){
        List<Producto> productos = productoService.listarProductos();
        List<Producto> productosConStock = new ArrayList<>();

        for (Producto producto:productos) {
            if(producto.getCantidad() > 0){
                productosConStock.add(producto);
            }
        }

        return ResponseEntity.ok(productosConStock);
    }

    @DeleteMapping
    public void eliminarProducto(Long id){
        productoService.eliminarProducto(id);
    }

    @PutMapping("/actualizarStock")
    public ResponseEntity<Producto> actualizarStock(@RequestBody ParamStock param){
        Producto producto = param.getProducto();
        int cant = param.getCant();
        producto.setCantidad(producto.getCantidad() - cant);

        return ResponseEntity.ok(productoService.actualizarProducto(producto));
    }

}
