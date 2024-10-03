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
			} 
			else {
				System.out.println("Eres menor de edad.");
				}
		
		//Ejercicio 3
		System.out.println("A continuación se mostrara una lista de todos los numeros entre el 1 y el 20: ");
		for (int i = 1; i <= 20 ; i++) {
			System.out.println(i);
			}
		
		//Ejercicio 4
		System.out.println("A continuación se mostrara una lista de todos los numeros pares hasta el 200: ");
		for (int i = 1; i <= 200; i += 2) {
			System.out.println(i);
			}
		
		//Ejercicio 5
		System.out.println("Otravez se mostrara una lista de todos los numeros pares hasta el 200: ");
		for (int i = 1; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println(" " + i);
				}	
			}
		
		//Ejercicio 6
		int num;
		Scanner teclado3 = new Scanner (System.in);
			System.out.println("Escribe el numero al que quieres que llegue tu lista");
		num = teclado3.nextInt();
		for (int i = 1; i <= num ; i++) {
			System.out.println(" " + i);
			}
				
		//Ejercicio 7
		System.out.println("¿Cual es tu nota?");
		double nota;
			Scanner teclado4 = new Scanner (System.in);
		nota = teclado4.nextDouble();
		if (nota < 3) {
			System.out.println("Muy deficiente");
			}
			else if (nota < 5) {
				System.out.println("Insuficiente");
				}
				else if (nota < 6) {
					System.out.println("Bien");
					}
				    else if (nota < 9) {
				    	System.out.println("Notable");
				    	}
				    	else if (nota < 10) {
				    		System.out.println("Sobresaliente");
				    		}
		
		//Ejercicio 8 
		
		//Ejercicio 9
		int horas;
		int minutos; 
		int segundos;
		Scanner teclado5 = new Scanner (System.in);
		horas = teclado5.nextInt();
			System.out.println("Escribe la hora entre 00h y 23h");
		Scanner teclado6 = new Scanner (System.in);
		minutos = teclado6.nextInt();
				System.out.println("Escribe los minutos entre 00min y 59min");
		Scanner teclado7 = new Scanner (System.in);
		segundos = teclado7.nextInt();
				System.out.println("Escribe los segundos entre 00seg y 59seg");
		if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
			segundos ++;
			
		}
			
		}//MAIN
	
}//CLASE

