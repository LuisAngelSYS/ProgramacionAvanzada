import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contador extends JFrame implements Runnable {
	
    private int contador = 0; // Variable para el contador
    private JLabel etiquetaContador; // Etiqueta para mostrar el contador
	private boolean cerrar = false;
	
	
	private static Contador instancia;
	
	public static Contador getInstance() {
        if (instancia == null) {
            instancia = new Contador();
        }
		instancia.iniciar();
        return instancia;
    }

    private Contador() {
        // Configurar el JFrame
        setTitle("Contador");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));

        // Panel para la etiqueta
        JPanel panelEtiqueta = new JPanel();
        etiquetaContador = new JLabel("Contador: 0");
        panelEtiqueta.add(etiquetaContador);
        add(panelEtiqueta);
    }

    // Método para actualizar la etiqueta del contador
    private void actualizarEtiqueta() {
		contador++;
        etiquetaContador.setText("Contador: " + contador);
    }

	@Override
    public void run() {
        while (!cerrar) {
            try {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        actualizarEtiqueta();
                    }
                });
                Thread.sleep(1000); // 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		if(cerrar){
			dispose();
		}
    }
	
	public void detenerYCerrar() {
		System.out.println("El contador se cerrará.");
		cerrar = true;
		dispose();
    }
	
	public void iniciar(){
		cerrar = false;
		contador = 0;
	}
}
