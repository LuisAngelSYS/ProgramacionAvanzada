public class HolaMundo {
	public static void main(String[] args){
		Persona luis = new Persona(20000000, 'm', "Luis", 30);
		Pez nemo = new Pez();
		nemo.respirar();		
		nemo.reproducir();

		luis.caminar();
		luis.caminar(5);
		
		luis.respirar();
		luis.trabajar();
		luis.reproducir();
		
		System.out.println("Edad:" + luis.getEdad());
		System.out.println("Especie:" + luis.getEspecie());
		System.out.println("Descansar:" + luis.descansar());
	}
}
