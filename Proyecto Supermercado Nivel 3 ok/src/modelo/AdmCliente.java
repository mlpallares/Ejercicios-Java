package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.AdmCarrito;
import modelo.Carrito;

public class AdmCliente {

private List <Cliente>lstCliente;



    //INICIALIZAR LA LISTA CLIENTE.- public nombre de la clase(){

     public AdmCliente() {
	  
	 this.lstCliente=new ArrayList<Cliente>(); 
	  
	  
	  
  }


	public List<Cliente> getLstCliente() {
		return lstCliente;
	}



	@Override
	public String toString() {
		return "AdmCliente [lstCliente=" + lstCliente + "]";
	}


	//METODO AGREGARCLIENTE.-
	
	 public boolean agregarCliente(String cliente, long dni, String direccion) throws Exception{
		
	 Cliente existeCliente=traerCliente(cliente);
	 
	 if(existeCliente!=null) {
		 
		 
		 throw new Exception("El cliente: "+cliente+" ya existe en la lista");
		 
	 }
	 
	 int idProximoCliente=1;
	 
	 if(!lstCliente.isEmpty())
		 
     idProximoCliente=lstCliente.get(lstCliente.size()-1).getIdCliente()+1;		 
	 
	 Cliente clienteAgregado= new Cliente(idProximoCliente, cliente,dni,direccion);
	 
		return lstCliente.add(clienteAgregado);
		
		
		
	}
	
	
	
	
	//METODO TRAERCLIENTE POR IDCLIENTE.-
	
	
	public Cliente traerCliente(int idCliente) {
		
	int i=0;
	
	boolean encontrado=false;
	
	Cliente c=null;
	
	
	while(i<lstCliente.size() && !encontrado) {
		
		if(lstCliente.get(i).getIdCliente()==idCliente) {
			
			encontrado=true;
			
			c=lstCliente.get(i);
			
			
		}
		
		i++;
		
	}
	
	return c;
	
	
	}
	
	
	   //METODO TRAERCLIENTE POR STRING CLIENTE;
	
	   public Cliente traerCliente(String cliente) {
		
		int i=0;
		
		boolean encontrado=false;
		
		Cliente c=null;
		
		
		while(i<lstCliente.size() && !encontrado) {
			
			if(lstCliente.get(i).getCliente().equals(cliente)){
				
				encontrado=true;
				
				c=lstCliente.get(i);
				
				
			}

            i++;
            
		}
		
		return c;
		
	   }
	   
	  // 10) +eliminarCliente(int idCliente): boolean
	  // Si el cliente no existe o tiene algún carrito se debe levantar una excepción.
	   
	   //PREGUNTAR COMO USAR UNA LISTA DE OTRA CLASE PARA BUSCAR CLIENTE EN EL CARRITO.-!!!!!
	   
	      	   
	       
		  
		   public boolean eliminarCliente (int idCliente)throws Exception{
	    	   
		   Cliente existeCliente=traerCliente(idCliente);
		   		   
		   if(existeCliente==null) {
			   
			   throw new Exception ("El cliente con el ID:   "+idCliente+" no se puede eliminar no existe en la lista");
		 
		   }
		   

		   List<Carrito>existeCarrito= new Supermercado().getAdmCarrito().traerCarrito(existeCliente);
		   
		   if(existeCarrito!=null) {
			  
			   throw new Exception ("El cliente con el ID:   "+idCliente+" no se puede eliminar,tiene un carrito en la lista");  
			   
		   }
     	   
		   return	 lstCliente.remove(existeCliente);
	    	
	       }
	       


}        
	        
	        
	        
		    
	      
	       
	       
	      

	        
	    		
	    		
	    		 

	    	
	         
			   
			   
			   
			   
			   
		   
		   
		   
		   
		   
	   
	   
	   
	   
	   
	   
	   

		
			
			
			
			
			
			
			
			
		
		
		
		

	
		
		
		
		
		
		
	
	
	
    
	
	

