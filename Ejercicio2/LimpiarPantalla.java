import java.io.*;

public class LimpiarPantalla implements Comando {
	
    public void ejecutar(){
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } 
		catch (Exception e) {
        }
	}
}

