package Test;


import modelo.AdmProducto;
import modelo.AdmCarrito;
import modelo.AdmCliente;
import modelo.Carrito;
import modelo.Cliente;
import modelo.ItemCarrito;
import java.util.GregorianCalendar;
import java.util.Calendar;


public class TestAdmProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AdmProducto supermercado= new AdmProducto();
		
		//AGREGAR PRODUCTO.-
		
		try {
		supermercado.agregarProducto("Fideos", 4);
		supermercado.agregarProducto("Azucar", 3);
		supermercado.agregarProducto("Leche", 2);
		supermercado.agregarProducto("Luna", 1);
		
		}
		
		catch(Exception e) {
			
			System.out.println("Excepcion:   "+e.getMessage());
			
		}
		
		System.out.println(supermercado.getLstProducto());
		
		
		//TRAER PRODUCTO.-

	    supermercado.traerProducto(1);
	
	    System.out.println(supermercado.traerProducto(1));
		
		
	

	
	  //MODIFICAR PRODUCTO.-
	try {
		
	  supermercado.modificarProducto(1, "Medialunas", 5);
      supermercado.modificarProducto(8, "Medialunas", 5);
      
	  
	}

	   
	catch(Exception e) {
		
		System.out.println("Excepcion:   "+e.getMessage());
		
	
}
	System.out.println(supermercado.getLstProducto());
	
	
	
	 //ELIMINAR PRODUCTO.-
	
	try {
	
	    supermercado.eliminarProducto(8);
		  
	
	}

	   
	catch(Exception e) {
		
		System.out.println("Excepcion:   "+e.getMessage());
		
	
}
	System.out.println(supermercado.getLstProducto());
	


	
	AdmCliente cliente= new AdmCliente();
	
	//AGREGAR CLIENTE.-
	
	try {
	    cliente.agregarCliente("Laura", 20415617, "Melo 3787");
		cliente.agregarCliente("Lola", 19870416, "loria 321");
		cliente.agregarCliente("Lorena", 18560324, "Lomas 2018");
		
		}
		
		catch(Exception e) {
			
			System.out.println("Excepcion:   "+e.getMessage());
			
		}
		
		System.out.println(cliente.getLstCliente());

	
		//TRAER CLIENTE.-

	    cliente.traerCliente(1);
	
	    System.out.println(cliente.traerCliente(1));
		
		
	

	
	  //ELIMINAR CLIENTE
	    
	//try {
		
	  //cliente.eliminarCliente(3);
	//}

	   
	//catch(Exception e) {
		
		//System.out.println("Excepcion:   "+e.getMessage());
		
	
//}
	//System.out.println(cliente.getLstCliente());
	
	
	AdmCarrito car= new AdmCarrito();
	
	
	try {//cuando una clase carrito, tiene dentro una lista itemCarrito se agrega y se trae en bloque.- no poner dos agregar carritos juntos.-
	
    car.agregarCarrito(new GregorianCalendar(2017,10,9,00,00,00), cliente.traerCliente(1));
	
	int idUltimoCarrito=car.getLstCarrito().get(car.getLstCarrito().size()-1).getIdCarrito();
    car.traerCarrito(idUltimoCarrito).agregarItemCarrito(supermercado.traerProducto(1), 2);
    car.traerCarrito(idUltimoCarrito).agregarItemCarrito(supermercado.traerProducto(2), 3) ;
    car.traerCarrito(idUltimoCarrito).agregarItemCarrito(supermercado.traerProducto(2), 3) ;//aca es el mismo producto y le suma la cantidad.-
	
    
    
    car.agregarCarrito(new GregorianCalendar(2017,11,10,00,00,00), cliente.traerCliente(2));
	
	int idUCarrito=car.getLstCarrito().get(car.getLstCarrito().size()-1).getIdCarrito();
    
    car.traerCarrito(idUCarrito).agregarItemCarrito(supermercado.traerProducto(1), 1);
    car.traerCarrito(idUCarrito).agregarItemCarrito(supermercado.traerProducto(2), 3) ;
	
    
    
	
	}
	
	catch(Exception e) {
	
			System.out.println("Excepcion:   "+e.getMessage());
			e.printStackTrace();
    		
			  
	  
	}
	
	
			System.out.println(car.getLstCarrito());
			
			
			  try {
	
			  System.out.println("Cantidad total para el Cliente con el id 1: "+car.calcularTotal(cliente.traerCliente(1)));
			  
			  System.out.println("Cantidad total para el Cliente con el DNI 20415617:   "+car.calcularTotal(20415617));
			  
			  System.out.println("Cantidad total para el Cliente con fecha de inicio y fecha de fin:   "+car.calcularTotal(new GregorianCalendar(2017,10,9,00,00,00),(new GregorianCalendar(2017,10,11,00,00,00))));//preguntar.- 
			  
			  System.out.println("Cantidad total para el Cliente con fecha del cliente id1: "+car.calcularTotal(new GregorianCalendar(2017,10,9,00,00,00)));
			  
			  System.out.println("Cantidad total para el Cliente con mes y año: "+car.calcularTotal(10, 2017));
			  
			  System.out.println("Cantidad total para el Cliente por fecha y cliente: "+car.calcularTotal(new GregorianCalendar(2017,10,9,00,00,00), cliente.traerCliente(1)));


			  
			  }
				
				catch(Exception e) {
				
						System.out.println("Excepcion:   "+e.getMessage());
						
				}
	
	
	
	
}

}

	
	

	
	
