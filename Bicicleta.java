public class Bicicleta extends VehiculoTerrestre {
	
    public Bicicleta(String marca, String modelo) {
        super(marca, modelo, new TraccionHumana());
    }
	
	public String getDescripcion() {
        return "Tipo de Vehículo: Bicicleta (Terrestre), Tracción: Humana, Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
    }
}