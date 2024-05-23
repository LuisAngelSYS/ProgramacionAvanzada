public class Computador extends DispositivoElectronico {
	
	private int procesosEnEjecucion;
	private int memoriaOcupada;
	
    public Computador(String marca, String modelo, int memoria) {
		super(marca, modelo, memoria);
		this.procesosEnEjecucion = 0;
    }
	
	public void cargarProcesos(int procesos){
		this.procesosEnEjecucion+=procesos;
	}	
	
	public void liberarProcesos(int procesos){
		this.procesosEnEjecucion-=procesos;
	}
	
	public int getProcesosEnEjecucion(){
		return procesosEnEjecucion;
	}	
}