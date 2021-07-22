package modelo;

import modelo.Punto;

public class Circulo {/*ABRIL 2019 */

	private double radio;
	private Punto origen;

	public Circulo(Punto origen, double radio) {
		this.radio = radio;
		this.origen = origen;
	}

	public Circulo(Punto origen, Punto radio) {
		this.setRadio(radio);
		this.origen = origen;
	}
	/* En el constructor se llama al set, ya que si quiero modificar los valores es mejor hacerlo desde el set 
	 * que desde el constructor, ya que muchas veces el constructor puede estar sobrecargado,
	 * lo que implicaria hacer muchas mas modificaciones.
	 * EJEMPLO AL FINAL DE LA CLASE..
	 */

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void setRadio(Punto radio) {
		/*La distancia se puede realizar de dos maneras desde el origen como figura en el setRadio
		o desde el radio como está comenteriado*/
		this.radio= origen.calcularDistancia(radio);
		//	this.radio= radio.calcularDistancia(origen);
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public boolean equals(Circulo c) {
		return ((origen == c.getOrigen()) && (radio == c.getRadio()));
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", origen=" + origen + "]";
	}

	// ***********************************
	// METODOS
	// ***********************************

	// 1-CALCULAR EL PERIMETRO (Pi POR DIAMETRO)
	public double calcularPerimetro() {
		return Math.PI * 2 * radio;
	}

	// 2-CALCULAR AREA (Pi POR RADIO AL CUADRADO)
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	// 3-CALCULAR LA DISTANCIA ENTRE EL CENTRO DE DOS CIRCULOS
	/* UN SOLO OBJETO PUNTO ASIGNADO A DOS OBJETOS CIRCULO
	 * no creo un nuevo objeto(new) punto ya que ocupa mas memoria. Utilizo
	 * variables... Se llama al get siempre para que no mdifique los
	 * atributos del objeto
	 */
	public double calcularDistancia(Circulo c) {

		Punto p1 = c.getOrigen();// Punto(origen) del circulo que se ingresa por parametro
		Punto p2 = origen;// Origen del objeto actual.
		double resultado = p2.calcularDistancia(p1);
		return resultado;
	}

	// DOS CIRCULOS CONCENTRICOS CON EL MISMO PUNTO.-
	public void moverCirculo(double desplazamientoX, double desplazamientoY) {
		origen.mover(desplazamientoX, desplazamientoY);
	}

	// QUIERO CAMBIAR EL PUNTO DE UN CIRCULO, SIN MODIFICAR EL OTRO.
	// Hacemos una copia del origen para no modificar el atributo de la clase
	public void moverCirculo2(double desplazamientoX, double desplazamientoY) {		
		Punto nuevoOrigen = new Punto(origen.getX(), origen.getY());
		// Asignamos el nuevo Origen de este circulo.-
		origen = nuevoOrigen;
		origen.mover(desplazamientoX, desplazamientoY);
	}

}// FIN CLASE..

/*EJEMPLO----CONSTRUCTORES
 * public Circulo(Punto origen, Punto radio) {
		this.radio = Math.sqrt(Math.pow(origen.getX() - radio.getX(), 2)
				+ Math.pow(origen.getY() - radio.getY(), 2));
		this.origen = origen;
	}

	public Circulo(Punto origen, Punto radio,int i) {
		this.radio = Math.sqrt(Math.pow(origen.getX() - radio.getX(), 2)
				+ Math.pow(origen.getY() - radio.getY(), 2));
		this.origen = origen;
		}

		SI QUISIERA HACER ALGUNA MODIFICACION EN RADIO, TENDRIA QUE MODIFICAR EL RESTO
		DE LOS CONSTRUCTORES..
 *
 *
 */
