import java.io.*;

public class CancionOn implements Comando {
	
	private AudioClip audio;
	
	public CancionOn(AudioClip audio){
		this.audio = audio;
	}
	
    public void ejecutar(){
		Thread hilo = new Thread(audio);
		hilo.start();
		
		System.out.println("SONANDO CANCIÓN");
	}
}

