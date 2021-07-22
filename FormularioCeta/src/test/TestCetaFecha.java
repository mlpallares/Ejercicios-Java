package test;

import java.time.LocalDate;
import modelo.Ceta;
import modelo.Contribuyente;

public class TestCetaFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DEBEN INICIALIZAR VARIABLES, LLAMAR METODOS
		//OJO!!..NO DEBE HABER FUNCIONALIDAD EN EL TEST!!

		
		System.out.println("\t**** FECHA VALIDA****");
		try{
			LocalDate fecha1 = LocalDate.of(2019, 02, 3);
			Contribuyente comprador1= new Contribuyente(100,"LOPEZ","MARIANO",17254359,'M',"20172543597");
			Contribuyente vendedor1= new Contribuyente(100,"LOPEZ","MARIANO",17254359,'M',"20172543597");
			
			Ceta formulario1= new Ceta(100,fecha1,vendedor1,comprador1,25000,true);	
			System.out.println("FORMULARIO: \n"+formulario1.toString());
			
		}
		catch (Exception e){
			System.out.println("Excepcion: " +e.getMessage());

		}

			
		//ERROR: La fecha no puede ser posterior al día de hoy
		System.out.println("\t**** FECHA NO VALIDA****");
		try{
			LocalDate fecha1 = LocalDate.of(2019, 05, 3);
			Contribuyente comprador1= new Contribuyente(100,"LOPEZ","MARIANO",17254359,'M',"20172543597");
			Contribuyente vendedor1= new Contribuyente(100,"LOPEZ","MARIANO",17254359,'M',"20172543597");		
			Ceta formulario1= new Ceta(100,fecha1,vendedor1,comprador1,25000,true);	
			System.out.println("FORMULARIO: "+formulario1.toString());
			
		}
		catch (Exception e){
			System.out.println("Excepcion: " +e.getMessage());

		}

	}
}
