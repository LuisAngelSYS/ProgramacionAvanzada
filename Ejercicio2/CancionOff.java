import java.io.*;

public class CancionOff implements Comando {
	
	private AudioClip audio;
	
	public CancionOff(AudioClip audio){
		this.audio = audio;
	}
	
    public void ejecutar(){
		if (this.audio == null) {
			System.out.println("AUDIO NULO.......");
		}
		else {
			this.audio.close();
		}
			
		
		
		System.out.println("SONANDO APAGADA");
	}
}

