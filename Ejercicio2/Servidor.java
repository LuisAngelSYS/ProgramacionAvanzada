import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;

public class Servidor {
    private static final int puerto = 30000;
	
	private static Contador contador;
	private static HoraActualizada hora;
	private static AudioClip audio;

    public static void main(String[] args) {
		System.out.println("....................................................................\n");
		System.out.println("....................................................................\n");
		System.out.println("....................................................................\n");
		System.out.println("....................................................................\n");		
		System.out.println("SERVER ONLINE");
		
        try {
			ServerSocket socketServidor = new ServerSocket(puerto);
            Socket socketCliente = socketServidor.accept();
            System.out.println("SE HA CONECTADO UN CLIENTE");

            BufferedReader in = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            PrintWriter out = new PrintWriter(socketCliente.getOutputStream(), true);

            String mensaje = "";
			
			Invocador invocador = new Invocador();
			Recibidor recibidor = new Recibidor(contador, hora, audio);
			ManejadorGeneral manejadorGeneral = new ManejadorGeneral();
            
			while ((mensaje = in.readLine()) != null) {
				hora = HoraActualizada.getInstance();
				audio = AudioClip.getInstance();
				contador = Contador.getInstance();
				manejadorGeneral.aplicar(invocador, recibidor, mensaje);
				
                out.println("Echo: " + mensaje);
            }
			
            System.out.println("CLIENTE DESCONECTADO");
        } 
		catch (IOException e) {
            //e.printStackTrace();
			System.out.println("FIN CONEXIÓN");
			
        }
    }
}
