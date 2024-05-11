public class TraccionVapor extends Traccion {
    TraccionVapor () {
		super("Traccion por Vapor");
	}
	
	public String getDescripcion() {
		return "En la tracción + " + nombre + " se emplea principalmente para locomotoras.";
	}
}
