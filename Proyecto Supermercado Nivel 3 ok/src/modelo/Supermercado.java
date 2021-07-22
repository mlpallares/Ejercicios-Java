package modelo;

import modelo.AdmCliente;
import modelo.AdmProducto;
import modelo.AdmCarrito;

public class Supermercado {

	private AdmProducto admProducto;//LA LISTA DE PRODUCTO EN ADMPRODUCTO.-
	
	private AdmCliente admCliente;
	
	private AdmCarrito admCarrito;

	
	    //CONSTRUCTOR QUE INSTANCIA OBJETO NUEVO PARA UTILIZAR LISTA DE CARRITO EN OTRA CLASE, COMO LA DE ELIMINAR CLIENTE;
	
	    public Supermercado() {
		
		
		this.admProducto = new AdmProducto();//INSTANCIA NUEVA PARA PODER TRABAJAR CON LA LISTA DE PRODUCTO EN OTRA CLASE.-
		this.admCliente = new AdmCliente ();
		this.admCarrito = new AdmCarrito();
	}


		public AdmProducto getAdmProducto() {
			return admProducto;
		}


		public AdmCliente getAdmCliente() {
			return admCliente;
		}

		public AdmCarrito getAdmCarrito() {
			return admCarrito;
		}

		


		@Override
		public String toString() {
			return "Supermercado [admProducto=" + admProducto + ", admCliente=" + admCliente + ", admCarrito="
					+ admCarrito + "]";
		}


		

		
	
	
}
