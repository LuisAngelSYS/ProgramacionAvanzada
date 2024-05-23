import java.util.ArrayList;
import java.util.List;

public class Invocador {
	
	private List<Comando> comandos = new ArrayList<>();

    public void agregarComando(Comando comando){
		this.comandos.add(comando);
	}
	
	public void aplicarEnBloque(){
		
		this.comandos.forEach(x -> x.ejecutar());
		this.comandos.clear();
	}	
}

