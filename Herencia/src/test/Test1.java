package test;

import java.time.LocalDate;

import modelo.Empleado;
import modelo.Persona;
import modelo.Cliente;

public class Test1 {

	public static void main(String[] args) { 
	
		LocalDate fechaNto1 = LocalDate.of(2000, 2, 20);
		LocalDate fechaNto2 = LocalDate.of(2000, 8, 10);//FECHA POSTERIOR A LA DE HOY
		
		/*Persona persona = new Empleado ( nombre , apellido , dni , fechaNacimiento , legajo ,
				sueldoMensual );*/
		System.out.println("FECHA DE HOY: "+LocalDate.now());
		System.out.println("\tEDAD EMPLEADOS");
		Persona persona1 = new Empleado("Mariano", "Rodriguez", 1111, fechaNto1, 222, 100); 
		Persona persona2 = new Empleado("Pablo", "Suarez", 222, fechaNto2, 999, 32323);
		System.out.println("EDAD EMPLEADO 1: "+persona1.calcularEdad());	
		System.out.println("EDAD EMPLEADO 2: "+persona2.calcularEdad());
			
		System.out.println("\tEDAD CLIENTES");
		Persona persona3=new Cliente("Lucas","Moreno",3333,fechaNto1,"33333",32.006f);
		Persona persona4=new Cliente("Lucas","Moreno",3333,fechaNto2,"444444",32.006f);
		System.out.println("EDAD CLIENTE 1: "+persona3.calcularEdad());	
		System.out.println("EDAD CLIENTE 2: "+persona4.calcularEdad());
			
		System.out.println("\tDATOS EMPLEADOS");
		System.out.println("EMPLEADO 1: "+persona1.toString());
		System.out.println("\tDATOS CLIENTES");
		System.out.println("CLIENTE 1: "+persona1.toString());

	}

}
