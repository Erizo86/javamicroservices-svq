package productos;

public class EntryPoint {

	public static void main(String[] args) {
		Producto producto = new NoPerecedero ("Mistol", 2.50, "limpieza");
		
		System.out.println("Vendo 5 unidades de mistol");
		producto.calcular(5);
		
		producto = new Perecedero ("Pan", 1, 5);
		System.out.println("\n\nVendo 5 unidades de pan sin que estén próximos a caducar");
		producto.calcular(5);
		
		producto = new Perecedero ("Pizza", 1, 3);
		System.out.println("Vendo otras 5 unidades de pizza cuando quedan 3 días para caducar");
		producto.calcular(5);
		
		producto = new Perecedero ("Fruta", 1, 2);
		System.out.println("Vendo otras 5 unidades de fruta cuando quedan 2 días para caducar");
		producto.calcular(5);
		
		producto = new Perecedero ("Queso", 1, 1);
		System.out.println("Vendo otras 5 unidades de queso cuando queda 1 día para caducar");
		producto.calcular(5);

	}

}
