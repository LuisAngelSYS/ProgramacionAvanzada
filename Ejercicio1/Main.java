public class Main {
	
    public static void main(String[] args) {
        
		System.out.println("-------------------------------------------------------------------");
		Computador computador = new Computador("DELL", "Latitude", 16);
		
		Taxi taxiDeDonJose = new Taxi("Hyundai", "Atos", new TraccionDelantera(), new TransmisionManual(5), computador);
		taxiDeDonJose.setLibre(true);
		taxiDeDonJose.acelerar();
		taxiDeDonJose.acelerar();
		taxiDeDonJose.getComputador().encender();
		taxiDeDonJose.getComputador().cargarProcesos(3);
		taxiDeDonJose.getComputador().cargarProcesos(1);
		taxiDeDonJose.getComputador().liberarProcesos(2);
		System.out.println("El taxi de don Josè tiene un computador con " + taxiDeDonJose.getComputador().getProcesosEnEjecucion() + " procesos cargados.");
		taxiDeDonJose.getComputador().apagar();
		
		System.out.println("-------------------------------------------------------------------");
		Moto motoDelProfe = new Moto("Yamaha", "R1", new TransmisionManual(5));
		motoDelProfe.acelerar();
		motoDelProfe.frenar();
		
		System.out.println("-------------------------------------------------------------------");
		Bicicleta miBicicleta = new Bicicleta("Scott", "Foil");
		miBicicleta.acelerar();
		miBicicleta.frenar();
		
		System.out.println("-------------------------------------------------------------------");
		Avion mirageIII = new  Avion("Mirage", "III");
		mirageIII.acelerar();
		mirageIII.acelerar();
		mirageIII.acelerar();
		mirageIII.volar();
		
		System.out.println("-------------------------------------------------------------------");
		TV tv = new TV("LG", "Ultimate", 32, 16, "1021 x 768");
		Tren trenDeLaSabana = new Tren("Siemens", "AG", tv);
		trenDeLaSabana.acelerar();
		trenDeLaSabana.getTV().encender();
		trenDeLaSabana.getTV().cambiarVolumen(7);
		System.out.println("El volumen del TV del tren es " + trenDeLaSabana.getTV().getVolumen());
		trenDeLaSabana.getTV().apagar();

        Vehiculo[] vehiculos = new Vehiculo[5];
        vehiculos[0] = taxiDeDonJose;
        vehiculos[1] = motoDelProfe;
        vehiculos[2] = miBicicleta;
        vehiculos[3] = mirageIII;
		vehiculos[4] = trenDeLaSabana;
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("DESCRIPCIÓN POLIMÓRFICA:");
		System.out.println("-------------------------------------------------------------------");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getDescripcion());
			System.out.println();
        }
    }
}
