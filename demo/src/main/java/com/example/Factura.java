package com.example;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String cliente;
    private List<Libro> librosVendidos;
    private double total;

    private Factura(FacturaBuilder builder) {
        this.cliente = builder.cliente;
        this.librosVendidos = builder.librosVendidos;
        this.total = builder.total;
    }

    public static class FacturaBuilder {
        private String cliente;
        private List<Libro> librosVendidos = new ArrayList<>();
        private double total;

        public FacturaBuilder(String cliente) {
            this.cliente = cliente;
        }

        public FacturaBuilder agregarLibro(Libro libro) {
            librosVendidos.add(libro);
            total += libro.getPrecio();
            return this;
        }

        public Factura build() {
            return new Factura(this);
        }
    }

    @Override
    public String toString() {
        return "Factura para " + cliente + "\nLibros Vendidos: " + librosVendidos + "\nTotal: " + total;
    }
}
