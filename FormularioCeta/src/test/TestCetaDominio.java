package test;

import modelo.Rodado;

public class TestCetaDominio {

	public static void main(String[] args) {
		
		//*****************TEST PARA DOMINIO*********************
		
		//ERROR: Dominio no válido--PATENTE FORMATO AAA123
		System.out.println("\n\t**** DOMINIO I-PATENTE AAA123 ****");
		try{
			Rodado rodado1= new Rodado(100,"AAA1jj",345,"FIAT");
			System.out.println("El DOMINIO: "+rodado1.getDominio()+" es valido ");

		}
		catch (Exception e){System.out.println("Excepcion: " +e.getMessage());}
		
		//ERROR: Dominio no válido--PATENTE UNICA MERCOSUR FORMATO AA123BB
		System.out.println("\n\t**** DOMINIO II-PATENTE AA123BB ****");
		try{
			Rodado rodado2= new Rodado(101,"AA123BB",345,"FIAT");
			System.out.println("El DOMINIO: "+rodado2.getDominio()+" es valido ");
		}
		catch (Exception d){System.out.println("Excepcion: " +d.getMessage());}
				
		

	}

}
