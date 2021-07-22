package test;

import modelo.Contribuyente;

public class TestCetaCuil {

	public static void main(String[] args) {/*ABRIL 2019*/
		
		//*******************CUIL***********************
		//1-VALIDO
		System.out.println("\n\t**** CUIL VALIDO****");
		try{
			Contribuyente comprador1= new Contribuyente(100,"LOPEZ","MARIANO",17254359,'M',"20172543597");
			System.out.println(comprador1.toString());
		} catch (Exception e){
			System.out.println("Excepcion: " +e.getMessage());
		}
		
		//2-NO VALIDO
		System.out.println("\n\t**** CUIL NO VALIDO****");
		try{
			Contribuyente comprador2= new Contribuyente(100,"LOPEZ","MARIANO",17254359,'M',"30172543597");
			System.out.println(comprador2.toString());
		} catch (Exception e){
			System.out.println("Excepcion: " +e.getMessage());
		}
		
		
		//ERROR: El vendedor y el comprador son los mismos 
		System.out.println("\n\t**** VENDEDOR Y COMPRADOR ****");
		try{
			Contribuyente vendedor1= new Contribuyente(100,"LOPEZ","MARIANO",17254359L,'M',"20172543597");				
			Contribuyente comprador1= new Contribuyente(100,"LOPEZ","MARIANO",17254359,'M',"20172543597");
			System.out.println("Comprador y Vendedor iguales? " +vendedor1.validarCuil("20172543597"));
			System.out.println("COMPRADOR-->"+comprador1.toString());
			System.out.println("VENDEDOR-->"+comprador1.toString());
		} catch (Exception e){System.out.println("El comprador y el vendedor distintos");}
		}

}
