public class Avion extends VehiculoAereo {
	
    public Avion(String marca, String modelo) {
        super(marca, modelo);
    }
	
	public void volar(){
		System.out.println("El avión con Marca: " + marca + ", Modelo: " + modelo + " está volando a " + velocidad + " km/h");
	}	
	
	public String getDescripcion() {
        return "Tipo de Vehículo: Avión (Aéreo), Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
    }
}
