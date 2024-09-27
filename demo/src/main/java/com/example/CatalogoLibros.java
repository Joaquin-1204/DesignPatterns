package com.example;

import java.util.HashMap;
import java.util.Map;

public class CatalogoLibros {
    private Map<Integer, Libro> libros = new HashMap<>();

    public CatalogoLibros() {
        // Agregando 5 libros de ficción
        libros.put(1, new LibroFiccion("El Señor de los Anillos", 50.0));
        libros.put(2, new LibroFiccion("Harry Potter", 40.0));
        libros.put(3, new LibroFiccion("El Hobbit", 30.0));
        libros.put(4, new LibroFiccion("Juego de Tronos", 60.0));
        libros.put(5, new LibroFiccion("Cien Años de Soledad", 45.0));

        // Agregando 5 libros de no ficción
        libros.put(6, new LibroNoFiccion("Sapiens", 35.0));
        libros.put(7, new LibroNoFiccion("Educated", 28.0));
        libros.put(8, new LibroNoFiccion("Breve Historia del Tiempo", 42.0));
        libros.put(9, new LibroNoFiccion("El Gen", 50.0));
        libros.put(10, new LibroNoFiccion("El Poder del Hábito", 38.0));
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de libros disponibles:");
        for (Map.Entry<Integer, Libro> entry : libros.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public Libro obtenerLibro(int id) {
        return libros.get(id);
    }
}
