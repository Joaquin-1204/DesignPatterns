package com.example;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear un prototipo de Círculo
            Circulo circuloOriginal = new Circulo(5);
            Circulo circuloClon = (Circulo) circuloOriginal.clone();
            
            // Crear un prototipo de Rectángulo
            Rectangulo rectanguloOriginal = new Rectangulo(10, 20);
            Rectangulo rectanguloClon = (Rectangulo) rectanguloOriginal.clone();

            // Modificar el clon para demostrar que es una copia independiente
            circuloClon.setRadio(10);
            rectanguloClon.setAlto(15);

            // Mostrar los objetos originales y sus clones
            System.out.println("Círculo Original: " + circuloOriginal);
            System.out.println("Círculo Copia: " + circuloClon);

            System.out.println("Rectángulo Original: " + rectanguloOriginal);
            System.out.println("Rectángulo Copia: " + rectanguloClon);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}