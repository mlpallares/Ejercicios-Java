package modelo;

import java.util.Arrays;

public class ArregloUnidimensional {/* ABRIL 2019*/
	
	private int [] vector;

	public ArregloUnidimensional(int[] vector) {
		this.vector = vector;
	}
	
	public int[] getVector() {
		return vector;
	}
	
	public void setVector(int[] vector) {
		this.vector = vector;
	}
	
	@Override
	public String toString() {
		return "(vector=" + Arrays.toString(vector) + ")";
		}
	
	
	//*****************************
	//METODOS
	//*****************************
	
	//1-TRAER EL MENOR
	public int traerElMenor(){
		int [] vectorAux=vector.clone();
		int menor = vectorAux[0];
		for (int i=1;i<vectorAux.length;i++){
			if(menor>vectorAux[i]){
				menor = vectorAux[i];
			}			
		}
		return menor;
	}//FIN 1
	
	
	//2-TRAER EL MAYOR
	public int traerElMayor(){
		int [] vectorAux=vector.clone();
		int Mayor = vectorAux[0];
		for (int i=1;i<vectorAux.length;i++){
			if(Mayor<vectorAux[i]){
				Mayor = vectorAux[i];
			}			
		}
		return Mayor;
	}//FIN 2
	
	//3-CALCULAR EL PROMEDIO
	public double traerPromedio(){
		int [] vectorAux=vector.clone();
		double suma=0;
		for (int i=0;i<vectorAux.length;i++){
			suma=suma+vectorAux[i];
		}
		return suma/vectorAux.length;
	}//FIN 3
		
	//4-ORDENAR EL ARRAY EN FORMA ASCENDENTE CON METODO BURBUJA
	public int [] ordenAsc(){
		boolean ordenado = false;
		int [] vordenado= vector.clone();
		int n=0;
		
		while (!ordenado){
			
			ordenado=true;
			
			for (int i=0;i<vordenado.length-1;i++){
				
				if(vordenado[i]>vordenado[i+1]){
					n=vordenado[i];
					vordenado[i]=vordenado[i+1];
					vordenado[i+1]=n;
					ordenado = false;
				}
			}
		}
		return vordenado;
	}//fin 4
	
	
	//5-ORDENAR EL ARRAY EN FORMA DESCENDENTE CON METODO BURBUJA
	public int [] ordenDesc(){
		boolean ordenado = false; 
		int [] vordenado= vector.clone();
		
		while (!ordenado){ 
			
			ordenado=true; 
			
			for (int i = 0 ; i < vordenado.length - 1 ; i++) { 
				//buscamos el mayor número
				int max = i;  
				
				for (int j = i + 1 ; j < vordenado.length ; j++) { 
				if (vordenado[j] > vordenado[max]) {
					max = j; //encontramos el mayor número 
					} 
				} 
				if (i != max) { //permutamos los valores 
					int aux = vordenado[i]; 
					vordenado[i] = vordenado[max]; 
					vordenado[max] = aux; 
					ordenado=false; 
					} 
				} 
			} 		
	return vordenado;	
	}//FIN 5
	
		
	//6-CALCULAR FRECUENCIA
	//ES EL NUMERO DE VECES QUE APARECE UN DETERMINADO VALOR DIVIDIDO POR LA CANTIDAD DE ELEMENTOS DEL ARRAY
	public double traerFrecuencia(int numero){
		int [] vectorAux=vector.clone();
		double resultado=0;
				
		for (int i=0;i<vectorAux.length;i++){
			
				if(vectorAux[i]== numero){
				resultado ++;
				}	
		}	
		return resultado/vectorAux.length;
	}//FIN 6
	
	//7-CALCULAR MODA
	//VALOR QUE APARECE MAS EN EL ARREGLO, REUTILIZANDO FRECUENCIA
	public int traerModa() {
		 int [] vordenado= vector.clone();
		 int valorModa=0;
		 double frecuencia=0,max=-9999;
		 for(int i=0; i<vordenado.length; i++){ 
			 for(int j=i;j<vordenado.length;j++) {
			 frecuencia=traerFrecuencia(vordenado[i]);
			 	if(frecuencia>max) {
				 max=frecuencia;
				 valorModa=vordenado[i];	
			 	}
			 }
		 }	 
  return valorModa;
	}
	
}//FIN.