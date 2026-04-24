
package com.tp2jpaActividad2;

//import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


//import com.tp2jpaActividad2.Cliente;

public class ClienteController {
  public String createCliente(int id, String nombre,int codloc){
	  SessionFactory sessionFactory = new 
			  Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
	  Session session = sessionFactory.openSession();
	  try {
		  
		  Cliente unCliente = new Cliente(id,nombre,codloc);
		  session.beginTransaction();
		  session.persist(unCliente);
		  session.getTransaction().commit();
		  sessionFactory.close();
		  return "Cliente Creado !!!";
	  }
	  catch(Exception e)
	    {e.printStackTrace();}
	  return "Alta ERROR... !!!";
  }
  
  public String borrarCliente(int id,String nombre,int codloc){
	  SessionFactory sessionFactory = new 
			  Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
	  Session session = sessionFactory.openSession();
	  try {
		  
		  Cliente unCliente = new Cliente(id,nombre,codloc);
		  session.beginTransaction();
		  session.remove(unCliente);
		  session.getTransaction().commit();
		  sessionFactory.close();
		  return "Cliente Borrado !!!";
	  }
	  catch(Exception e)
	    {e.printStackTrace();}
	  return "Baja ERROR... !!!";
  }
  
  public String modificarCliente(int id,String nombre,int codloc){
	  SessionFactory sessionFactory = new 
			  Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
	  Session session = sessionFactory.openSession();
	  try {
		  
		  Cliente unCliente = new Cliente(id,nombre,codloc);
		  session.beginTransaction();
		  session.update(unCliente);
		  session.getTransaction().commit();
		  sessionFactory.close();
		  return "Cliente Modificado !!!";
	  }
	  catch(Exception e)
	    {e.printStackTrace();}
	  return "Modificar ERROR... !!!";
  }
  
  public String consultaCliente(int id){
	  String SALIDA = "";
	  SessionFactory sessionFactory = new 
			  Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
	  Session session = sessionFactory.openSession();
      try {
		  session.beginTransaction();
		  Query query ;
		  if (id == 0) {
		     query = session.createQuery("select id , nombre , codloc FROM Cliente");
		    }
		  else {
	         query = session.createQuery("select id , nombre , codloc FROM Cliente where id = " + Integer.toString(id));
	        }
          List<Object[]> list = query.list();
		  session.getTransaction().commit();  // commit SIEMPRE
          if (list.size() > 0) {
              for(Object[] o: list) {
                 System.out.println(o[0]+"\t"+o[1]+"\t"+o[2]);
              }
              //return "Si";
			  SALIDA = "Si";
          }
          else {     
             //return "No";
			 SALIDA = "No";
          }
      }
      catch(Exception e)
	    {e.printStackTrace();}
      sessionFactory.close();
	  //return "Consulta ERROR... !!!";
	  return SALIDA;
  }
}

