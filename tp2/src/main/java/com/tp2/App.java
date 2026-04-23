package com.tp2;

import com.db4o.*;
import com.db4o.query.*;
import com.tp2.Cliente;
import com.tp2.Factura;

public class App{
    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        ObjectContainer db = Db4oEmbedded.openFile("tp2.db4o");

        Cliente c1 = new Cliente(1, "Juan");
        Factura f1 = new Factura(100, c1, 500.0);

        db.store(c1);
        db.store(f1);

        Query query = db.query();
        query.constrain(Cliente.class);

        ObjectSet<Cliente> result = query.execute();

        for (Cliente c : result) {
            System.out.println(c.getDescr());
        }

        db.close();
        System.out.println( "Adios World!" );
    }
}
