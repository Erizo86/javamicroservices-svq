package productos;

public class Perecedero extends Producto {
	protected int dias_a_caducar;

	//Constructor
	public Perecedero(String nombre, double precio, int dias_a_caducar) {
		super(nombre, precio);
		this.dias_a_caducar = dias_a_caducar;
	}

	//Getter y setter
	public int getDias_a_caducar() {
		return dias_a_caducar;
	}

	public void setDias_a_caducar(int dias_a_caducar) {
		this.dias_a_caducar = dias_a_caducar;
	}
	
	//Método Calcular: El precio cambia dependiendo de los días que queden para que
	//caduque. Para aprovechar la lógica escrita en la clase Producto, almacenamos
	//el precio original en una variable temporal y cambiamos el atributo 'precio'
	//para que se imprima en la llamada al método de la clase padre. Posteriormente
	//se vuelve a colocar el precio original.
	@Override
	public void calcular (int cantidad) {
		double tempPrecio = precio;
		switch (dias_a_caducar) {
		case 1: precio /= 4; break;
		case 2: precio /= 3; break;
		case 3: precio /= 2; break;
		}
		
		super.calcular(cantidad);
		
		precio = tempPrecio;
	}
}
