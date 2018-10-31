package polimorfismo;

public class Circulo extends Figura {

	@Override
	void area() {
		System.out.println("Aquí se calcula el area de un círculo");

	}

	@Override
	void perimetro() {
		System.out.println("Aquí se calcula el perímetro de un círculo");

	}

}
