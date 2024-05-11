public class Tren extends VehiculoTerrestre {
	
	private Transmision transmision;
	
    public Tren(String marca, String modelo) {
        super(marca, modelo, new TraccionVapor());
    }
	
	public String getDescripcion() {
        return "Tipo de Vehículo: Tren (Terrestre), Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
    }
}
