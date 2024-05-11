public abstract class Vehiculo implements MedioTransportable, Describible {
    protected String marca;
	protected String modelo;
    protected int velocidad;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

	public String getDescripcion(){
		return "Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h";
	}
	
	public void acelerar(){
		 this.velocidad++;
		 System.out.println("Se ha acelerado el vehículo de marca " + marca + ", modelo " + modelo + " y su velocidad actual es " + velocidad + " km/h.");
	}
	
    public void frenar(){
		this.velocidad = 0;
		System.out.println("Se ha detenido el vehículo de marca " + marca + ", modelo " + modelo + ".");
	}
}
