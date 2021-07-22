package test;

import java.util.Arrays;

import modelo.ArregloBidimensional;

;

public class ArregloBidimensionalTest {

	public static void main(String[] args) {

		double[][] matrizC = { { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };
		double[][] matrizE = { { 5, 5, 5 }, { 6, 6, 6 }, { 1, 1, 1 } };

		ArregloBidimensional matrizD = new ArregloBidimensional(matrizC);
		ArregloBidimensional matrizB = new ArregloBidimensional(matrizE);

		System.out.println("****MATRIZ BIDIMENSIONAL*****\n");
		System.out.println("ARREGLO ORIGINAL 1\n" +matrizD.toString());
		System.out.println("\nARREGLO ORIGINAL 2\n" +matrizB.toString());

		System.out.println("\n1-SUMA DE DOS ARREGLOS: " + arrayToString(matrizD.sumar(matrizE)));
		System.out
				.println("\n2-RESTA DE DOS ARREGLOS: " + arrayToString(matrizD.restar(matrizE)));
		System.out.println("\n3-TRANSPUESTA: "
				+ arrayToString(matrizD.transpuesta()));
		System.out.println("\n4-MULTIPLICACION POR UN ESCALAR: "
				+ arrayToString(matrizD.multiplicar(2)));
		System.out.println("\n5-MULTIPLICACION DE DOS ARREGLOS: "
				+ arrayToString(matrizD.multiplicar(matrizE)));

	}//Fin main

	/* A diferencia del arreglo unidimensional, 
	 * debido a que tiene que recorrer otras dimensiones 
	 * necesito modificar la instruccion .toString dentro de un for, ya que solo
	 * imprime un vector esa instruccion.
	 */
	// Metodo para imprimir matriz
	public static String arrayToString(double[][] matriz) {
		String resultado = "";
		for (int i = 0; i < matriz.length; i++) {
			resultado = resultado + Arrays.toString(matriz[i]);//toString imprime vector unidimensional
		}
		return " [matriz=" + resultado + "]";
	}//Fin método

}// FIN

