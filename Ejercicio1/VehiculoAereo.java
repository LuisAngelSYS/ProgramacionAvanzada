public abstract class VehiculoAereo extends Vehiculo {
	
	public VehiculoAereo(String marca, String modelo) {
        super(marca, modelo);
	}
	
	public String getDescripcion() {
        return "Tipo de Vehículo: Aéreo, Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
    }
}
