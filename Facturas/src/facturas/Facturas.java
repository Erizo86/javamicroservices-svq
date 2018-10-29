package facturas;

import java.util.Locale;
import java.util.Scanner;

public class Facturas {
	public static void main (String [] args) {
		//Variables acumuladoras para almacenar los cálculos relevantes en base a los
		//datos introducidos, inicializados a 0
		double facturacion_total = 0, litros_vendidos_art1 = 0;
		int facturas600 = 0;
		
		//Número de artículos a facturar
		int n = 5;
		
		//Variables temporales en las que almacenar los datos introducidos por el usuario.
		int codigo_articulo;
		double litros, precio_litro, precio_total;
		
		//Inicialización del objeto Scanner para la recogida de datos por teclado.
		//Configurado a una localización a Estados Unidos para que la coma decimal sea
		//el símbolo punto '.'
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		//Comenzamos el bucle para cada artículo.
		for (int i = 0; i < n; i++) {
			//Solicitamos el código de un artículo facturado
			System.out.println("\nIntroduzca el codigo del artículo vendido: ");
			codigo_articulo = sc.nextInt();
			
			//Solicitamos el número de litros vendidos del artículo facturado
			System.out.println("Introduzca el número de litros vendidos: ");
			litros = sc.nextDouble();
			
			//Solicitamos el precio por litro del artículo facturado
			System.out.println("Introduzca el precio por litro del artículo vendido: ");
			precio_litro = sc.nextDouble();
			
			//Con estos datos comenzamos a trabajar en las variables acumuladoras,
			//haciendo los cálculos necesarios para comprobar qué datos son relevantes
			//en base a los objetivos definidos en el ejercicio
			
			//Comprobamos si el artículo introducido es el artículo con código 1.
			//En caso de serlo, acumulamos los litros vendidos de ese artículo
			if(codigo_articulo == 1) 
				litros_vendidos_art1 += litros;
			
			//En base a los litros vendidos y al precio por litro, calculamos el importe
			//total de esta factura
			precio_total = precio_litro * litros;
			
			//Comprobamos si el importe total es mayor a 600 euros. En caso de ser así
			//incrementamos la variable que cuenta el número de facturas mayores que 600.
			if (precio_total > 600)
				facturas600++;
			
			//Acumulamos el importe total de facturación hasta el momento.
			facturacion_total += precio_total;
		}
		
		//Una vez recopilada toda la información mostramos por pantalla los datos
		//almacenados en las variables acumuladoras.
		System.out.println("\n\nLa facturación total ha sido de " + facturacion_total + "€");
		System.out.println("Se han vendido " + litros_vendidos_art1 + " litros del artículo 1");
		System.out.println("Se han emitido " + facturas600 + " facturas de más de 600 euros");
	}
}
