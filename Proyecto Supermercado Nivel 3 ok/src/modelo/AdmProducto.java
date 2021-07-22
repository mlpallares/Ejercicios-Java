package modelo;

import modelo.Producto;
import java.util.ArrayList;
import java.util.List;


public class AdmProducto {

	
  private List<Producto> lstProducto;
  
  
    //INICIALIZAR LA LISTA
  
  
     public AdmProducto() {
	  
	 this.lstProducto=new ArrayList <Producto>();
		  
		  
		  
     }


	public List<Producto> getLstProducto() {
		return lstProducto;
	}


	@Override
	public String toString() {
		return "AdmProducto [lstProducto=" + lstProducto + "]";
	}


	
	
	    //METODO AGREGAR PRODUCTO.-
	
	    public boolean agregarProducto(String producto, float precio) throws Exception {
		
		Producto existeProducto=traerProducto(producto);
		
		if(existeProducto!=null) {
			
			throw new Exception("El producto  "+producto+"ya existe en la lista");
			
		}
		
		int idProximoProducto=1;
		
		if(!lstProducto.isEmpty())
			
		idProximoProducto=lstProducto.get(lstProducto.size()-1).getIdProducto()+1;
		
		Producto productoagregado= new Producto(idProximoProducto,producto,precio);
		
		return lstProducto.add(productoagregado);
		
	    }	
			
		 
		  
		  
	  //METODO TRAER PRODUCTO POR IDPRODUCTO.-
	
	
	  public Producto traerProducto(int idProducto) {
		 
		 
      int i=0;
     
      boolean encontrado=false;
     
      Producto p=null;
     
     
      while (i<lstProducto.size() && !encontrado) {
    	 
    	 if(lstProducto.get(i).getIdProducto()==idProducto) {
    		 
    		 encontrado=true;
    		 
    		 p=lstProducto.get(i);
    		 
    	 }
    	 
    	 i++;
    	 
     }
     
     
     return p;
     
	 }
    		 
    		 
    	
    	 
    	 
     
       //METODO TRAER PRODUCTO POR STRING PRODUCTO


        public Producto traerProducto(String producto) {
	 
	 
        int i=0;

        boolean encontrado=false;

        Producto p=null;


        while (i<lstProducto.size() && !encontrado) {
	 
	    if(lstProducto.get(i).getProducto().equals(producto)) {
		 
		 encontrado=true;
		 
		 p=lstProducto.get(i);
		 
	 }
	 
	 i++;
	 
}


return p;

}
		 
		
        
        //METODO ELIMINAR PRODUCTO POR ID PRODUCTO.-
        
        public boolean eliminarProducto(int idProducto) throws Exception{
        
        Producto existeProducto=traerProducto(idProducto);
        
        if(existeProducto==null) 
        	
        
       	throw new Exception("El producto cuyo id es:  "+idProducto+" no se puede eliminar, no existe en la Lista");
        			
                      
        
        return lstProducto.remove(existeProducto);
        
        
        
        }
        
        
        

        //METODO MODIFICAR PRODUCTO POR ID PRODUCTO.-
        //Modificar el producto: traer producto por id, si no existe el objeto levantar la excepción, de lo contrario volver setear producto y precio.
       
        public boolean modificarProducto(int idProducto, String producto, float precio) throws Exception{
        	
        Producto existeProducto=traerProducto(idProducto);
        
        if(existeProducto==null) 
        	
        	throw new Exception("El producto cuyo id es:  "+idProducto+" no se puede modificar, no existe en la Lista");
        	
        
        
        existeProducto.setProducto(producto);
        existeProducto.setPrecio(precio);
        
        
        return true;
        
        
        
        
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
        
        
        	
        	
        	
        }
        
        
        
        
        
        
        




        
        
	 
	 

     
		 
		 
		 
		 
	
	
	  
	  
	  
	  
  

  
  
	
	
	
	
	


