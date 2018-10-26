package impar;

import java.util.Scanner;

public class Impar {
	public static void main (String[] args) { 
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.println("Introduzca un número entero: ");
		n = sc.nextInt();
		
		if (n % 2 == 0)
			System.out.println("Par");
		else
			System.out.println("Impar");
	}
}
