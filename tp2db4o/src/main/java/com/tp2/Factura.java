package com.tp2;

import com.tp2.Cliente;
// Factura.java
public class Factura {
    private int nro;
    private Cliente cliente;
    private double importe;

    public Factura(int nro, Cliente cliente, double importe) {
        this.nro = nro;
        this.cliente = cliente;
        this.importe = importe;
    }
}
