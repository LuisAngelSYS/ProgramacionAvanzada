public class Tren extends VehiculoTerrestre {
	
	private Transmision transmision;
	private TV tv;
    public Tren(String marca, String modelo, TV tv) {
        super(marca, modelo, new TraccionVapor());
		this.tv = tv;
    }
	
	public String getDescripcion() {
        return "Tipo de Vehículo: Tren (Terrestre), Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
    }
	
	public void setTV(TV tv){
        this.tv = tv;
    }
	
	public TV getTV(){
        return tv;
    }
}
