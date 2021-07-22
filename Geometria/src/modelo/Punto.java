package modelo;

public class Punto { /*MARZO 2019*/

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	//re-definicion de metodos de la clase Object---SOBRECARGA
	public boolean equals ( Punto p ){
		return (( x == p . getX ())&&( y == p . getY ()));
	}

	//re-definicion
	@Override
	public String toString (){
		return "(" + x + "," + y + ")";
	}

	//METODO 
	//CALCULAR LA DISTANCIA ENTRE DOS PUNTOS
	public double calcularDistancia (Punto p){
		double resultado_x= Math.pow(p.getX()-x, 2);
		double resultado_y= Math.pow(p.getY()-y, 2);
		return Math.sqrt(resultado_x+resultado_y);
	}


	public void mover ( double desplazamientoX , double desplazamientoY ){
		x = x + desplazamientoX ;
		y = y + desplazamientoY ;
	}



}//FIN..
