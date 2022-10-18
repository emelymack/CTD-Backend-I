package com.example.demo.entity;

public class Jugador {
    private String nombre;
    private int nroCamiseta;

    public Jugador() {
    }

    public Jugador(String nombre, int nroCamiseta) {
        this.nombre = nombre;
        this.nroCamiseta = nroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }
}
