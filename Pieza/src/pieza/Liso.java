package pieza;

public class Liso extends Tubo {
	private String color;
	private float espesor;
	public Liso(int numero, String nombre, float calibre, String medida, String color, float espesor) {
		super(numero, nombre, calibre, medida);
		this.color = color;
		this.espesor = espesor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getEspesor() {
		return espesor;
	}
	public void setEspesor(float espesor) {
		this.espesor = espesor;
	}
	
	public void unir() {
		System.out.println("El tubo liso " + getNombre() + " se ha unido en 1 sola parte\n  con calibre " + getCalibre() + ", medida " + getMedida() + ", color " + color + " y espesor" + espesor);
		setNumero(1);
	}
	
	public boolean cortar (int n) {
		System.out.println("El tubo liso " + getNombre() + " se ha dividido en " + n + " partes\n  con calibre " + getCalibre() + ", medida " + getMedida() + ", color " + color + " y espesor" + espesor);
		this.setNumero(n);
		
		return true;
	}
	
	public void pintar (String color) {
		System.out.println("El tubo liso " + getNombre() + " se ha pintado de color " + color);
		this.color = color;
	}
}
