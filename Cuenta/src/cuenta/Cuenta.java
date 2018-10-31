package cuenta;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular) {
		this.titular = titular;
		cantidad = 0;
	}
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	public void ingresar (double cantidad) {
		if (cantidad >= 0) {
			this.cantidad += cantidad;
		}
	}
	
	public void retirar (double cantidad) {
		if (this.cantidad - cantidad < 0)
			this.cantidad = 0;
		else
			this.cantidad -= cantidad;
	}
	
	public static void main (String [] args) {
		Cuenta c = new Cuenta("Pepe", 250);
		Cuenta c2 = new Cuenta("Manolo");
		
		System.out.println(c.toString());
		System.out.println(c2.toString());
		
		//Probando la lógica del método Ingresar
		System.out.println("\nPrueba del método ingresar:");
		System.out.println("Ingresamos -50");
		c.ingresar(-50);
		System.out.println(c.toString());
		System.out.println("Ingresamos 100");
		c.ingresar(100);
		System.out.println(c.toString());
		
		//Probando la lógica del método retirar
		System.out.println("\nPrueba del método retirar");
		System.out.println("Retiramos 150");
		c.retirar(150);
		System.out.println(c.toString());
		System.out.println("Retiramos 500, mucho más de lo que hay en la cuenta");
		c.retirar(500);
		System.out.println(c.toString());
		
	}
}
