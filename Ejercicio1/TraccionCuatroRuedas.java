public class TraccionCuatroRuedas extends TraccionMecanica {
	
	TraccionCuatroRuedas () {
		super("AWD (All Wheel Drive)", true, true);
	}
	
	public String getDescripcion() {
		return "En la tracción + " + nombre + " las ruedas del eje posterior son las que reciben la fuerza del motor y empujan al vehículo. Lo podemos encontrar en autos con mayor potencia y en la mayoría de los autos de competencia.";
	}
}
