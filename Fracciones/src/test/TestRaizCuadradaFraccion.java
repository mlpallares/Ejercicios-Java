package test;

import modelo.Fraccion;

public class TestRaizCuadradaFraccion {/*ABRIL 2019*/

	public static void main(String[] args) {
		
		try {
			Fraccion f4 = new Fraccion (- 3 , 5 );
			System . out . println ( "ESCENARIO 1: Raiz cuadrada de: \n" + f4 );
			System . out . println ( "La raiz cuadrada de" + f4 + "=" + f4 . raizCuadrada ());
		} catch ( Exception e ){
			System . out . println ( "Excepcion: " + e . getMessage () );
		}

		try {
			Fraccion f4 = new Fraccion ( 9 , 25 );
			System . out . println ( "\nESCENARIO 2: Raiz cuadrada de: \n" + f4 );
			System . out . println ( "La raiz cuadrada de:\n" +  f4 + "=" + f4 . raizCuadrada ());

		} catch ( Exception e ){
			System . out . println ( "Excepcion: " + e . getMessage () );
		}
	}

}
