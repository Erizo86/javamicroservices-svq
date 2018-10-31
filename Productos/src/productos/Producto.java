package productos;

public class Producto {
	protected String nombre;
	protected double precio;
	
	//Constructor
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//M�todo calcular: multiplica la cantidad por el precio imprimi�ndolo por pantalla.
	public void calcular(int cantidad) {
		System.out.println("El precio total del producto " + nombre + " es " + precio * cantidad);
	}
}
