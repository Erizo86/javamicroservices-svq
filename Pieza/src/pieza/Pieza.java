package pieza;

public abstract class Pieza {
	//Dado que las operaciones básicas de la clase son Unir y Cortar, asumimos que:
	//El atributo numero define el numero de partes que tiene una pieza
	private int numero;
	//El atributo nombre es el identificador de la pieza
	private String nombre;
	
	public Pieza(int numero, String nombre) {
		super();
		this.numero = numero;
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void unir() {
		System.out.println("La pieza " + nombre + " se ha unido en 1 sola parte");
		numero = 1;
	}
	
	public boolean cortar (int n) {
		System.out.println("La pieza " + nombre + " se ha dividido en " + n + " partes");
		this.numero = n;
		return true;
	}
	
	public abstract void vender (int cantidad);
}
