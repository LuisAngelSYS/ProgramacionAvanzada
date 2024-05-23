public class TransmisionAutomatica extends Transmision{
	
	TransmisionAutomatica(){
		super("Automática");
	}
	
	public String getDescripcion(){
		return "Transmisión " + nombre + ".";
	}
}
