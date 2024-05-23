import java.io.*;

public class ContadorOff implements Comando {
	
	private Contador contador;
	
	public ContadorOff(Contador contador){
		this.contador = contador;
	}
	
    public void ejecutar(){
		contador.detenerYCerrar();
		
		System.out.println("CONTADOR APAGADO");
	}
}

