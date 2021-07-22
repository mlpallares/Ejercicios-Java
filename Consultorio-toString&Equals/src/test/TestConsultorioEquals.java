package test;

import consultorio.Medico;
import consultorio.Paciente;

public class TestConsultorioEquals {/* ABRIL 2019 */

	public static void main(String[] args) {
				
		Paciente paciente1 = new Paciente ( "José" , "Pérez" , 1.80f , 85 );
		Paciente paciente2 = paciente1;
		Paciente paciente3 = new Paciente ( "José" , "Pérez" , 1.80f , 85 );
		System . out . println ("Paciente 1: "+paciente1);
		System . out . println ("Paciente 2: "+paciente2);
		System . out . println ("Paciente 3: "+paciente3);
		
//		IMPRIME True ya que ocupan la misma posicion de memoria
		System . out . println ("IGUALO PACIENTE 1 Y 2: "); //imprime false
		System . out . println (paciente1==paciente2); 
		
		/*Imprime false ya que aparentan ser el mismo objeto pero no 
		ocupan la misma posicion de memoria*/
		System . out . println ("IGUALO PACIENTE 1 Y 3: "); //imprime false
		System . out . println (paciente1==paciente3);
		
		
		Medico medico1= new Medico("Daniel", "López", "Médico Clínico");
		Medico medico2= new Medico("Mariano", "Ibarra", "Médico Clínico");
		System . out . println ("EQUALS POR ESPECIALIDAD MEDICO");
		System . out . println ("Comparo especialidad médico 1 y 2: "+medico1.equals(medico2));

	}

}
