import java.io.*;

public class TiempoOff implements Comando {
	
	private HoraActualizada hora;
	
	public TiempoOff(HoraActualizada hora){
		this.hora = hora;
	}
	
    public void ejecutar(){
		hora.detener();
		System.out.println("HORA APAGADA");
	}
}

