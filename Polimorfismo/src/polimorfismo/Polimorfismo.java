package polimorfismo;

public class Polimorfismo {
	public static void main (String [] args) {
		Figura figura1 = new Circulo();
		figura1.area();
		figura1.perimetro();
		
		figura1 = new Cuadrado();
		figura1.area();
		figura1.perimetro();
	}
}
