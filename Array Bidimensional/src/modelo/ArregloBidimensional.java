package modelo;

import java.util.Arrays;

public class ArregloBidimensional {
	
	private double [][] matrizA;

	public ArregloBidimensional(double[][] matrizA) {
			this.matrizA = matrizA;
	}

	public double[][] getMatrizA() {
		return matrizA;
	}

	public void setMatrizA(double[][] matrizA) {
		this.matrizA = matrizA;
	}

	@Override
	public String toString() {
		String resultado="";
		for (int i=0; i<matrizA.length;i++){
			resultado=resultado+Arrays.toString(matrizA[i]);
		}
		return "matriz=" + resultado + "";
	}
		
	/////////////////////////////////////////////////
	//METODOS
	/////////////////////////////////////////////////
	
	//1-SUMAR
	public double [][] sumar(double[][] matrizB){
		
		//CLONO LAS DOS MATRICES
		double [][] matrizAAux=matrizA.clone();
		double [][] matrizBAux=matrizB.clone();
		
		int f1=matrizAAux.length;
		int c1= matrizAAux[0].length;
		int f2=matrizBAux.length;//obtengo la longitud 
		int c2=matrizBAux[0].length;//para las columna
		
		//VERIFICAR QUE AMBAS MATRICES TENGAN LAS MISMAS DIMENSIONES
		double suma [][]=null;
		if (!((c1 != c2) || (f1 != f2))){
	
		suma = new double [f1][c1]; //CREAR UNA MATRIZ RESULTADO DE LAS MISMAS DIMENSIONES
		
		for(int i=0; i<matrizBAux.length; i++){    //numero de filas
			for(int j=0; j<matrizBAux.length; j++){ //numero de columnas de cada fila
				
				suma[i][j]= matrizAAux[i][j]+matrizBAux[i][j];
			}
		  }
		}
		return suma;
  }//fin 1
	
		
	//2-RESTAR
	public double [][] restar (double [][] matrizB){
	
		//CLONO LAS DOS MATRICES
		double [][] matrizAAux=matrizA.clone();
		double [][] matrizBAux=matrizB.clone();
				
		int f1=matrizAAux.length;
		int c1= matrizAAux[0].length;
		int f2=matrizBAux.length;//obtengo la longitud 
		int c2=matrizBAux[0].length;//para las columna
		
		double resta[][]=null;
		if (!((c1 != c2) || (f1 != f2))){
			
		resta= new double [f1][c1];
		
		for(int i=0; i<matrizBAux.length; i++){
			for(int j=0; j<matrizBAux.length; j++){
				resta[i][j]= matrizAAux[i][j]-matrizBAux[i][j];
			}
		}
		}
		return resta;
	}//fin 2
	
	//3-TRANSPUESTA---->>> CONSISTE EN INTERCAMBIAR FILAS POR COLUMNAS
	public double [][] transpuesta(){
		
		double [][] matrizAAux=matrizA.clone();
		int f=matrizAAux.length;
		int c=matrizAAux[0].length;
		
		double resultado[][]= new double [f][c];
				
		for (int i=0; i< matrizAAux.length; i++){
			for(int j=0; j < matrizAAux.length; j++){
				
				 resultado [j][i]= matrizAAux[i][j];
			}
		}
		return resultado;
	}//fin 3
	
		
	//4-MULTIPLICAR
	//PRODUCTO DE UN ESCALAR POR UNA MATRIZ
	public double[][] multiplicar(double numero){
		double [][] matrizAAux=matrizA.clone();
		
		int f=matrizAAux.length;
		int c=matrizAAux[0].length;
		double resultado[][]= new double [f][c];
		
        for(int i=0; i< matrizAAux.length; i++){
            for(int j=0; j< matrizAAux.length; j++){
                                	
                    resultado[i][j]= numero * matrizAAux[i][j];
                }
          }
        return resultado;
    }// fin 4   
	
	
	//5-MULTIPLICAR--->>> METODO SOBRECARGADO..
	//LA PRIMER MATRIZ DEBE TENER LA MISMA CANTIDAD DE FILAS Y COLUMNAS QUE LA SEGUNDA
    public double[][] multiplicar(double[][] matrizB){
	
    	double [][] matrizAAux=matrizA.clone();
    	double [][] matrizBAux=matrizB.clone();
    	
    	int f1=matrizAAux.length;
    	int c1= matrizAAux[0].length;
    	int f2=matrizBAux.length;
    	int c2=matrizBAux[0].length;
		
		//Para multiplicar matrices lo que se realiza es una multiplicación de las filas por las columnas
		
		double resultado [][]=null;
		
		if (!((f1 != c2)||(f2 != c1))){
		
		resultado= new double [f1][c1];
		
        for(int i=0; i< matrizAAux.length; i++){
            for(int j=0; j<matrizAAux.length; j++){
                for(int k=0; k<matrizAAux.length; k++){
                	
                    resultado[i][j]+=matrizAAux[i][k]*matrizBAux[k][j];
                }
            }
         }
		}
        return resultado; 
    }// fin 4   

    
    
}//FIN.
