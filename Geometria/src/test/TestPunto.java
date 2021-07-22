package test;

import modelo.Circulo;
import modelo.Punto;

public class TestPunto {/*MARZO 2019*/

	public static void main(String[] args) {
	
		//DOS PUNTOS DISTINTOS
		Punto p1= new Punto(1,2);
		Punto p2= new Punto(2,4);
		//DOS PUNTOS IGUALES
		Punto p3= new Punto(3,2);
		Punto p4= new Punto(3,2);
		
		
		System.out.println("\n *************ESCENARIO 1***********");
		//DOS OBJETOS DE PUNTO DISTINTOS
		System.out.println("EL PUNTO UNO ES: " +p1.toString());
		System.out.println("EL PUNTO DOS ES: " +p2.toString());
		System.out.println("EL RESULTADO DE EQUALS ES: " +p1.equals(p2));
		
		System.out.println("\n *************ESCENARIO 2***********");
		//DOS OBJETOS DE PUNTOS IGUALES
		System.out.println("EL PUNTO TRES ES: " +p3.toString());
		System.out.println("EL PUNTO CUATRO ES: " +p4.toString());
		System.out.println("EL RESULTADO DE EQUALS ES: " +p3.equals(p4));
		
		System.out.println("LA DISTANCIA ENTRE LOS PUNTOS UNO Y DOS ES: " +p1.calcularDistancia(p2));

		//CIRCULO
		Punto punto1 = new Punto ( 10 , 10 );
		Punto punto2 = new Punto (20,20);//CREE ESTE PUNTO PARA PODER CALCULAR DOS DISTANCIAS DIFERENTES
		Circulo circulo1 = new Circulo ( punto1 , 10 ); // origen y radio
		Circulo circulo2= new Circulo (punto1,20);
		Circulo circulo3 = new Circulo ( punto2 , 30);
		System.out.println("\n *********CIRCULO***********");
		System.out.println("1: " +circulo1);
		System.out.println("2: " +circulo2);
		/*SE PIDE CALCULAR DISTANCIA ENTRE EL CENTRO DE DOS CIRCULOS, 
		 * PERO ESTOS CIRCULOS COMPARTEN EL MISMO CENTRO */
		System.out.println("\nDISTANCIA CIRCULOS COMPARTEN CENTRO: " +circulo1.calcularDistancia(circulo2));
		System.out.println("DISTANCIA CIRCULOS NO COMPARTEN CENTRO: " +circulo1.calcularDistancia(circulo3));

		//MOVER PUNTO
		punto1.mover(5,2);
		System.out.println("\n VALORES PUNTO MOVIENDO (5,2): " +punto1);
		
		//MOVER DOS CIRCULOS
		System.out.println("\n SE MUEVEN LOS DOS CIRCULOS (5,0): ");
		circulo1.moverCirculo(5,0);
		System.out.println(circulo1);
		System.out.println(circulo2);
		
		System.out.println("\n MUEVO UN SOLO CIRCULO(5,0)(el otro queda igual)");
		circulo1.moverCirculo2(5, 0);
		System.out.println(circulo1);
		System.out.println(circulo2);
		
	
	}
}//FIN TEST..
	
