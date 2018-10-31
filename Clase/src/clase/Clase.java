package clase;

public class Clase {
	private int numero;
	private String nombre;
	
	//Constructor sin parámetros
	public Clase () {
		numero = 99;
		nombre = "anonimo";
	}
	
	//Constructor con dos parámetros;
	public Clase(int num, String cad) {
		numero = num;
		nombre = cad;
	}
	
	//Constructor que recibe referencia a objeto de Clase
	public Clase (Clase o) {
		numero = o.numero;
		nombre = o.nombre;
	}
	
	public void leerDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Numero: " + numero);
	}
	
	public static void main (String [] args) {
		Clase objeto1 = new Clase();
		objeto1.leerDatos();
		Clase objeto2 = new Clase(18, "Pepe Pérez");
		objeto2.leerDatos();
		Clase objeto3 = new Clase(objeto2);
		objeto3.leerDatos();
	}
}
