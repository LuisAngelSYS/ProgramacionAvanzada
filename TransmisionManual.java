public class TransmisionManual extends Transmision{
	protected int marchas;
	
	TransmisionManual(int marchas){
		super("Standard");
		this.marchas = marchas;
	}
	
	public String getDescripcion(){
		return "Transmisión " + nombre + " de " + marchas + " marchas.";
	}
}
