package com.tp2jpaActividad2;

// import controllers.clienteController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ClienteView {
	public static void main(String[] args)throws IOException {
		BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("corriendo");
        int opcion ;
        while((opcion = menu(bufer)) != 0)
        {
        	switch(opcion)
        	{
        	case 1 : {
        		       altaCliente(bufer);
		               break;
        	         }
        	case 2 :
        	         {
 		               bajaCliente(bufer);
	                   break;
 	                 }
			case 3 :
	                 {
	                   modificaCliente(bufer);
                       break;
                     }
	
			case 4 :
			        {
				      consultaCliente(bufer);
			          break;
                    }
			}
        }
        System.out.println(" Salida del Menu ");
	}

	
	public static void altaCliente(BufferedReader bufer) throws IOException
	{
		
		System.out.println(" 1 - Alta Cliente ");
		System.out.println(" Ingrese id  ");
		String id = bufer.readLine();
		System.out.println(" Ingrese nombre  ");
		String nombre = bufer.readLine();
		System.out.println(" Ingrese codloc  ");
		String codloc = bufer.readLine();
	    String unUsuario = new ClienteController().createCliente(Integer.parseInt(id),nombre,Integer.parseInt(codloc));
	    System.out.println(unUsuario);
	}
	
	public static void bajaCliente(BufferedReader bufer)throws IOException
	{
		
		System.out.println(" 2 - Baja Cliente ");
		System.out.print(" Ingrese id  ");
		String id = bufer.readLine();
		String respuesta = new ClienteController().consultaCliente(Integer.parseInt(id));
		if (respuesta == "Si") {
    		String unUsuario = new ClienteController().borrarCliente(Integer.parseInt(id),"", 0);
    		System.out.println(unUsuario);
		}
		else {
			System.out.println("No Existe id " + id);
		}
	}
	
	public static void modificaCliente(BufferedReader bufer)throws IOException
	{
	
		System.out.println(" 3 - Modifica Cliente ");
		System.out.print(" Ingrese id  ");
		String id = bufer.readLine();
		String respuesta = new ClienteController().consultaCliente(Integer.parseInt(id));
		if (respuesta == "Si") {
			System.out.print(" Ingrese nombre  ");
			String nombre = bufer.readLine();
			System.out.print(" Ingrese codloc  ");
			String codloc = bufer.readLine();
			String unUsuario = new ClienteController().modificarCliente(Integer.parseInt(id),nombre,Integer.parseInt(codloc));
    		System.out.println(unUsuario);
		}
		else {
			System.out.println("No Existe id " + id);
		}
	}
		
	public static void consultaCliente(BufferedReader bufer)throws IOException
	{
		
		System.out.println(" 4 - Consulta Cliente ");
		System.out.print(" Ingrese id  ");
		String id = bufer.readLine();
		String respuesta = new ClienteController().consultaCliente(Integer.parseInt(id));
		if ( respuesta == "No" && Integer.parseInt(id) == 0)
			System.out.println("No Hay Clientes ");
		else	
	                                    System.out.println("No Existe Cliente "+ id);
	}
	
	public static int menu(BufferedReader bufer)throws IOException
	{
		System.out.println("MENU DE OPCIONES");
		System.out.println(" 1 - Alta Cliente ");
		System.out.println(" 2 - Baja Cliente ");
		System.out.println(" 3 - Modifica Cliente ");
		System.out.println(" 4 - Consulta Cliente ");
		System.out.println(" 0 - Salir ");
		System.out.println(" Ingrese opcion  ");
		String opcion = bufer.readLine();
		return Integer.parseInt(opcion) ;
	}
}


