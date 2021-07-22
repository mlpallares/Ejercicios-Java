package test;

import modelo.Fraccion;

public class TestInstanciarFraccion {/*ABRIL 2019*/

	public static void main(String[] args) {
		
		try {	
			int n = 2 , d = 0;	
			System . out . println ( "ESCENARIO 1: new Fraccion(" + n + "," + d + ")" );	
			Fraccion f1 = new Fraccion ( n , d );	
			System . out . println ( "Objeto Fraccion: " + f1 );
		}catch ( Exception e ){
			System . out . println ( "Excepcion: " + e . getMessage ());
		}


		try {		
			int n = 3 , d = 5;		
			System . out . println ( "\nESCENARIO 2: new Fraccion(" + n + "," + d + ")" );		
			Fraccion f1 = new Fraccion ( n , d );		
			System . out . println ( "Objeto Fraccion: " + f1 );	
		} catch ( Exception e ){
			System . out . println ( "Excepcion: " + e . getMessage () );
		}


	}

}
