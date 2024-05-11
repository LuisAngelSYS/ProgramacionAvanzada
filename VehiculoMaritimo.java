public abstract class VehiculoMaritimo extends Vehiculo {
	
	public VehiculoMaritimo(String marca, String modelo) {
        super(marca, modelo);
	}
	
	public String getDescripcion() {
        return "Tipo de Vehículo: Maritimo, Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
    }
}
