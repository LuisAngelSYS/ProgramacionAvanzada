public abstract class Traccion implements Describible{
	protected String nombre;
	
	Traccion (String nombre){
		this.nombre = nombre;
	}
	
	public String getDescripcion(){
		return nombre;
	}
}
