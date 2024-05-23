public abstract class TraccionMecanica extends Traccion{
	protected boolean traccionAdelante;
	protected boolean traccionAtras;
	
	TraccionMecanica (String nombre, boolean traccionAdelante, boolean traccionAtras){
		super(nombre);
		this.traccionAdelante = traccionAdelante;
		this.traccionAtras = traccionAtras;
	}
	
	public String getDescripcion() {
		String descripcion = "La tracción " + nombre;
		if(traccionAdelante && traccionAtras){
			descripcion += " tiene tracción adelante y atrás.";
		}
		else if(traccionAdelante && !traccionAtras){
			descripcion += " tiene tracción solamente adelante.";
		}
		else if(!traccionAdelante && traccionAtras){
			descripcion += " tiene tracción solamente atrás.";
		}
		else {
			descripcion += " no tiene definido el lugar donde esta se ejerce.";
		}
        
		return descripcion;
    }
}