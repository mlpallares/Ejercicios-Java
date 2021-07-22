package consultorio;

public class Medico {/* MARZO 2019 */
	
	private String nombre;
	private String apellido;
	private String especialidad;
	
	
	public Medico(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Medico(String nombre, String apellido, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
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
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad + "]";
	}
	public String traerNombreCompleto(){
		return this.nombre+" "+this.apellido;
	}
	
	public float calcularIMC(Paciente paciente) {
		float imc=(float)(paciente.getPeso()/Math.pow(paciente.getEstatura(), 2));
		return imc;
		}

}
