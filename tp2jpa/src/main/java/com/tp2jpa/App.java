package com.tp2jpa;

//import javax.persistence.*;
import javax.persistence.*;

public class App {

    public static void main(String[] args) {
        System.out.println("INICIO DEL PROGRAMA" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp2PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

		// ya fue corrido
        //Cliente c = new Cliente(1, "Pedro");
        //em.persist(c);
        //Factura f = new Factura(100, c, 999.0);
        //em.persist(f);
        //em.getTransaction().commit();

        // Consulta
        System.out.println("inicio de la lista" );
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);

        for (Cliente cli : query.getResultList()) {
            System.out.println(cli.getDescr());
        }
        System.out.println("fin de la lista" );

        em.close();
        emf.close();
		System.out.println("FIN DEL PROGRAMA" );
    }
}
