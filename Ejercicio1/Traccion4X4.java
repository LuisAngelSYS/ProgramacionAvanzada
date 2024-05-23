public class Traccion4X4 extends TraccionMecanica {
    
	Traccion4X4 () {
		super("4x4", true, true);
	}
	
	public String getDescripcion() {
		return "En la tracción + " + nombre + " la fuerza del motor se reparte en proporción 50 % – 50 % entre los ejes delanteros y traseros de un vehículo.";
	}
}
