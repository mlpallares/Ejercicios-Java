package modelo;

import java.time.LocalDate;

public class Ceta {
	
	private int idCeta;
	private LocalDate fecha;
	private Contribuyente vendedor;
	private Contribuyente comprador;
	private double valorDeTransferencia;
	private boolean firmaComprador;
	
	
	public Ceta(int idCeta, LocalDate fecha, Contribuyente vendedor, Contribuyente comprador,
			double valorDeTransferencia, boolean firmaComprador)throws Exception {

		this.idCeta = idCeta;
		this.setFecha(fecha);
		this.vendedor = vendedor;
		this.comprador = comprador;
		this.valorDeTransferencia = valorDeTransferencia;
		this.firmaComprador = firmaComprador;
	}
	public int getIdCeta() {
		return idCeta;
	}
	public void setIdCeta(int idCeta) {
		this.idCeta = idCeta;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) throws Exception {//validar fecha que no sea posterior al dìa de hoy
		/*  Si fecha es posterior a fecha1, after devolverá true. De lo contrario, devolverá false.
		 * Si date1 es anterior a date2, before devolverá true. De lo contrario, devolverá false
		 * date1.before(date2)); //muestra true */
		LocalDate fechaActual=LocalDate.now();
		 if ((fecha.isAfter(fechaActual)==true)) throw new Exception("La fecha no puede ser posterior");
		 else this.fecha=fecha;	
	}
		
	public Contribuyente getVendedor() {
		return vendedor;
	}
	public void setVendedor(Contribuyente vendedor) {
		this.vendedor = vendedor;
	}
	public Contribuyente getComprador() {
		return comprador;
	}
	public void setComprador(Contribuyente comprador) {
		this.comprador = comprador;
	}
	public double getValorDeTransferencia() {
		return valorDeTransferencia;
	}
	public void setValorDeTransferencia(double valorDeTransferencia) {
		this.valorDeTransferencia = valorDeTransferencia;
	}
	public boolean isFirmaComprador() {
		return firmaComprador;
	}
	public void setFirmaComprador(boolean firmaComprador) {
		this.firmaComprador = firmaComprador;
	}
	@Override
	public String toString() {
		return "Ceta [idCeta=" + idCeta + ", fecha=" + fecha + ", vendedor=" + vendedor + ", comprador=" + comprador
				+ ", valorDeTransferencia=" + valorDeTransferencia + ", firmaComprador=" + firmaComprador + "]";
	}
	

}//FIN
