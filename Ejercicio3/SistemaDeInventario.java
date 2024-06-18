public class SistemaDeInventario {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
		
		System.out.println("----------------------------------------------------------------------");
        try {
            inventario.agregarProducto("Manzanas", 100, 5);
            inventario.agregarProducto("Naranjas", 80, 6);

            inventario.mostrar();
            inventario.venderProducto("Manzanas", 30);
			
			// 80 - 90 lanza la excepción (personalizada) de stock insuficiente
            inventario.venderProducto("Naranjas", 90);

            inventario.mostrar();
        } 
		catch (ProductoNoEncontradoException | StockInsuficienteException | EntradaInvalidaException e) {
            System.err.println(e.getMessage());
        }
		
		System.out.println("----------------------------------------------------------------------");
        try {
            inventario.mostrar();

			// Aquí se lanza la excepción (personalizada) de producto no encontrado
            inventario.venderProducto("Peras", 20); 

            inventario.mostrar();
        } 
		catch (ProductoNoEncontradoException | StockInsuficienteException | EntradaInvalidaException e) {
            System.err.println(e.getMessage());
        }
		
		System.out.println("----------------------------------------------------------------------");
        try {
            inventario.mostrar();
			
			// Aquí se lanza la excepción (personalizada) de entrada inválida
			inventario.agregarProducto("Manzanas", -100, -5);

            inventario.mostrar();
        } 
		catch (EntradaInvalidaException e) {
            System.err.println(e.getMessage());
        }
		
		System.out.println("----------------------------------------------------------------------");
        try {
			inventario.setPrecioProducto("Manzanas", 0); // El precio cero es para provocar un error aritmético
			inventario.venderProducto("Manzanas", 70);
			
			inventario.mostrar();

			// Aquí se lanza la excepción ArithmeticException por una división por cero
            inventario.mostrarPorcentajeInventario();
        } 
		catch (ArithmeticException e) {
            System.err.println("ERROR ARITMÉTICO:" + e.getMessage());
		} 
		catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
		
		System.out.println("----------------------------------------------------------------------");
        try {
			Producto producto = null;
			producto = inventario.getProductoPorNombre("Manzanas");
			System.out.println("El producto " + producto.getNombre() + " existe");
			
			producto = inventario.getProductoPorNombre("Ciruelas");
			// Aquí se lanza la excepción NullPointerException porque no encuentra ciruelas
			System.out.println("El producto " + producto.getNombre() + " existe");

        } 
		catch (NullPointerException e) {
            System.err.println("ERROR DE PUNTERO NULO:" + e.getMessage());
		} 
		catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
		
		System.out.println("----------------------------------------------------------------------");
        try {
			Producto producto = null;
			producto = inventario.getProductoPorNombre("Manzanas");
			System.out.println("El producto Manzanas tiene " + Integer.parseInt(producto.getCantidad() + ""));
			
			// Aquí se lanza la excepción NumberFormatException porque no puede convertir el nombre en entero
			System.out.println("El producto Manzanas tiene " + Integer.parseInt(producto.getNombre()));

        } 
		catch (NumberFormatException e) {
            System.err.println("ERROR DE DE FORMATO DE NÚMERO:" + e.getMessage());
		} 
		catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
		
		System.out.println("----------------------------------------------------------------------");
    }
}

