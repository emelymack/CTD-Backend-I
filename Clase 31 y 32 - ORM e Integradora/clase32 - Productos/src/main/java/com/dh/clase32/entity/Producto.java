package com.dh.clase32.entity;

import javax.persistence.*;

@Entity
public class Producto {

    @Id
    //@SequenceGenerator(name="producto_sequence", initialValue = 1, allocationSize = 1) //allocationSize == en cuánto se va a incrementar el n° del id cuando se generen nuevas filas
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    //si se coloca la anotación @Id en algún atributo, por defecto el resto de los atributos
    //se identifican como Columns
    @Column
    private String nombre;
    @Column
    private int cantidad;
    @Column
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
