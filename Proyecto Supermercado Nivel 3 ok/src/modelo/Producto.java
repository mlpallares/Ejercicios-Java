package modelo;

public class Producto {

private int idProducto;
	
	private String producto;
	
	private float precio;

	public Producto(int idProducto, String producto, float precio) {
		super();
		this.idProducto = idProducto;
		this.producto = producto;
		this.precio = precio;
	}
	
	
	
	public Producto() {}



	public int getIdProducto() {
		return idProducto;
	}



	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}



	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", producto=" + producto + ", precio=" + precio + "]";
	}
	
	
	public boolean equals (Producto p) {
		
		
		return(p.getIdProducto()==idProducto);
		
		
	}
		
		
		
		
		
		
		
	}
	
	
	
	


	
	
	

