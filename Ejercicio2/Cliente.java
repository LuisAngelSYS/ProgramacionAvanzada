import java.io.*;
import java.net.*;

public class Cliente {
    private static final String direccionServidor = "localhost";
    private static final int puerto = 30000;
	
    public static void main(String[] args) {
		System.out.println("....................................................................\n");
		System.out.println("....................................................................\n");
		System.out.println("....................................................................\n");
		System.out.println("....................................................................\n");
		System.out.println("CLIENTE ONLINE");
		
        try {
			Socket socket = new Socket(direccionServidor, puerto);
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.println("Nos hemos conectado al servidor " + direccionServidor + " en el puerto: " + puerto + "\n");

            String entradaDeUsuario = "";
            while ((entradaDeUsuario = input.readLine()) != null) {
				if(entradaDeUsuario.toUpperCase().equals(".")){
					break;
				}
                out.println(entradaDeUsuario);
                System.out.println("Respuesta de servidor: " + in.readLine());
            }
        }
		catch (IOException e) {
            e.printStackTrace();
        }
    }
}
