package com.example;

abstract class Libro implements Cloneable {
    protected String titulo;
    protected double precio;


    public Libro(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }


    public String getTitulo() {
        return titulo;
    }


    public double getPrecio() {
        return precio;
    }


    @Override
    public Libro clone() throws CloneNotSupportedException {
        return (Libro) super.clone();
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", precio: " + precio;
    }
    
}
