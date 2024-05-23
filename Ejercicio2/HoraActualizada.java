import java.time.LocalDateTime;

public class HoraActualizada implements Runnable {
	
	private boolean continuar = true;
	
	private static HoraActualizada instancia;
	
	private HoraActualizada(){
		
	}
	
	public static HoraActualizada getInstance() {
        if (instancia == null) {
            instancia = new HoraActualizada();
        }
		instancia.activar();
        return instancia;
    }
    
    public void run(){
        try{
            while(continuar) {
				LocalDateTime datetime = LocalDateTime.now();				
                System.out.println("Hora " + datetime);
                Thread.sleep(1200);
            }
        }
		catch(Exception ex){
            System.out.println("Exception: " + ex);
        }
    }
	
	public void detener(){
		continuar = false;
    }
	
	public void activar(){
		continuar = true;
    }
}
