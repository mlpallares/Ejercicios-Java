package test;

import modelo.Contribuyente;

public class TestCetaSexo {

	public static void main(String[] args) {
		
		//ERROR: Sexo contribuyente no válido
		System.out.println("\n\t**** SEXO F Ó M VALIDO****");
		try{
			Contribuyente c1= new Contribuyente(100,"LOPEZ","MARIANO",17254359L,'M',"20172543597");
			System.out.println(c1.toString());
		}
		catch (Exception e){
			System.out.println("Excepcion: " +e.getMessage());
		}
		
		System.out.println("\n\t**** SEXO F Ó M NO VALIDO****");
		try{
			Contribuyente c1= new Contribuyente(100,"LOPEZ","MARIA",12345678L,'T',"2013456789");
			System.out.println(c1.toString());
		}
		catch (Exception s){
			System.out.println("Excepcion: " +s.getMessage());
		}

		
	}

}
