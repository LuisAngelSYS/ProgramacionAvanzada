public interface Manejador{
	public void setManejador(Manejador siguiente);
	public void aplicar(Invocador invocador, Recibidor recibidor, String mensaje);
	public Manejador getManejador();
}
