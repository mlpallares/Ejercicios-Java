package modelo;

public class ItemCarrito {

	private int idItemCarrito;

	private Producto producto;

	private int cantidad;

	public ItemCarrito(int idItemCarrito, Producto producto, int cantidad) {
		super();
		this.idItemCarrito = idItemCarrito;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public ItemCarrito() {}




	public int getIdItemCarrito() {
		return idItemCarrito;
	}

	public void setIdItemCarrito(int idItemCarrito) {
		this.idItemCarrito = idItemCarrito;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ItemCarrito [idItemCarrito=" + idItemCarrito + ", producto=" + producto + ", Cantidad=" + cantidad + "]";
	}





	     public boolean equals (ItemCarrito i) {
		
		
		return(i.getIdItemCarrito()==idItemCarrito);
		
		
	}
	     
	     
	      //METODO CALCULAR SUBTOTAL.-
		
	       public float calcularSubtotal() {
		
		   float subtotal=0;
		   
		   subtotal=cantidad*producto.getPrecio();
		   
	       
	       
	       return subtotal;
	       
		
		
	}
		

		
		

		
		
		
		
	}

	
	
	

