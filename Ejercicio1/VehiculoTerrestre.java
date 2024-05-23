public abstract class VehiculoTerrestre extends Vehiculo {
	protected Traccion traccion;
	
    public VehiculoTerrestre(String marca, String modelo, Traccion traccion) {
        super(marca, modelo);
		this.traccion = traccion;
    }
	
	public String getDescripcion() {
        return "Tipo de Vehículo: Terrestre, Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
    }
}
