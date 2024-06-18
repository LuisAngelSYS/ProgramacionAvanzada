import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Producto> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    public void agregarProducto(String nombre, int cantidad, long precio) throws EntradaInvalidaException {
        if (cantidad < 0 || precio < 0) {
            throw new EntradaInvalidaException("ERROR DE ENTRADA INVÁLIDA: La cantidad y el precio deben ser valores positivos.");
        }
        productos.put(nombre, new Producto(nombre, cantidad, precio));
    }

    public void venderProducto(String nombre, int cantidad) throws ProductoNoEncontradoException, StockInsuficienteException, EntradaInvalidaException {
        if (cantidad < 0) {
            throw new EntradaInvalidaException("ERROR DE ENTRADA INVÁLIDA: La cantidad a vender debe ser un valor positivo.");
        }

        Producto producto = productos.get(nombre);
        if (producto == null) {
            throw new ProductoNoEncontradoException("ERROR PRODUCTO NO ENCONTRADO: El producto " + nombre + " no se encuentra en el inventario.");
        }

        if (producto.getCantidad() < cantidad) {
            throw new StockInsuficienteException("ERROR NO STOCK: Stock insuficiente para el producto " + nombre + ".");
        }

        producto.setCantidad(producto.getCantidad() - cantidad);
    }
	
	public void setPrecioProducto(String nombre, long precio) throws ProductoNoEncontradoException {
        Producto producto = productos.get(nombre);
        if (producto == null) {
            throw new ProductoNoEncontradoException("ERROR PRODUCTO NO ENCONTRADO: El producto " + nombre + " no se encuentra en el inventario.");
        }

        producto.setPrecio(precio);
    }
	

    public void mostrar() {
		for (Producto producto : productos.values()) {			
            System.out.println("Producto: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad() + ", Precio: " + producto.getPrecio());
        }
    }
	
	public void mostrarPorcentajeInventario() {
		for (Producto producto : productos.values()) {			
            System.out.println("Producto: " + producto.getNombre() + ", Porcentaje (%): " + getPorcentajeInventario(producto.getNombre()) );
        }
    }
	
	public Producto getProductoPorNombre(String nombreProducto) {
		Producto productoObtenido = null;
        
		for (Producto producto : productos.values()) {
			if(producto.getNombre().equals(nombreProducto)){
				productoObtenido = producto;
			}			
        }
		
		return  productoObtenido;
    }
	
	
	private double getPorcentajeInventario(String nombreProducto) {
	
		Producto producto = productos.get(nombreProducto);
		
		return  (1 / (getTotalInventario() / producto.getPrecio()) ) * 100;
    }
	
	private long getTotalInventario() {
		long totalInventario = 0;
        
		for (Producto producto : productos.values()) {
			totalInventario += producto.getPrecio();
        }
		
		return  totalInventario;
    }
}
