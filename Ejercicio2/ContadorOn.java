import javax.swing.*;
import java.awt.*;


public class ContadorOn implements Comando {
	
	private Contador contador;
	
	public ContadorOn(Contador contador){
		this.contador = contador;
	}
	
    public void ejecutar(){
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				contador.setVisible(true);

				// Crear y empezar el hilo de actualización
				Thread hilo = new Thread(contador);
				hilo.start();
			}
		});
		
		System.out.println("CONTADOR ACTIVADO");
	}
}

