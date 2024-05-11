public abstract class SerVivo {
	int edad;
	char genero;
	String especie;
	String nombre;
	
	public SerVivo(){
		this.edad = -20;
	}
	
	
	public SerVivo(int edad, char genero, String especie, String nombre){
		this.edad = edad;
		this.genero = genero;
		this.especie = especie;
		this.nombre = nombre;
	}
	
	public void reproducir(){
		System.out.println("Los seres vivos se están reproduciento.");
	}
	
	
	public abstract void respirar();
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setEspecie(String especie){
		this.especie = especie;
	}
	
	public String getEspecie(){
		return especie;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setGenero(char genero){
		this.genero = genero;
	}
	
	public char getGenero(){
		return genero;
	}
}