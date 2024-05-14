public class TV extends DispositivoElectronico {
	
	private int tamanoPantalla;
	private String resolucion;
	private int canal;
	private int volumen;
	
    public TV(String marca, String modelo, int memoria, int tamanoPantalla, String resolucion) {
		super(marca, modelo, memoria);
		this.tamanoPantalla = tamanoPantalla;
		this.resolucion = resolucion;
		this.canal = 0;
		this.volumen = 0;
    }
	
	public void cambiarCanal(int cambio){
		this.canal+=cambio;
	}	
	
	public void cambiarVolumen(int cambio){
		this.volumen+=cambio;
	}
	
	public int getVolumen(){
		return volumen;
	}
	
	public int getCanal(){
		return canal;
	}
}
