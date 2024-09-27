package com.example;

import java.util.ArrayList;
import java.util.List;

public class RegistroVentas {
    private static RegistroVentas instancia;
    private List<Factura> facturas = new ArrayList<>();

    private RegistroVentas() {}

    public static RegistroVentas getInstance() {
        if (instancia == null) {
            instancia = new RegistroVentas();
        }
        return instancia;
    }

    public void registrarVenta(Factura factura) {
        facturas.add(factura);
        System.out.println("Venta registrada: \n" + factura);
    }

    public void mostrarVentas() {
        System.out.println("Todas las ventas:");
        for (Factura factura : facturas) {
            System.out.println(factura);
        }
    }
}
