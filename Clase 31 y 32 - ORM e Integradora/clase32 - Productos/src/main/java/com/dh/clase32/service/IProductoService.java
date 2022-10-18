package com.dh.clase32.service;

import com.dh.clase32.entity.Producto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    List<Producto> listarProductos();
    Optional<Producto> buscarProductoXId(Long id);
    Producto registrarProducto(Producto producto);
    void eliminarProducto(Long id);
    Producto actualizarProducto(Producto producto);
}
