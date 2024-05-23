public class ManejadorTransaccion implements Manejador {
	
	private Manejador siguienteNivel;	
	
	public void setManejador(Manejador siguiente) {
		this.siguienteNivel = siguiente;
	}
	
	public void aplicar(Invocador invocador, Recibidor recibidor, String mensaje) {		
		if(ConjuntoDeInstrucciones.esCommit(mensaje.trim())) {
			invocador.aplicarEnBloque();
		}
	}
	
	public Manejador getManejador() {
		return siguienteNivel;
	}
}
