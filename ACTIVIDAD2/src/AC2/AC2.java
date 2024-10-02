package AC2;

import java.util.Scanner;

public class AC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio 1
		int edad;
		Scanner teclado1 = new Scanner (System.in);
			System.out.println("Escribe tu edad aqui: ");
		edad = teclado1.nextInt();
		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
			}
		//Ejercicio 2
		int edad1;
		Scanner teclado2 = new Scanner (System.in);
			System.out.println("Escribe tu edad aqui: ");
		edad1 = teclado2.nextInt();
		if (edad1 >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad.");
		}
		
		//Ejercicio 3
		System.out.println("A continuación se mostrara una lista de todos los numeros entre el 1 y el 20: ");
		for (int i = 1; i <= 20 ; i++) {
			System.out.println(i);
		}
		
		//Ejercicio 4
		System.out.println("A continuación se mostrara una lista de todos los numeros pares hasta el 200: ");
		for (int i = 2; i <= 200; i += 2) {
			System.out.println(i);
		
		}
		
		//Ejercicio 5
		System.out.println("Otravez se mostrara una lista de todos los numeros pares hasta el 200: ");
		for (int i = 2; i <= 200; i++) {
		if (i % 2 == 0);
			System.out.println(" " + i);
		}
		
		
	}
}

