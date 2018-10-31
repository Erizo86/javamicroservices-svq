package pieza;

public class Tubo extends Pieza {
	private float calibre;
	private String medida;
	public Tubo(int numero, String nombre, float calibre, String medida) {
		super(numero, nombre);
		this.calibre = calibre;
		this.medida = medida;
	}
	public float getCalibre() {
		return calibre;
	}
	public void setCalibre(float calibre) {
		this.calibre = calibre;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	
	public void unir() {
		System.out.println("El tubo " + getNombre() + " se ha unido en 1 sola parte\n  con calibre " + calibre + " y medida " + medida);
		setNumero(1);
	}
	
	public boolean cortar (int n) {
		System.out.println("El tubo " + getNombre() + " se ha dividido en " + n + " partes\n  con calibre " + calibre + " y medida " + medida);
		this.setNumero(n);
		return true;
	}
	@Override
	public void vender(int cantidad) {
		// TODO Auto-generated method stub
		System.out.println("VENDIDO TUBO " + this.getNombre());
	}
}
