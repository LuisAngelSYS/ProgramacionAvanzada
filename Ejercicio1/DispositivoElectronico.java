public abstract class DispositivoElectronico {
	
	protected String marca;
	protected String modelo;
    protected boolean encendido;
	protected int memoria;
	
	
    public DispositivoElectronico(String marca, String modelo, int memoria) {
        this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
		this.encendido = false;
    }
	
	public void encender(){
		this.encendido = true;
		System.out.println("El dispositivo está ON");
	}	
	
	public void apagar(){
		this.encendido = false;
		System.out.println("El dispositivo está OFF");
	}
}
