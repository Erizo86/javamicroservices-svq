package facturas;

import java.util.Locale;
import java.util.Scanner;

public class Facturas {
	public static void main (String [] args) {
		//Variables acumuladoras para almacenar los c�lculos relevantes en base a los
		//datos introducidos, inicializados a 0
		double facturacion_total = 0, litros_vendidos_art1 = 0;
		int facturas600 = 0;
		
		//N�mero de art�culos a facturar
		int n = 5;
		
		//Variables temporales en las que almacenar los datos introducidos por el usuario.
		int codigo_articulo;
		double litros, precio_litro, precio_total;
		
		//Inicializaci�n del objeto Scanner para la recogida de datos por teclado.
		//Configurado a una localizaci�n a Estados Unidos para que la coma decimal sea
		//el s�mbolo punto '.'
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		//Comenzamos el bucle para cada art�culo.
		for (int i = 0; i < n; i++) {
			//Solicitamos el c�digo de un art�culo facturado
			System.out.println("\nIntroduzca el codigo del art�culo vendido: ");
			codigo_articulo = sc.nextInt();
			
			//Solicitamos el n�mero de litros vendidos del art�culo facturado
			System.out.println("Introduzca el n�mero de litros vendidos: ");
			litros = sc.nextDouble();
			
			//Solicitamos el precio por litro del art�culo facturado
			System.out.println("Introduzca el precio por litro del art�culo vendido: ");
			precio_litro = sc.nextDouble();
			
			//Con estos datos comenzamos a trabajar en las variables acumuladoras,
			//haciendo los c�lculos necesarios para comprobar qu� datos son relevantes
			//en base a los objetivos definidos en el ejercicio
			
			//Comprobamos si el art�culo introducido es el art�culo con c�digo 1.
			//En caso de serlo, acumulamos los litros vendidos de ese art�culo
			if(codigo_articulo == 1) 
				litros_vendidos_art1 += litros;
			
			//En base a los litros vendidos y al precio por litro, calculamos el importe
			//total de esta factura
			precio_total = precio_litro * litros;
			
			//Comprobamos si el importe total es mayor a 600 euros. En caso de ser as�
			//incrementamos la variable que cuenta el n�mero de facturas mayores que 600.
			if (precio_total > 600)
				facturas600++;
			
			//Acumulamos el importe total de facturaci�n hasta el momento.
			facturacion_total += precio_total;
		}
		
		//Una vez recopilada toda la informaci�n mostramos por pantalla los datos
		//almacenados en las variables acumuladoras.
		System.out.println("\n\nLa facturaci�n total ha sido de " + facturacion_total + "�");
		System.out.println("Se han vendido " + litros_vendidos_art1 + " litros del art�culo 1");
		System.out.println("Se han emitido " + facturas600 + " facturas de m�s de 600 euros");
	}
}
