public abstract class Transmision implements Describible{
	protected String nombre;
	
	Transmision(String nombre){
		this.nombre = nombre;		
	}
	
	public String getDescripcion(){
		return nombre;
	}
}
