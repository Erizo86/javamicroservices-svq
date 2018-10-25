package interes;

public class Interes {
	
	static final double c = 1000;
	static final int m = 4; //Abril
	static final double tasaAntigua = 12.5; //tanto por ciento
	static final double tasaNueva = 13.0; //tanto por ciento

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cálculo de inetés");
		
		//Cálculos preeliminares
		double cPrelim = c*(12-m)/12/100;
		
		//Imprimir resultados
		System.out.println("Dado un cambio de la tasa de " + "interés del " + tasaAntigua + "% al " + tasaNueva + "% en el mes " + m + ",");
		System.out.println("sobre un capital de " + c + ", el interés para el resto del año");
		System.out.print("cambiará en: ");
		System.out.println(cPrelim*tasaNueva - cPrelim*tasaAntigua);
	}

}
