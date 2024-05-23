import java.io.*;

public class TiempoOn implements Comando {
	
	private HoraActualizada hora;
	
	public TiempoOn(HoraActualizada hora){
		this.hora = hora;
	}
	
    public void ejecutar(){		
		Thread hilo = new Thread(hora);
		hilo.start();						
		System.out.println("HORA ACTIVADA");
	}
}

