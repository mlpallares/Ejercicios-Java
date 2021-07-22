package modelo;

public class Numero { /* ABRIL 2019 */

	private int n;

	public Numero(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "Numero [n=" + n + "]";
	}

	//1-SUMA
	public int sumar (int n1){
		return n+n1;
	}//fin 1

	//2-MULTIPLICACION
	public int multiplicar (int n1){
		return n*n1;
	}//fin 2

	//3-NUMERO PAR
	public boolean esPar(){
		boolean esPar=false;
		if (n%2 == 0){
			esPar=true;
		}
		return esPar;
	}//fin 3

	//4-NUMERO PRIMO
	public boolean esPrimo(){
		boolean primo=true;
		int i=2;
		int div;

		while ((primo == true) && (i<=Math.sqrt(n))){

			div=n%i;
			i++;

			if (div == 0){
				primo = false;
			}
		}
		return primo;
	}//fin 4


	//5-CONVERTIR A STRING
	public String convertirAString(){
		return String.valueOf(n);
	}//fin 5.


	//6-CONVERTIR A DOUBLE
	public double convertirADouble(){
		return Double.parseDouble(String.valueOf(n));
	}//fin 6


	//7-CALCULAR POTENCIA
	public double calcularPotencia (double exp){
		return Math.pow(n, exp);
	}//fin 7..


	//8-PASAR A BASE DOS 
	public String pasarBase2(){
		String binario="";
		int aux=n;
		while(aux != 0){
			int resultado=aux%2;
			binario=resultado+binario;
			aux/=2; //reduce aux
		}
		return binario;
	}//fin 8


	//9-CALCULAR FACTORIAL 	
	public int calcularFactorial() {
		return calcularFactorial(n);
	}

	/*[METODO PRINCIPAL FACTORIAL]
	  METODO SOBRECARGADO CALCULAR FACTORIAL CON PARAMETRO DE ENTRADA.- 
	  [PARA PODER UTILIZAR EN COMBINATORIA]
	  Si el nro si n >0 es el producto 1*2....*n,
	  Si n es O el factorial es 1, Si n<0 retorna -1 */

	public int calcularFactorial(int n1) {
		int resultado;
		if(n1==0) {
			resultado=1;	 
		}else if (n1<0){
			resultado=-1;  
		}

		for(resultado=n1; n1>1; n1--) {
			resultado=resultado*(n1-1);  
		}
		return resultado;
	}


	//10-NUMERO COMBINATORIO
	/*Para n y n1 positivos; n>n1 devuelve Combinatoria [Cn;n1]
	 * COMBINATORIA [C(mayor,menor)=mayor!/(menor! * (mayor-menor)!)]
	 * Devuelve -1 en caso de error
	 */
	public int numeroCombinatorio(int n1){
		int combinatorio=-1;
		if((n>0 && n1>0) && n>n1){
			combinatorio=calcularFactorial(n)/(calcularFactorial(n1)*calcularFactorial(n-n1));
		}	
		return combinatorio;
	}//fin 10	


}//FIN



//CALCULAR FACTORIAL SIN PARAMETROS
/*(si el número si n>0 es el producto 1*2..*n,
	si n es 0 el factorial es 1, si el n<0 retorne -1)*/
/* 
	public int calcularFactorial() {
		int factorial = 1;
		if(n==0) {
		 factorial=1;	 
	  }else if (n<0){
		 factorial=-1;  
	  }
		 for (int i=2;i<=n;i++) {
		 factorial = factorial * i;

	}
		 return factorial;
	}*/
