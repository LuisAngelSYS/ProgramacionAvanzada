public class Taxi extends VehiculoTerrestre {
	private Transmision transmision;
	private boolean libre;
	private Computador computador;
	
    public Taxi(String marca, String modelo, Traccion traccion, Transmision transmision, Computador computador) {
        super(marca, modelo, traccion);
		this.transmision = transmision;
		this.computador = computador;
		this.libre = true;
    }
	
	public String getDescripcion() {
		
		String estado = "Estado: libre";
		
		if(!libre)
			estado = "Estado: ocupado";
		
        return "Tipo de Vehículo: Taxi (Terrestre), Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h, " + estado;
    }
	
	public void setLibre(boolean libre){
		this.libre = libre;
	}
	
	public boolean getLibre(){
		return libre;
	}
	
	public void setComputador(Computador computador){
		this.computador = computador;
	}
	
	public Computador getComputador(){
		return computador;
	}
	
}