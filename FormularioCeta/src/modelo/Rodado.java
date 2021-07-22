package modelo;

public class Rodado {
	
	private int idRodado;
	private String dominio;
	private int modelo;
	private String marca;
	
	public Rodado(){}//CONSTRUCTOR VACIO
	public Rodado(int idRodado, String dominio, int modelo, String marca)throws Exception {//CONSTRUCTOR CON EXCEPTION
		this.idRodado = idRodado;
		this.setDominio (dominio);
		this.modelo = modelo;
		this.marca = marca;
	}
	public int getIdRodado() {
		return idRodado;
	}
	public void setIdRodado(int idRodado) {
		this.idRodado = idRodado;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio)throws Exception {
		
		if (validarDominio(dominio)==false) throw new Exception("ERROR-->Dominio no valido");
		else this.dominio = dominio;
		
	}
	
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
/*	@Override
	public String toString() {
		return "Rodado [idRodado=" + idRodado + ", dominio=" + dominio + ", modelo=" + modelo + ", marca=" + marca
				+ "]";
	}*/
	
	/* ******METODOS****** */
	

//VALIDAR DOMINIO
	public boolean validarDominio(String dominio)throws Exception{
		char[] patenteVieja;
		char[] patenteNueva;
		int longDominio=dominio.length();
		boolean patenteCorrecta=false;
		int i=0;
		
		
		if(longDominio==6){
			patenteVieja=dominio.toCharArray();
			for(i=0; i<patenteVieja.length;i++){
				if(i<3 && Funciones.esLetra(patenteVieja[i])==true && Funciones.esNumero(patenteVieja[i])==false && patenteVieja[i]!=' ') {
					patenteCorrecta=true;
				}
				else if(i>=3 && Funciones.esNumero(patenteVieja[i])==true){
					patenteCorrecta=true;
				}
				
				else{
					patenteCorrecta=false;
				}
				
			}
		}
		else if (longDominio==7 ){
			patenteNueva=dominio.toCharArray();
			for(i=0; i<patenteNueva.length;i++){
				
				if((i<2||i>4) && Funciones.esLetra(patenteNueva[i])==true && Funciones.esNumero(patenteNueva[i])==false){
					patenteCorrecta=true;
				}
				else if(i>=2 && i<=4 && Funciones.esNumero(patenteNueva[i])==true){
					patenteCorrecta=true;
				}
			
				else{
					patenteCorrecta=false;
				}
			}
		}
	   return patenteCorrecta;
	}


}//FIN RODADO
