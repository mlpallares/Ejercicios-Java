package modelo;

import java.time.LocalDate;

public class Persona {

	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaNacimiento;
	
	public Persona ( String nombre , String apellido , long dni ,
	LocalDate fechaNacimiento ) {
	this . nombre = nombre;
	this . apellido = apellido;
	this . dni = dni;
	this.setFechaNacimiento(fechaNacimiento);
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento){
		LocalDate fecha=LocalDate.now();
		int diaNto=fechaNacimiento.getDayOfMonth();
		int mesNto=fechaNacimiento.getMonthValue();
		int diaHoy=fecha.getDayOfMonth();
		int mesHoy=fecha.getMonthValue();
		if(diaNto>diaHoy || mesNto>mesHoy) {
			this.fechaNacimiento=fechaNacimiento.plusYears(1);
		}else
			this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}


	public int calcularEdad (){
	LocalDate fecha= LocalDate.now();
	return fecha.getYear()-fechaNacimiento.getYear();
	}
	
}
