package pieza;

public class Plancha extends Pieza {
	private float largo;
	private float ancho;
	private float espesor;
	public Plancha(int numero, String nombre, float largo, float ancho, float espesor) {
		super(numero, nombre);
		this.largo = largo;
		this.ancho = ancho;
		this.espesor = espesor;
	}
	public float getLargo() {
		return largo;
	}
	public void setLargo(float largo) {
		this.largo = largo;
	}
	public float getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public float getEspesor() {
		return espesor;
	}
	public void setEspesor(float espesor) {
		this.espesor = espesor;
	}
	
	public void unir() {
		largo *= getNumero() / 2;
		ancho *= getNumero() / 2;
		System.out.println("La plancha " + getNombre() + " se ha unido en 1 sola parte\n  con largo " + largo + ", ancho " + ancho + " y espesor " + espesor);
		setNumero(1);
	}
	
	public boolean cortar (int n) {
		largo /= n/2;
		ancho /= n/2;
		System.out.println("La plancha " + getNombre() + " se ha dividido en " + n + " partes\n  con largo " + largo + ", ancho " + ancho + " y espesor " + espesor);
		this.setNumero(n);
		
		return true;
	}
	
	@Override
	public void vender(int metros) {
		if (cortar(metros)) {
			System.out.println("=== VENDIDO ===");
		} else {
			System.out.println("=== NO HAY MATERIAL ===");
		}

	}
}
