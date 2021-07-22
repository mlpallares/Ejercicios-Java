package modelo;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import modelo.ItemCarrito;


public class Carrito {

	private int idCarrito;
	
	private GregorianCalendar fechaHora;
	
	private List<ItemCarrito>lstItem;
	
	private Cliente cliente;


    public Carrito(int idCarrito, GregorianCalendar fechaHora, Cliente cliente) {
 		
	this.idCarrito = idCarrito;
	this.fechaHora = fechaHora;
	this.lstItem = new ArrayList <ItemCarrito>();
	this.cliente = cliente;
	}
	
public Carrito() {}
	

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public List<ItemCarrito> getLstItem() {
		return lstItem;
	}

	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", fechaHora=" + fechaHora + ", lstItem=" + lstItem + ", cliente="
				+ cliente + "]";
	}

	
	//METODO AGREGAR ITEMCARRITO.- LO AGREGO EN LA LISTA ITEMCARRITO.-
	//agregarItem(Producto producto, int cantidad) : boolean
	//Cuando se agrega un producto al carrito si producto existe en algún item solo se incrementará la cantidad
	//de lo contrario se agregará el item.

	
	 public boolean agregarItemCarrito(Producto producto, int cantidad) {
	
	 ItemCarrito itemCarrito = null;
			
	 int posicion = 0;

		while ((posicion < lstItem.size())) {
				
			if (lstItem.get(posicion).getProducto().equals(producto)) {
	                 
				itemCarrito=lstItem.get(posicion);
				
			}
			
			posicion++;
		}
		    
            boolean agregar=false;
		    
		    if(itemCarrito !=null){
		    	
		    	itemCarrito.setCantidad(itemCarrito.getCantidad()+cantidad);
			    
		    	agregar=true;
		   
		    }else{
		    	
		    	 int idProxItem=1;   
		    				     		
	             if(!lstItem.isEmpty())
	             
	             idProxItem=lstItem.get(lstItem.size()-1).getIdItemCarrito()+1;
	            
	             agregar=lstItem.add(new ItemCarrito(idProxItem,producto,cantidad));
	         		   		
			    }   		
	    		 
		    return agregar;
	    }
  
	
	
		
	 //METODO ELIMINAR ITEMCARRITO.-
	 
	 //6) + eliminarItem (Producto producto, int cantidad) : boolean
	// En el caso de eliminar un producto del carrito si la cantidad es la misma se eliminará el item,
	 //si es menor se decrecerá la cantidad y de lo contrario, si no existe el ítem que contenga el producto lanzará una excepción
	 
	     public boolean eliminarItem (Producto producto, int cantidad)throws Exception {
		 
		 int i=0;
		 
		 ItemCarrito itemCarrito=null;
		 
		 while(i<lstItem.size() && itemCarrito==null) {
			 
			 if(lstItem.get(i).getProducto().equals(producto)) {
				 
				 itemCarrito=lstItem.get(i);
				 
			 }
			 
			 i++;
			 	 
	 }
		 

		 boolean eliminar=false;
		
		 if(itemCarrito !=null && itemCarrito.getCantidad()>cantidad) {
			 
			 itemCarrito.setCantidad(itemCarrito.getCantidad()-cantidad);
			 
			 eliminar=false;
		 }
		 	 
		 else if(itemCarrito !=null && itemCarrito.getCantidad()==cantidad) {
			 
			   
				lstItem.remove(itemCarrito);
							    
				eliminar=true;
			    
		 }else {
			 		 
				if(itemCarrito==null) 
				
									
					throw new Exception ("ItemCarrito del producto:    "+producto+" no se puede eliminar, no existe en la lista");
				  
		 }
		 
				   return eliminar;
				
		 }
		
	 
		
	 //METODO CALCULAR TOTAL DE TODOS LOS ITEMS.-
	 
     public float calcularTotal() {
    
	   
     float total=0; 
    
           
     for(int i=0;i<lstItem.size();i++) 	{
   	   
   	 
     float subtotal=lstItem.get(i).calcularSubtotal();
    
      
  	 total=total+subtotal;
    
    }	   
    
     
     
    return total;
    
    }
    
	 
}


			 
	 		 
			 
		 
		 
		 
		 
		 
	 	 
		 
		 
		 
		 
	 
		 
		 
		 
			 
			 
			 
			 
			 
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 
	 
		 
		 
		 
		 
		 
		 
	 
		
	
	
	 


		
		
	
	
	
	
			
			
			
			
			
		
		
		
	 
	 

		
	
		
		
		
		
		
		
	 
	
	
	
	
	


	
	

