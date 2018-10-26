package alumnos;

import java.util.Locale;
import java.util.Scanner;

public class Alumnos {
	public static void main (String [] args) {
		//Número de alumnos a preguntar
		int n = 5;
		
		//Variables acumuladoras, donde haremos el cálculo de medias y el cómputo de alumnos que
		//cumplen las condiciones establecidas por el problema
		double edad_media = 0, altura_media = 0, alumnos_mayores_de_edad = 0, alumnos_mas_altos_de_175 = 0;
		
		//Variables temporales para entrada de datos por teclado.
		int edad;
		double altura;
		
		//Objeto Scanner para gestión de la entrada por teclado.
		//Configuramos el scanner con la localización americana para poder parsear
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		//Para cada alumno...
		for (int i = 1; i <= n; i++) {
			//Preguntar la edad del alumno
			System.out.println("Introduzca la edad del alumno número " + i);
			edad = sc.nextInt();
			
			//Acumular la edad para hacer posteriormente la media
			edad_media = edad_media + edad;
			
			//Comprobar si el alumno es mayor de edad y contarlo en tal caso
			if (edad >= 18)
				alumnos_mayores_de_edad++;
			
			//Preguntar la altura del alumno
			System.out.println("Introduzca la altura del alumno número " + i);
			altura = sc.nextDouble();
			
			//Acumular la altura para hacer posteriormente la media
			altura_media = altura_media + altura;
			
			//Comprobar si el alumno es suficientemente alto y contarlo en tal caso
			if (altura > 1.75)
				alumnos_mas_altos_de_175++;
		}
		
		//Cálculo de las medias de edad y altura
		edad_media = edad_media / n;
		altura_media = altura_media / n;
		
		//Salida por pantalla
		System.out.println("La edad media de los alumnos es " + edad_media);
		System.out.println("La altura media de los alumnos es " + altura_media);
		
		System.out.println("El número de alumnos mayores de edad es " + alumnos_mayores_de_edad);
		System.out.println("El número de alumnos más altos de 1.75m es " + alumnos_mas_altos_de_175);
		
	}
}
