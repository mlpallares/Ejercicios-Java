package test;

import modelo.Persona;
import java.time.LocalDate;
import modelo.Empleado;
import modelo.Cliente;

public class Test2 {

	public static void main(String[] args) { /*ABRIL 2019*/
	
		LocalDate fechaNto1 = LocalDate.of(2000, 04, 20);
		LocalDate fechaNto2 = LocalDate.of(1985, 8, 20);

		Persona personas [] = new Persona [ 4 ]; // el con el que declaramos el array es el de la superclase

		personas [ 0 ]= new Persona ("Julian","Garc?a",44444,fechaNto1); // instanciamos una persona, todo bien
		personas [ 1 ]= new Empleado ("Mariano", "Rodriguez", 1111, fechaNto1, 222, 100); // instanciamos un empleado. Se puede?
		personas [ 2 ]= new Cliente ("Lucas","Moreno",333,fechaNto2,"33333",32.006f); // Y con cliente?
		personas [ 3 ]= new Empleado ("Pablo", "Suarez", 222, fechaNto2, 999, 32323);

		System . out . println ( "Personas Mayores de 30: ");
		for ( int i = 0 ; i < 4 ; i ++){
			if ( personas [ i ]. calcularEdad ()>= 30) {		
				System . out . println (personas[i]+ " Edad: " + personas[i].calcularEdad());
			}
		}


	}

}
