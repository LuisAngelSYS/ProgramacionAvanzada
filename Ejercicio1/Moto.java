public class Moto extends VehiculoTerrestre {
	private Transmision transmision;
	
    public Moto(String marca, String modelo, Transmision transmision) {
        super(marca, modelo, new TraccionTrasera());
		this.transmision = transmision;
    }
	
	public String getDescripcion() {
        return "Tipo de Vehículo: Moto (Terrestre), Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
    }
}