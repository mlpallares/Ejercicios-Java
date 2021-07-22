package modelo;

import modelo.Carrito;
import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
import java.util.Calendar;
import modelo.ItemCarrito;

	
       public class AdmCarrito {

       private List <Carrito> lstCarrito;
		
		
       //INICIALIZO LA LISTA CARRITO.-
		
		public AdmCarrito() {
			
		this.lstCarrito=new ArrayList<Carrito>();
			
		}



		public List<Carrito> getLstCarrito() {
			return lstCarrito;
		}

		
		

		@Override
		public String toString() {
			return "AdmCarrito [lstCarrito=" + lstCarrito + "]";
		}


		//METODO AGREGAR CARRITO.-
		//agregarCarrito(GregorianCalendar fechaHora, cliente Cliente): boolean
		//Si el carrito existe en la lista levantar una excepción.
		
		public boolean agregarCarrito(GregorianCalendar fechaHora, Cliente cliente)throws Exception{
			
		int i=0;
		
		Carrito carrito=null;
		
		boolean encontrado=false;
		
		int idProximoCarrito=1;
		
		
		while(i<lstCarrito.size() && !encontrado) {
			
			carrito=lstCarrito.get(i);
			
		if(carrito.getCliente().equals(cliente)) {
			
			encontrado=true;
			
			throw new Exception("El carrito del cliente   "+cliente+" ya existe en la lista, no se puede agregar");
			
		}
		
		i++;
		
		}
		
		if(!lstCarrito.isEmpty())
			
		idProximoCarrito=lstCarrito.get(lstCarrito.size()-1).getIdCarrito()+1;
		
		Carrito agregarCarrito=new Carrito(idProximoCarrito,fechaHora,cliente);
		
		return lstCarrito.add(agregarCarrito);
		
		}	
			
			
		
		
		
		
		//METODO TRAER CARRITO.-
		//12) +traerCarrito(int idCarrito): Carrito
		//Si el carrito no existe devolver null.
		
		
		   public Carrito traerCarrito(int idCarrito) {
			   
		   int i=0;
		   
		   boolean encontrado=false;
		   
		   Carrito car=null;
		   
		   while(i<lstCarrito.size() && !encontrado) {
			   
			   if(lstCarrito.get(i).getIdCarrito()==idCarrito) {
				   
				   encontrado=true;
				   car=lstCarrito.get(i);
				   
			   }
			   
			   i++;
			   
		   }
		   
		   return car;
			   
			   
		   }	
		
		//13) +eliminarCarrito(int idCarrito): boolean
		//Si el carrito no existe en la lista levantar una excepción.
		
	  	public boolean eliminarCarrito(int idCarrito) throws Exception{
	  		
	  	Carrito existeCarrito=traerCarrito(idCarrito);
	  	
	  	if(existeCarrito==null) 
	  		
	  		
	  		throw new Exception("El carrito con el ID:   "+idCarrito+"no se puede eliminar, no existe en la lista");
	  		
	  		
	  	  lstCarrito.remove(existeCarrito);
	  	  
	  	  
	  	  return true;
	  	  
	  	  
	  	  
	  	}
	  	
	  	
	    // METODO CALCULAR TOTAL POR CLIENTE.-
	  	
	  	//14) +calcularTotal(Cliente cliente): float
	  	//Si el cliente no existe levantar una excepción.
	  	
	  	
	  	public float calcularTotal (Cliente cliente) throws Exception{//ok-
	  		
	  	float total=0;
	  	
	  	boolean encontrado=false;
	  	
	  	Carrito car=new Carrito();
	  	
	  	for(int i=0; i<lstCarrito.size();i++) {
	  		
	  		car=lstCarrito.get(i);
	  		
	  		if(car.getCliente().equals(cliente)) {
	  			
	  			total=lstCarrito.get(i).calcularTotal();
	  			
	  			encontrado=true;
	  			
	  		}
	  	}
	  		
	  	if(!encontrado) {
	  			
	  			throw new Exception ("El cliente  "+cliente+" no existe en la lista");
	  		
	  	}
	  		
	  			return total;
	  			
	  	}	
	  			
	  			
	  	
	  	//15) +calcularTotal(int dniCliente): float
	  	////Si el cliente no existe levantar una excepción.
	  	
	  	
	  	public float calcularTotal (int dniCliente)throws Exception{//ok.-
	  		
	  	float total=0;
	  	
	  	boolean encontrado=false;
	  	
	  	Carrito car=new Carrito();
	  	
	  	for(int i=0; i<lstCarrito.size();i++) {
	  		
	  	  car=lstCarrito.get(i);
	  	  
	  	  if(car.getCliente().getDni()==dniCliente) {
	  		  
	  		  encontrado=true;
	  		  
	  		  total=total+lstCarrito.get(i).calcularTotal();
	  		  
	  	  }
	  	  
	  	}
	  	
	  	if(!encontrado) {
	  		
	  		throw new Exception ("El cliente con el dni  "+dniCliente+" no existe en la lista");
	  		
	  	}
	  		
	  	
	  	
	  	
	  	return total;
	  	
	  	
	  	}
	  	
	  	
	    //16) +calcularTotal(GregorianCalendar fechaInicio, GregorianCalendar fechaFin): float

	  	 public float calcularTotal(GregorianCalendar fechaInicio, GregorianCalendar fechaFin){////verrrrr
	  	
	     float total=0;
	  	
	  	 @SuppressWarnings("unused")
		 boolean encontrado=false;
	  	
	  	 Carrito car=new Carrito();
	  	
	  	 for(int i=0; i<lstCarrito.size();i++) {
	  		
	  	  car=lstCarrito.get(i);
	  	  
	  	  if((car.getFechaHora().after(fechaInicio) || Funciones.sonFechasHorasIguales(fechaInicio, car.getFechaHora())) && (car.getFechaHora().before(fechaFin)|| Funciones.sonFechasHorasIguales(fechaFin, car.getFechaHora())))  {
	  		  
	  		  encontrado=true;
	  		  
	  		  total=total+lstCarrito.get(i).calcularTotal();
	  		  
	  	  }
	  	  
	  	}
	  	
	  	
	  	
	  	return total;
	  	
	}

	  	     //17) +calcularTotal(GregorianCalendar fecha): float
	  	
	  	     public float calcularTotal(GregorianCalendar fecha) {//ok.-
	  	  	
	  		 float total=0;
	  	  	
	  	  	 @SuppressWarnings("unused")
			 boolean encontrado=false;
	  	  	
	  	  	 Carrito car=new Carrito();
	  	  	
	  	  	 for(int i=0; i<lstCarrito.size();i++) {
	  	  		
	  	  	  car=lstCarrito.get(i);
	  	  	  
	  	  	  if(Funciones.sonFechasHorasIguales(fecha, car.getFechaHora())){
	  	  		    
	  	  	      encontrado=true;
	  	  		 
	  	  	      total=total+lstCarrito.get(i).calcularTotal();
	  	  		  
	  	  	  }
	  	  	  
	  	  	}

	        return total;
	        
	  	     }
	  	     
	  	       //18) +calcularTotal(int mes, int anio): float
	  	       //Si el mes es incorrecto (por ejemplo 23), levantar una excepción.
	  	  
	  	         public float calcularTotal(int mes, int anio)throws Exception {////VER.-
	  	  	  	
	    		 float total=0;
	    	  	
	   		     boolean encontrado=false;
	    	  	    	  	   	  	
	    	  	 for(int i=0; i<lstCarrito.size();i++) {
	    	  		
	    	  		if(mes>0 && mes<13){
	    	  			
	    	  			if(mes==lstCarrito.get(i).getFechaHora().get(Calendar.MONTH) && anio==lstCarrito.get(i).getFechaHora().get(Calendar.YEAR)){
	    				  
	    	  				total = total+lstCarrito.get(i).calcularTotal();
	    				    encontrado=true;
	    				}
	    			}
	    		}
	    		if(!encontrado)  throw new Exception("El mes ingresado "+mes+"es incorrecto.-");
	    		
	    		
	    		
	    		return total;
	    	  		}
	    	  	  
	    	  	  
	  	            // 19) +calcularTotal(GregorianCalendar fechaInicio, GregorianCalendar fechaFin, Cliente cliente): float
	  	    		// Si el cliente no existe levantar una excepción.//ver.-
	  	    		
	  	           	 		
	  	        	public float calcularTotal(GregorianCalendar fechaInicio,GregorianCalendar fechaFin, Cliente cliente)throws Exception{
	  	  		
	  	        	float total = 0;
	  	  			  	        	 	  			
	  	        	float total1=calcularTotal(fechaInicio,fechaFin);
	  	  			
	  	        	float total2=calcularTotal(cliente);
	  	  				
	  	  			
	  	        	if(total2 !=0){
	  	  			
	  	        		total = total+total1+total2;
	  	        		
	  	        	}
	  				
	  	  		if(total2 ==0) throw new Exception("Cliente no existe");
	  	  		
	  	  		return total;
	  	  		
	  	        	}
	  	  			 
	  	             
	  	        	 //20-CALCULAR TOTAL POR FECHA Y CLIENTE.- OK.-
	  	        	
	  	  		     public float calcularTotal(GregorianCalendar fecha, Cliente cliente)throws Exception{
	  	  			 
	  	  		   	 float total = 0;
	  	  			
	  	  		   	 float total1=calcularTotal(fecha);
	  	  			
	  	  		   	 float total2=calcularTotal(cliente);
	  	  				
	  	  				if(total2!=0){//TODO preguntar x float null
	  	  				
	  	  				
	  	  					total =total+ total1+total2;
	  	  				}
	  	  		if(total2 ==0) throw new Exception("Cliente no existe");
	  	  		
	  	  		return total;
	  	  		
	  	  		     }
	  	  		 

	  	    		 //21) +calcularTotal(int mes, int anio, Cliente cliente): float
	  	    		 //Si el cliente no existe y/o el mes es incorrecto levantar una excepción.
	  	  		     
	  	  		     
	  	  		    public float calcularTotal(int mes, int anio, Cliente cliente) throws Exception{
	  				float total = 0;
	  				float total1=calcularTotal(mes,anio);
	  				float total2=calcularTotal(cliente);
	  				
	  					if(total1 !=0 && total2 !=0){
	  					total = total1+total2 ;
	  				}
	  				
	  					if(total1 ==0 && total2==0) throw new Exception("Cliente no existe y el mes es incorrecto");

	  			return total;
	  			} 
	  	  		
	  	  		 //22) +calcularTotal(int mes, int anio, int dniCliente): float
	 	    	 //Si el cliente no existe y/o el mes es incorrecto levantar una
	 	         
	  	  		    public float calcularTotal(int mes, int anio, int dniCliente) throws Exception{
	  				
	  	  		    float total = 0;
	  				
	  	  		    float total1=calcularTotal(mes,anio);
	  				
	  	  		    float total2=calcularTotal(dniCliente);
	  				
	  					if(total1!=0 && total2!=0){
	  					total =total1+total2 ;
	  					}
	  				if(total1 ==0 && total2==0) throw new Exception("Cliente no existe y el mes es incorrecto");
	 
	 	           
	  				return total;
	  	  		}

	  	  		   //METODO DONDE HAGO UNA LISTA CARRITO QUE ME TRAE UN OBJETO CLIENTE Y LO COMPARO PARA UTILIZARLO EN OTRA CLASE  ADMCLIENTE EN ELIMINAR CLIENTE PARA NO ELIMINAR SI TIENE CARRITO.- 
	  	  		   //PUEDE TENER MAS DE UN CARRITO UN CLIENTE POR ESO SE HACE UNA LISTA.-
	  	  		    
	  	  		   public List <Carrito> traerCarrito(Cliente cliente) {
	  			   		   			  	   	   
	  			  	   
	  			   List <Carrito> clienteTieneCarrito = new ArrayList<Carrito> ();
	  			   
	  			  
	  			   for(int i=0;i<lstCarrito.size();i++) {
	  			
	  				 
	  				   if(lstCarrito.get(i).getCliente().equals(cliente)){
	  				   
	  				   
	  					 clienteTieneCarrito.add(lstCarrito.get(i));
	  				   
	  			    		   }
	  			   }
	  			   
	  		   return  clienteTieneCarrito;
	  			   
	  			   
	  		   }	
	  	   
	  	  		   
	  	  		   
	  	  		   
	  	  		   
	  	   
	  	  		   } 
			   
	  				   
	  	  
	  	  		    
	  	  		       
	  	         
	  	         
	  	    	
	  	    		 
	  	    		 
	  	         
	        





	  	
	  	
	  	
	  	
	  	
	  	
	  	





	  		
	  	
	  		  
	  		  
	  		  
	  		  
	  		  
	  		  
	  		  
	  		  
	  	  
	  	  
	  	  
	  	  
	  		
	  		
	  		
	  		
	  	
	  	
	  	
	  		
	  		
	  		
	  		
	  	
	  	
	  			
	 
	    
	  			
	  			
	  			
	  			
	  			
	  			
	  			
	  			
	  			
	  		
	  		
	  		
	  	
	  	
	  		
	  		
	  		
	  	
	  	
	  	
	  		
	  		
	  	















































	
			
		
	
	
	
	
	
	
	
	

