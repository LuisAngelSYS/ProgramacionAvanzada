public class ManejadorMensaje implements Manejador {
	
	private Manejador siguienteNivel;	
	
	public void setManejador(Manejador siguiente) {
		this.siguienteNivel = siguiente;
	}
	
	public void aplicar(Invocador invocador, Recibidor recibidor, String mensaje) {
		
		if(!ConjuntoDeInstrucciones.instruccionCorrecta(mensaje)) {
			System.out.println("MENSAJE: " + mensaje);
		}
		else {
			siguienteNivel.aplicar(invocador, recibidor, mensaje);
		}
	}
	
	public Manejador getManejador() {
		return siguienteNivel;
	}
}
