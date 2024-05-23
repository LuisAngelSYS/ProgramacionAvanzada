import java.util.*;

public class ConjuntoDeInstrucciones {
	private static final String commit = "COMMIT";
	
	private static List<String> instrucciones = Arrays.asList(
	    "TIME",
		"TIME OFF",
		"SONG",
		"SONG OFF",
		"COUNTER",
		"COUNTER OFF",
		"CLS",
		"COMMIT"
	);
	
	
	public static boolean esCommit(String mensaje){		
		return commit.equals(mensaje.trim().toUpperCase());
	}
	
	public static boolean instruccionCorrecta(String mensaje){
		String resultado = instrucciones.stream()
                         .filter(s -> s.equalsIgnoreCase(mensaje.trim()))
                         .findFirst()
                         .orElse(null);
						 
		return resultado != null;
	}
}

