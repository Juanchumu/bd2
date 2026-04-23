package com.tp2jpa;

//import jakarta.persistence.*;
import javax.persistence.*;

@Entity
@Table(name = "FACTURA")
public class Factura {

    @Id
    private int nro;

    @ManyToOne
    @JoinColumn(name = "id")
    private Cliente cliente;

    private double importe;

    public Factura() {}

    public Factura(int nro, Cliente cliente, double importe) {
        this.nro = nro;
        this.cliente = cliente;
        this.importe = importe;
    }
}
