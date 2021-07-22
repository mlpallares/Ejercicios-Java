package test;

import modelo.Fraccion;

public class TestDividirFraccion {/*ABRIL 2019*/

	public static void main(String[] args) {
		
		try {		
			Fraccion f2 = new Fraccion ( 2 , 5 );		
			Fraccion f3 = new Fraccion ( 0 , 3 );		
			System . out . println ( "ESCENARIO 1: Dividir \n" + f2 +" por " + f3 );		
			System . out . println ( f2 + "/" + f3 + "=" + f2 . dividir ( f3 ));
		} catch ( Exception e ){
			System . out . println ( "Excepcion: " + e . getMessage ());  
		}


		try {
			Fraccion f2 = new Fraccion ( 2 , 5 );
			Fraccion f3 = new Fraccion ( 7 , 3 );
			System . out . println ( "\nESCENARIO 2: Dividir \n" + f2 + " por " + f3 );
			System . out . println ( f2 + "/" + f3 + "=" + f2 . dividir ( f3 ));
		} catch ( Exception e ){
			System . out . println ( "Excepcion: " + e . getMessage ());
		}

		

	}

}
