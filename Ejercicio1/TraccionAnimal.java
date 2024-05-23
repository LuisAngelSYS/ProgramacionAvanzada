public class TraccionAnimal extends Traccion {
    TraccionAnimal () {
		super("Animal");
	}
	
	public String getDescripcion() {
		return "En la tracción + " + nombre + " se emplean animales domésticos para ejercer el impulso del vehículo.";
	}
}
