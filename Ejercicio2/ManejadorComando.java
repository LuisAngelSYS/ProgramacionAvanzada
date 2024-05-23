 import java.util.*;
 
public class ManejadorComando implements Manejador {
	
	private Manejador siguienteNivel;	
	
	public void setManejador(Manejador siguiente) {
		this.siguienteNivel = siguiente;
	}
	
	public void aplicar(Invocador invocador, Recibidor recibidor, String mensaje) {
		
		if(ConjuntoDeInstrucciones.instruccionCorrecta(mensaje)) {
			if(mensaje.toUpperCase().equals("TIME")){
				recibidor.setHoraActualizada(HoraActualizada.getInstance());
				invocador.agregarComando(new TiempoOn(recibidor.getHoraActualizada()));
			}
			else if(mensaje.toUpperCase().equals("TIME OFF")){
				recibidor.setHoraActualizada(HoraActualizada.getInstance());
				invocador.agregarComando(new TiempoOff(recibidor.getHoraActualizada()));
			}
			else if (mensaje.toUpperCase().equals("SONG")){
				recibidor.setAudioClip(AudioClip.getInstance());
				invocador.agregarComando(new CancionOn(recibidor.getAudioClip()));
			}
			else if (mensaje.toUpperCase().equals("SONG OFF")){
				recibidor.setAudioClip(AudioClip.getInstance());
				invocador.agregarComando(new CancionOff(recibidor.getAudioClip()));
			}
			else if (mensaje.toUpperCase().equals("COUNTER")){	
				recibidor.setContador(Contador.getInstance());				
				invocador.agregarComando(new ContadorOn(recibidor.getContador()));
			}
			else if(mensaje.toUpperCase().equals("COUNTER OFF")){
				recibidor.setContador(Contador.getInstance());				
				invocador.agregarComando(new ContadorOff(recibidor.getContador()));
			}				
			else if (mensaje.toUpperCase().equals("CLS")){
				invocador.agregarComando(new LimpiarPantalla());
			}				
			else if(mensaje.toUpperCase().equals("COMMIT")){
				invocador.aplicarEnBloque();
			}
		}
		else {
			siguienteNivel.aplicar(invocador, recibidor, mensaje);
		}
	}
	
	public Manejador getManejador() {
		return siguienteNivel;
	}
}
