public class Main {
	
    public static void main(String[] args) {
        
		System.out.println("-------------------------------------------------------------------");
		Taxi taxiDeDonJose = new Taxi("Hyundai", "Atos", new TraccionDelantera(), new TransmisionManual(5));
		taxiDeDonJose.setLibre(false);
		taxiDeDonJose.acelerar();
		taxiDeDonJose.acelerar();
		
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
		Tren trenDeLaSabana = new Tren("Siemens", "AG");
		trenDeLaSabana.acelerar();

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
