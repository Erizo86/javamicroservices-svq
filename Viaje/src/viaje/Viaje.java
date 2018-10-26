package viaje;

public class Viaje {
	static final double LITROS_POR_100_KM = 8;
	static final double INCREMENTO_CARRETERA_DESIGUAL = 1.15;
	
	static final double DEPOSITO = 40;

	public static void main (String [] args) {
		System.out.println("Un coche gasta " + LITROS_POR_100_KM + " litros de gasolina cada 100km");
		System.out.println("de carretera normal y un " + Math.round((INCREMENTO_CARRETERA_DESIGUAL - 1)*100) + "% en carreteras desiguales.");
		System.out.println("");
		System.out.println("Un coche con " + DEPOSITO + " litros de gasolina puede recorrer:");
		System.out.println("En carreteras normales recorre " + DEPOSITO * 100 / LITROS_POR_100_KM + " kms.");
		System.out.println("En carreteras desiguales recorre " + 
				DEPOSITO *100 / (INCREMENTO_CARRETERA_DESIGUAL * LITROS_POR_100_KM) + " kms.");
	}
}
