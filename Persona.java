public class Persona extends SerVivo implements Trabajar{
	private int salario;
	
	public Persona(int salario, char genero, String nombre, int edad){
		super(edad, genero, "Homo Sapiens Sapiens", nombre);
		this.salario = salario;		
	}
	
	public  void respirar(){
		System.out.println("Estoy respirando como " + super.especie);
	}
	
	public void caminar(){
		System.out.println("Estoy caminando");
	}
	
	public void caminar(int kilometros){
		System.out.println("Hoy amanecí animado y caminé " + kilometros + " kilómetros.");
	}
	
	public void trabajar(){
		System.out.println("Estoy trabajando");
	}
	
	public int descansar(){
		return 1;
	}
}