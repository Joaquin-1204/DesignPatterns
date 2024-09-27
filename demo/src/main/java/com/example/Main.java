package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Crear el catálogo de libros
        CatalogoLibros catalogo = new CatalogoLibros();
        catalogo.mostrarCatalogo();

        // Pedir nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        // Crear factura utilizando el patrón Builder
        Factura.FacturaBuilder facturaBuilder = new Factura.FacturaBuilder(nombreCliente);

        // Registrar libros seleccionados
        boolean seguirComprando = true;
        while (seguirComprando) {
            System.out.print("Ingrese el número del libro que desea comprar: ");
            int idLibro = scanner.nextInt();

            Libro libroSeleccionado = catalogo.obtenerLibro(idLibro);
            if (libroSeleccionado != null) {
                facturaBuilder.agregarLibro(libroSeleccionado);
                System.out.println("Libro agregado: " + libroSeleccionado);
            } else {
                System.out.println("Libro no encontrado.");
            }

            System.out.print("¿Desea seguir comprando? (sí/no): ");
            String respuesta = scanner.next();
            seguirComprando = respuesta.equalsIgnoreCase("si");
        }

        // Crear la factura final
        Factura factura = facturaBuilder.build();

        // Registrar la venta en el sistema (Singleton)
        RegistroVentas registro = RegistroVentas.getInstance();
        registro.registrarVenta(factura);

        // Mostrar todas las ventas
        registro.mostrarVentas();
    }
}