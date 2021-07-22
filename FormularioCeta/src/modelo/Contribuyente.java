package modelo;

public class Contribuyente {
	
	private int idContribuyente;
	private String apellido;
	private String nombre;
	private long dni;
	private char sexo;
	private String cuil;
	
	public Contribuyente(){}
	
	public Contribuyente(int idContribuyente, String apellido, String nombre, long dni, char sexo, String cuil)throws Exception {
		this.idContribuyente = idContribuyente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.setSexo(sexo);
		this.setCuil(cuil);
	}
		
	public int getIdContribuyente() {
		return idContribuyente;
	}
	public void setIdContribuyente(int idContribuyente) {
		this.idContribuyente = idContribuyente;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) throws Exception {	
		if(validarSexo(sexo)==false) throw new Exception("Error al cargar sexo");
		else this.sexo=sexo;
		
	}
	
	public String getCuil() {
		return cuil;
	}
	
	public void setCuil(String cuil)throws Exception {
		if (validarCuil(cuil)==false)throw new Exception("Error al cargar CUIL");
		else this.cuil=cuil ;
	}
	
	@Override
	public String toString() {
		return "Contribuyente [idContribuyente=" + idContribuyente + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", dni=" + dni + ", sexo=" + sexo + ", cuil=" + cuil + "]";
	}
	
	
	
	/* ******* METODOS ******** */
	
	
	//VALIDAR SEXO// SIEMPRE LAS EXCEPCIONES SE HACEN EN EL SET...
	
	public boolean validarSexo(char sexo) throws Exception{ 
		boolean validarSexo=false; 
		if(sexo=='F'|| sexo=='M'){
			validarSexo=true;
		}
		return validarSexo; 
	}

	 //VALIDAR CUIL
	        public boolean validarCuil(String cuil) throws Exception{
			int i=0,valor1=0,valor2=0,valor3=0;
			boolean validarCuil=false;
			boolean vCuil1=false;
			boolean vCuil2=false;
			int arrayNro[]={5, 4, 3, 2, 7, 6, 5, 4, 3, 2};
			int cuilArray[]=new int[cuil.length()];
			int j=1;
			
			for(i=0;i<cuilArray.length;i++){
				j=i+1;
				cuilArray[i]=Integer.parseInt(cuil.substring(i,j));
				j=0; //vuelvo j=0 para que no me arrastre la suma anterior
			}
				
			for(i=0;i<cuilArray.length-1;i++){
			if((sexo=='m'|| sexo=='M')&&(cuilArray[1]==0)){ //compruebo si es M tiene que iniciar en 20..pero solo tomo el 0 para verificar
			vCuil1=true;
			valor1=valor1+arrayNro[i]*cuilArray[i];
			}else{		
				 if((sexo=='f'|| sexo=='F')&&(cuilArray[1]==7)){//Idem masculino solo que F comienza en 27..
				 vCuil1=true;
				 valor1=valor1+arrayNro[i]*cuilArray[i];
				 }else{
					   if(sexo!='m'|| sexo!='M'|| sexo!='f'|| sexo!='F'){
							vCuil1=false;
					   }
					}
				}
			}//cierro for
	
				
		valor2=valor1%11;
		valor3=11-valor2;
		
		for(i=0;i<cuilArray.length-1;i++){
				if(cuilArray[10]==valor3){ //verifico que el ultimo valor del cuil sea igual al resultado del valor3 obtenido
				vCuil2=true;
				}	
		}//cierro for
			
			if(vCuil1==true && vCuil2==true){
				validarCuil=true;
			}else{
				if(vCuil1==false || vCuil2==false ){
					validarCuil=false;
				}
			}//cierro if
			
		return validarCuil;
	}
		 

}//FIN

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

