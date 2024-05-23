public class ManejadorGeneral implements Manejador {
	private Manejador siguienteNivel;
	
	public void setManejador(Manejador siguiente) {
		this.siguienteNivel = siguiente;
	}
	
	public void aplicar(Invocador invocador, Recibidor recibidor, String mensaje) {
		ManejadorMensaje mm = new ManejadorMensaje();
		ManejadorComando mc = new ManejadorComando();
		ManejadorTransaccion mt = new ManejadorTransaccion();
		
		this.siguienteNivel = mm;
		mm.setManejador(mc);
		mc.setManejador(mt);
		
		siguienteNivel.aplicar(invocador, recibidor, mensaje);
	}
	
	public Manejador getManejador() {
		return siguienteNivel;
	}
}
