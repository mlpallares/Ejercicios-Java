package test;

import modelo.ArregloUnidimensional;

public class ArregloUnidimensionalTest {/* ABRIL 2019*/

	public static void main(String[] args) {
		
		int [] vector ={-2, 6,6,6,6, 1 };
				
		ArregloUnidimensional vector1 = new ArregloUnidimensional (vector);
		
		System.out.println("********METODOS**********\n");
		System.out.println("ARRAY ORIGINAL: "+vector1.toString());
		System.out.println("1-MENOR VALOR DEL ARRAY: "+vector1.traerElMenor());
		System.out.println("2-MAYOR VALOR DEL ARRAY: "+vector1.traerElMayor());
		System.out.println("3-PROMEDIO DEL ARRAY: "+vector1.traerPromedio());
		ArregloUnidimensional arregloAscendente = new ArregloUnidimensional (vector1.ordenAsc());
		System.out.println("4-ORDEN ASCENDENTE DEL ARRAY: "+arregloAscendente);
		ArregloUnidimensional arregloDescendente = new ArregloUnidimensional (vector1.ordenDesc());
		System.out.println("5-ORDEN DESCENDENTE DEL ARRAY: "+arregloDescendente);
		System.out.println("6-FRECUENCIA DEL ARRAY: " +vector1.traerFrecuencia(1));
		System.out.println("7-MODA DEL ARRAY: " +vector1.traerModa());
		
	}
			
}
