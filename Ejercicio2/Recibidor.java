public class Recibidor {
	
	private Contador contador;
	private HoraActualizada hora;
	private AudioClip audio;
	
	public Recibidor(Contador contador, HoraActualizada hora, AudioClip audio){
		this.contador = contador;
		this.hora = hora;
		this.audio = audio;
	}
	
	public Contador getContador(){
		return contador;
	}
	
	public void setContador(Contador contador){
		this.contador = contador;
	}	
	
	public HoraActualizada getHoraActualizada(){
		return hora;
	}
	
	public void setHoraActualizada(HoraActualizada hora){
		this.hora = hora;
	}

	public AudioClip getAudioClip(){
		return audio;
	}	
	
	public void setAudioClip(AudioClip audio){
		this.audio = audio;
	}
}

	
	