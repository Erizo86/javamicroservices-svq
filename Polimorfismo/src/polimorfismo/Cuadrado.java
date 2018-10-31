package polimorfismo;

public class Cuadrado extends Figura {

	@Override
	void area() {
		System.out.println("Aquí se calcula el area de un cuadrado");

	}

	@Override
	void perimetro() {
		System.out.println("Aquí se calcula el perímetro de un cuadrado");

	}

}
