package modelo;
import modelo.Funciones;

public class Fraccion {/*ABRIL 2019*/

	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) throws Exception {//tiene una excepcion.- se marca en el constructor.-	
		this.numerador = numerador;

		//TIENE UNA EXCEPCION. LA DESCRIPCION EN EL DENOMINADOR.-

		this.setDenominador(denominador);//o por this.setAtributo, NO SE
		//debe implementar funcionalidad en el constructor
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	//ACA SE PONE LA EXCEPCION.-
	public void setDenominador(int denominador)throws Exception {
		if ( denominador == 0 ) throw new Exception ( "Error: Objeto Fracción inválido, el denominador NO puede ser cero." );
		this.denominador = denominador;  	
	}


	// STRING TOSTRING
	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}


	/*//CUANDO SE LLAMA AL METODO DIVIDIR LO QUE SE PASA POR PARAMETRO EN EL TEST ES EL 
	DENOMINADOR*/
	public Fraccion dividir (Fraccion f) throws Exception{ 
		if(f.convertirAReal()==0) throw new Exception("Error: División por cero: " + f );
		return new Fraccion(numerador*f.getDenominador(),denominador*f.getNumerador());//CUANDO ES UNA DIVISION DE FRACCIONES DE DIF DENOMINADOR SE MULTIPLICAN NUMERADOR + DENOMINADOR; 
	}

	//ACA SE DIVIDE NUMERADOR/DENOMINADOR.-
	public double convertirAReal() throws Exception{   
		return (Funciones.convertirADouble(numerador)/Funciones.convertirADouble(denominador));   
	}

	//1ERO DE DIVIDE METODO CONVERTIR A REAL- NUMERADOR/DENOMINADOR Y LUEGO RAIZ CUADRADA.-
	public double raizCuadrada () throws Exception{
		if ( numerador * denominador < 0 ) throw new Exception ( "Error: el radicando es negativo.");
		return Math . pow ( this . convertirAReal (), 0.5 );
	}

}