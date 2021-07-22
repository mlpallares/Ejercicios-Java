package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funciones {

	/*
	******************************************************************
	         LISTA METODOS---ULTIMA ACTUALIZACION 26/08/2017
	******************************************************************
	01-TRAER DIA(GregorianCalendar fecha): int,
	02-TRAER MES(GregorianCalendar fecha): int,
	03-TRAER ANIO(GregorianCalendar fecha): int,
	04-AÑO BISIESTO(int anio): boolean,
	05-FECHA VALIDA(int anio, int mes, int dia): boolean,
	06-TRAER FECHA(int anio, int mes, int dia): GregorianCalendar,
	07-TRAER FECHA(String fecha): GregorianCalendar,
	08-TRAER FECHA CORTA(GregorianCalendar fecha): String,
	09-TRAER FECHA CORTA MAS HORA(GregorianCalendar fecha): String,
	10-TRAER FECHA PROXIMO(GregorianCalendar fecha, int cantDias): GregorianCalendar,
	11-DIA HABIL(GregorianCalendar fecha): boolean,
	12-TRAER DIA DE LA SEMANA(GregorianCalendar fecha): String,
	13-TRAER MES EN LETRAS(GregorianCalendar fecha): String,
	14-TRAER FECHA LARGA(GregorianCalendar fecha): String,
	15-SON FECHAS IGUALES(GregorianCalendar fecha,GregorianCalendarfecha1): boolean,
	16-SON FECHA HORA IGUALES(GregorianCalendar fecha,GregorianCalendarfecha1): boolean,
	17-TRAER CANTIDAD DE DIAS DE UN MES(int anio, int mes): int,
	18-APROXIMAR DOS DECIMALES(double valor): double,
	19-ES NUMERO?(char c): boolean,
	20-ES LETRA?(char c): boolean,
	21-ES CADENA DE NUMERO?(String cadena): boolean,
	22-ES CADENA DE LETRAS?(String cadena): boolean. 
	23-ES DOUBLE.-*/
	
	/* ***************METODOS********************* */
	
	
	//1- traer Anio actual
	//Pre: Entro con una fecha de gregorian calendar
	//Post: Devuelve un año entero
			
	public static int traerAnio(GregorianCalendar fecha) {
		 return fecha.get(Calendar.YEAR);
		
	}
	
	
	//2-Traer MES actual
	
	//Pre: Entro con una fecha de gregorian calendar
	//Post: Devuelve un mes entero
	
	
	public static int traerMes(GregorianCalendar fecha) {
		
		return fecha.get(Calendar.MONTH)+1;
	}
	
	
    //3-traer DIA ACTUAL
	
	//Pre: Entro con una fecha de gregorian calendar
	//Post: Devuelve un ia entero
		 
	public static int traerDia(GregorianCalendar fecha) {
		
		return fecha.get(Calendar.DAY_OF_MONTH);
		
	}
	
	
	
	//4-Traer esBisiesto
	//Anios divisibles por 4, exceptuando los que son divisible por 100 y no por 400.-
	
	//Pre: dado un año entero
	//Post: devuelve true o false segun sea o no bisiesto
		 
	
	public static boolean esBisiesto(int anio){
	
	//Cualquier año divisible por 4 es un año bisiesto, excepto los divisibles entre 100, por ejemplo
	//1900.-
	//Loa divisibles por 100, solo pueden ser bisiestos si son divisibles por 400.- ejemplo año 1200.-	
		
	boolean esBisiesto=false;	
	
	if ((anio%4==0 && anio%100!=0) || anio%400==0) {
		
		esBisiesto=true;
		
		
	}
			
		
	
	
	
	return esBisiesto;
	
}
 


	
		
 //5-FECHA VALIDA
 //El mes es entero entre 1 y 12. En el caso de ser bisiesto es válido el día 29/02
 
 //Pre: dada una fecha como una lista de 3 enteros, tener el mes, y tener
 //definida la funcion que nos dice si el año es bisiesto, para saber cuantos
 //dias tiene el mes de febrero, ergo tambien necesitamos saber el año u.u
 //Post: Nos dice si la fecha es o no valida
   
   	

public static boolean esFechaValida(int anio, int mes, int dia){

boolean fechaValida=false;

boolean Bisiesto=esBisiesto(anio);


if(mes>0 && mes <13){
	
	if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)&&(dia<32)){
		 
		fechaValida=true;
	
	}else{
	
		if((mes==4 || mes==6 || mes==9 || mes==11)&&(dia<31)){
				
			fechaValida=true;
	
		}else{			
	
			if(mes==2 && Bisiesto==true && dia<30){//valido el dia 29/02
		      
				fechaValida=true;

	}else{	       
	
		if(mes==2 && Bisiesto!= true && dia<29){
		       
		 	fechaValida=true;
				}
			}
		}
	}
}
return fechaValida;
}	


//6. TRAER FECHA INT ANIO, MES, DIA.-
//Pre: año, mes y dia en enteros
//Post: devuelve la fecha gregoriana



 
public static GregorianCalendar traerFecha(int anio, int mes, int dia){
    
    GregorianCalendar fechaGregorian = new GregorianCalendar(anio, mes, dia);

	boolean fechaValida=esFechaValida(anio,mes,dia);
    
	if(fechaValida==true){
    	
		fechaGregorian.set(anio, mes, dia);//preguntar por que el set no me trae unicamente anio,mes y dia.
    		    }
    return fechaGregorian;
	}
	
	




//7-TRAER FECHA GREGORIAN CALENDAR.-

//Pre: Dado un string de 10 digitos...12/05&2011, ¡¡sin importar la separacion!!

//Post: devuelve una fecha "Gregoriana"

    public static GregorianCalendar traerFecha(String fecha){
	 
   //SUBSTRING: Devuelve una subcadena, la cual corresponde 
   //al contenido entre los valores beginIndex y endIndex.*/
   //INTEGER.PARSEINT: se utiliza para pasar de CADENA A ENTERO.
 	
    	
    	 	
	int dia = Integer.parseInt(fecha.substring(0,2)); 
	int mes = Integer.parseInt(fecha.substring(3,4)); 
	int anio = Integer.parseInt(fecha.substring(5,8)); 
	
	GregorianCalendar fechaGregoriana = new GregorianCalendar (anio,mes,dia); 
	
	return fechaGregoriana;
	
    }
    

//8-FECHA CORTA
  //Pre: dada una fecha "Gregoriana"
 //post: nos da la fecha como un string dd/mm/aaaa.- 10 digitos.-
	
    
	public static String traerFechaCorta(GregorianCalendar fecha){
	
	@SuppressWarnings("unused")
	String fechaCorta;
	String dia1;
	String mes1;
	
	int dia=traerDia(fecha);
	int mes=traerMes(fecha);
	int anio=traerAnio(fecha);

                          
	if (dia<10) {//agrego el cero para que la fecha tenga longitud 10.-
		
	dia1="0"+dia;
	
		
	}else {
		
	dia1=String.valueOf(dia);}	
	
	
	if(mes<10) {
		
	mes1="0"+mes;
	
	
	}else {
		
	mes1=String.valueOf(mes);}
	
	
	return fechaCorta=dia1+"/"+mes1+"/"+anio;
	
		
			
	}
		
	
	
	

	  //9-TRAER FECHA CORTA MAS HORA
	 //Pre: dada una fecha "Gregoriana"
	 //post: nos da la fecha como un string dd/mm/aaaa.+ la hora- 10 digitos.-
		
	    
	
		public static String traerFechaCortaHora(GregorianCalendar fecha){
		

			@SuppressWarnings("unused")
			String fechaCortaHora;
			
			String fechacorta=traerFechaCorta(fecha);
			
			int hora=fecha.get(Calendar.HOUR_OF_DAY);
			
			int minutos=fecha.get(Calendar.MINUTE);
			
			int segundos=fecha.get(Calendar.SECOND);
			
			String minutos1;
			
			String segundos1;
			
			if(minutos<10){
				minutos1="0"+minutos;
			}else{minutos1=String.valueOf(minutos);}
			
			if(segundos<10){
				segundos1="0"+segundos;
			}else{segundos1=String.valueOf(segundos);}
			
			return fechaCortaHora=fechacorta+" "+hora+":"+minutos1+":"+segundos1;//ver long 16
		}
		

		
		//10-TRAER FECHA PROXIMO
		
		public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha, int cantDias){
		//capturar anio mes y dia de fecha 
		
		GregorianCalendar fechaProximo = new GregorianCalendar();//crear un objeto nuevo con fecha
		
		fechaProximo.add(Calendar.DAY_OF_MONTH, cantDias);
		
			return fechaProximo;
			
		}
		
		
		//11-DIA HABIL: SE CONSIDERA DIA HABIL DE LUNES A VIERNES
		
		public static boolean esDiaHabil(GregorianCalendar fecha){
		
		boolean diaHabil=false;
		
		int dia=fecha.get(Calendar.DAY_OF_WEEK);
		

		//1=DOMINGO,2=LUNES, 3=MARTES,4=MIERCOLES,5=JUEVES,6=VIERNES,7=SABADO 
		
		if(dia>1 && dia<=6) {
			
			diaHabil=true;
			
		}
		
		return diaHabil;
		
		
		
		}
		
		
		//12-TRAER DIA DE LA SEMANA
		
		public static String traerDiaDeLaSemana(GregorianCalendar fecha){
		
		String diasDeLaSemana[]={"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
		
		int dia=fecha.get(Calendar.DAY_OF_WEEK);		
		
		return diasDeLaSemana[dia-1];
		
		}
		
		//13-TRAER MES EN LETRAS
		
		public static String traerMesEnLetras(GregorianCalendar fecha){
		
		String mesEnLetras[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		int mes=fecha.get(Calendar.MONTH);//0=ENERO
		
		return mesEnLetras[mes];
				}
						
		//14-TRAER FECHA LARGA
		public static String traerFechaLarga(GregorianCalendar fecha){
		
		@SuppressWarnings("unused")
		String fechaLarga;
		
		String mes=traerMesEnLetras(fecha);
		String dia=traerDiaDeLaSemana(fecha);
		
		int aniofecha=traerAnio(fecha);
		
		int diafecha=traerDia(fecha);
				
		
		return fechaLarga=dia+" "+diafecha+" de "+mes+" del "+aniofecha;
		
		}		
		
		
		
		
		//15-FECHAS IGUALES
		
		public static boolean sonFechasIguales(GregorianCalendar fecha , GregorianCalendar fecha1){
		        
	    boolean sonIguales = false;
	    
	    boolean diaIgual = (traerDia(fecha)== traerDia(fecha1));
	    
	    boolean mesIgual = (traerMes(fecha)== traerMes(fecha1));
	    
	    boolean anioIgual = (traerAnio(fecha)== traerAnio(fecha1));
	        	 
	        	 if (diaIgual==true && mesIgual==true && anioIgual==true){
	        		 sonIguales = true;
	        		 
	        	 }	
	        	 
	        	 return sonIguales;     	 
	        	 
	    	 	        	 
	   
	              	 
	        	 
		}
		
		
		
		//16-FECHAS HORAS IGUALES
		
		public static boolean sonFechasHorasIguales(GregorianCalendar fecha , GregorianCalendar fecha1){
			
		boolean FechasHorasIguales=false;
		
		boolean FechasIguales=sonFechasIguales(fecha,fecha1);//metodo sonFechasIguales,se llama, compara y el resultado en la variable fechasiguales
       			
		boolean hora=(fecha.get(Calendar.HOUR)==fecha1.get(Calendar.HOUR));

        boolean minutos=(fecha.get(Calendar.MINUTE)==fecha1.get(Calendar.MINUTE));
		
        boolean am_pm=(fecha.get(Calendar.AM_PM)==fecha1.get(Calendar.AM_PM));
		
        //objeto1.equals(objeto2)
        
		if(FechasIguales==true && hora==true && minutos==true && am_pm==true){
			
			FechasHorasIguales=true;
			
		}
		return FechasHorasIguales;

		}
		
		
		
		
		//17-CANTIDAD DE DIAS DE UN MES
		
		public static int traerCantDiasDeUnMes (int anio, int mes){
		
		int cantDiasMes=0, i=0, mes1=0;
		
		
		boolean encontrado=false;
		
		boolean Bisiesto=esBisiesto(anio);
		
		int arrayDiasMes[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		//while hasta que finalice o que lo encuentre

		
		while (i<arrayDiasMes.length && !encontrado) {//recorre el array
			
		mes1= mes-1;//mes que entra le resto 1 y lo guardo en la variable mes;
		
		if(mes1==i) {// al recorrer el array si es igual al nro que esta en el mismo
			
		cantDiasMes=arrayDiasMes[i];//lo va pasando del array a la variable cantDiasMes.
		
		}else if (mes1==1 && Bisiesto) {//ES IGUAL A 1 YA QUE EL ARRAY SE CUENTA DESDE CERO.- Y 1 ES FEBRERO.-
			
			cantDiasMes=29;
			
		}else {encontrado=false;}
		
		i++;
		
		mes1=0;
		
		
		}
		
			
		
		return cantDiasMes;
			
				
				
		}
		
		
		//18-APROXIMAR DOS DECIMALES
		
		public static double aproximar2Decimal(double valor) {
		
		//Si el tercer decimal es mayor o igual 5, suma 1 al segundo decimal
			
		double aproximado=0;
				
		aproximado=valor * Math.pow(10, 2); 
		
		/*SE MULTIPLICA EL VALOR POR 10^2 (CANTIDAD DE DECIMALES QUE SE DESEAN OBTENER)
		PARA OBTENER LA PARTE ENTERA DEL DECIMAL QUE INTERESA REDONDEAR*/
		
		aproximado=Math.round(aproximado);//CON MATH.ROUND SE REDONDEA EL VALOR ENTERO ANTERIOR
		
		aproximado= aproximado/Math.pow(10, 2);//SE VUELVE A PASAR A DECIMAL LO QUE SE HABIA TRANSFORMADO EN ENTERO PARA REDONDEAR
			
			
			
		return aproximado;	
		}
		
		//19-NUMERO?
		
		public static boolean esNumero(char c){
		
		String diccionario="0123456789";
		
		boolean numero=false;
		
		int i=0;
		
		//while hasta que finalice o que lo encuentre
		
		while(i<diccionario.length() && !numero) {
			
		numero=(diccionario.charAt(i)==c);
			
		i++;	
			
			
		}
		
		return numero;
		}
		
		
		
		
				
		//20-LETRA?
		public static boolean esLetra(char c){
		
		String diccionarioLetras="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
			
		int i=0;
		
		boolean esLetra=false;
					
		
		while(i<diccionarioLetras.length() && !esLetra){
		
			esLetra=(diccionarioLetras.charAt(i)==c);
			
			i++;
					}
			
		return esLetra;
				}
				
		//21-CADENA DE NROS?
		
		public static boolean esCadenaNros(String cadena){
		
		boolean cadenaNro=false;
		
		int i=0;
					
		while(i<cadena.length() && !cadenaNro){
		
			/*EL METODO ESNUMERO TIENE COMO PARAMETRO UN CHAR POR LO CUAL SE CONVIERTE
						CADENA A CHAR CON LA FUNCION "charAt" */
			
			cadenaNro= esNumero(cadena.charAt(i));
			
			i++;
					}
					return cadenaNro;
				}
				
		//22-CADENA DE LETRAS?
		
		public static boolean esCadenaLetras(String cadena){
		
			boolean cadenaLetras=false;
			
			int i=0;
					
			
			while(i<cadena.length() && !cadenaLetras){
			
				/*EL METODO ESLETRA TIENE COMO PARAMETRO UN CHAR POR LO CUAL SE CONVIERTE
				 CADENA A CHAR CON LA FUNCION "charAt" */
				
				cadenaLetras= esLetra(cadena.charAt(i));
				
				i++;
				
			}
			
			return cadenaLetras;
			
		}
				
         //METODO DOUBLE.-
		
		public static double convertirADouble ( int n ){
			return (( double) n);
			}
		
			
		}

			
	
		
		
			
			
		
        
  
       
        
        
        
        
        
        
        
        
        	

	
	

