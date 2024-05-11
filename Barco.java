public class Barco extends VehiculoMaritimo {
	
    public Barco(String marca, String modelo) {
        super(marca, modelo);
    }
	
	public void navegar(){
		System.out.println("El barco con Marca: " + marca + ", Modelo: " + modelo + " está navegando a " + velocidad + " km/h");
	}	
	
	public String getDescripcion() {
        return "Tipo de Vehículo: Barco (Maritimo), Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
    }
	
}

