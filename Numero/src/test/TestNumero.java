package test;

import modelo.Numero;

public class TestNumero {

	public static void main(String[] args) {/* ABRIL 2019 */
				
		Numero nro1 = new Numero (4);
		
		System. out. println ("\t*******METODOS********");
		System .out .println ("01-Suma:  " +nro1.sumar(30) );
		System .out. println ("02-Multiplicar:  " +nro1.multiplicar(20) );
		System .out .println ("03-Nro Par:  " +nro1.esPar() );
		System. out .println ("04-Nro Primo: "+nro1.esPrimo());
		System. out .println ("05-Convertir nro a String:  " +nro1.convertirAString());
		System. out .println ("06-Convertir nro a double: " +nro1.convertirADouble()); 
		System. out .println ("07-Calcular la potencia del nro:  " +nro1.calcularPotencia(2.5));
		System. out .println ("08-Pasar a base2: " +nro1.pasarBase2());
		System. out .println ("09-Calcular factorial: " +nro1.calcularFactorial());
		System. out .println ("10-Nro Combinatorio: " +nro1.numeroCombinatorio(2));
	
		
	}

	

	}//Fin test..


