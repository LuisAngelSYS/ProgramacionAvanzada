public class Producto {
    private String nombre;
    private int cantidad;
    private long precio;

    public Producto(String nombre, int cantidad, long precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getPrecio() {
        return precio;
    }
	
	public void setPrecio(long precio) {
        this.precio = precio;
    }
}
