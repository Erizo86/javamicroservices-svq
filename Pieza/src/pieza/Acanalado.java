package pieza;

public class Acanalado extends Tubo {
	private String material;
	private boolean esFlexible;
	public Acanalado(int numero, String nombre, float calibre, String medida, String material, boolean esFlexible) {
		super(numero, nombre, calibre, medida);
		this.material = material;
		this.esFlexible = esFlexible;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public boolean isEsFlexible() {
		return esFlexible;
	}
	public void setEsFlexible(boolean esFlexible) {
		this.esFlexible = esFlexible;
	}
	
	public void unir() {
		System.out.print("El tubo acanalado " + getNombre() + " se ha unido en 1 sola parte\n  con calibre " + getCalibre() + ", medida " + getMedida() + ", material " + material);
		setNumero(1);
		if (esFlexible) {
			System.out.println(" y es flexible");
		} else {
			System.out.println(" y es rígido");
		}
	}
	
	public boolean cortar (int n) {
		System.out.print("El tubo acanalado " + getNombre() + " se ha dividido en " + n + " partes\n  con calibre " + getCalibre() + ", medida " + getMedida() + ", material " + material);
		this.setNumero(n);
		if (esFlexible) {
			System.out.println(" y es flexible");
		} else {
			System.out.println(" y es rígido");
		}
		
		return true;
	}
}
