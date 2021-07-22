package test;

import consultorio.Paciente;

public class TestConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* MARZO 2019 */
		
		Paciente paciente1 = new Paciente ( "José" , "Pérez" , 1.80f , 85 );
		Paciente paciente2 = new Paciente ( "Jorge" , "Fernández" , 1.60f , 90 );
		System . out . println ( "Pacientes:" );
		System . out . println ( "Paciente Uno: "+paciente1 . traerNombreCompleto ());
		System . out . println ( "Paciente Dos: "+paciente2 . traerNombreCompleto ());

	}

}
