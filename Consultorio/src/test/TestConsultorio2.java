package test;

import consultorio.Medico;
import consultorio.Paciente;

public class TestConsultorio2 {

	public static void main(String[] args) {/* MARZO 2019 */
		// TODO Auto-generated method stub
		
		
		Paciente paciente1 = new Paciente ("José","Pérez", 1.80f , 85 );
		Paciente paciente2 = new Paciente ("Jorge","Fernández", 1.60f , 90 );
		Medico medico1= new Medico("Daniel", "López", "Médico Clínico");
		
		System.out.println ("Visita 1" );
		System.out.println ("Médico: "+medico1.traerNombreCompleto());
		System.out.println ("Paciente Uno: "+paciente1.traerNombreCompleto()+", IMC:"+medico1.calcularIMC(paciente1));
		System.out.println ("Paciente Dos: "+paciente2.traerNombreCompleto()+", IMC: "+medico1.calcularIMC(paciente2));

		System.out.println ("Visita 2" );
		paciente1.setPeso(105);
		paciente2.setPeso(62);
		System.out.println ("Médico: "+medico1.traerNombreCompleto());
		System.out.println ("Paciente Uno: "+paciente1.traerNombreCompleto()+", IMC:"+medico1.calcularIMC(paciente1));
		System.out.println ("Paciente Dos: "+paciente2.traerNombreCompleto()+", IMC: "+medico1.calcularIMC(paciente2));

		System.out.println("\nImpresión con toString");
		System.out.println("Médico: "+medico1.toString());
		System.out.println("Paciente Uno: "+paciente1.toString());
		System.out.println("Paciente Uno: "+paciente1.toString());

	}

}
