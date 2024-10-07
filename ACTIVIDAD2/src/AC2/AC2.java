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
		int num3;
		int factorial = 1;
		Scanner teclado10= new Scanner (System.in);
		System.out.println("Escrribe un numero natural: ");
		num3 = teclado10.nextInt();
		
		while (num3 < 0) {
			System.out.println("El numero no puede ser negativo.");
			System.out.println("Escribe un numero natural:");
			num3 = teclado10.nextInt();
			}
		if (num >= 0) {
			for (int i = 1; i <= num; i++) {
				factorial = factorial * i;
			}
			System.out.println("El factorial es " + factorial);
		}
		
		//Ejercicio 9
		int horas;
		int minutos; 
		int segundos;
			System.out.println("Escribe la hora entre 00h y 23h");
		Scanner teclado5 = new Scanner (System.in);
		horas = teclado5.nextInt();
			System.out.println("Escribe los minutos entre 00min y 59min");
		Scanner teclado6 = new Scanner (System.in);
		minutos = teclado6.nextInt();
			System.out.println("Escribe los segundos entre 00seg y 59seg");
		Scanner teclado7 = new Scanner (System.in);
		segundos = teclado7.nextInt();
		
		if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
			segundos ++;
		}
		if (segundos == 60) {
			segundos = 00;
			minutos ++;
		}
		if (minutos == 60) {
			minutos = 00;
			horas ++;
		}
		if (horas == 24) {
			horas = 00;
		}
			System.out.println("La hora despues de un segundo es " + horas + ":" + minutos + ":" + segundos );
		
		//Ejercicio 10
		boolean negativo1 = false;
		double num2 = 0;
			for (int i = 0; i < 10; i ++) {
			Scanner teclado8 = new Scanner (System.in);
			System.out.println("Escribe un numero no nulo: ");
			num2 = teclado8.nextDouble();
				while (num2 == 0) {
					System.out.println("El numero no puede ser nulo.");
					System.out.println("Escribe un numero no nulo:");
						num2 = teclado8.nextDouble();
					}
					if (num2 < 0) {
						negativo1 = true;
					}
				}
			
			if (negativo1 == true) {
				System.out.println("Se han encontrado almenos 1 numero negativo.");
			} 
			else {
				System.out.println("No se ha encontrado ningun numero negativo.");
			}
	
		//Ejercicio 11
			int positivo = 0;
			int negativo = 0;
			double num1;
				for (int i = 0; i < 10; i++) {
				Scanner teclado9 = new Scanner (System.in);
				System.out.println("Escribe un numero no nulo:");
				num1 = teclado9.nextDouble();
				
				
				while (num1 == 0) {
					System.out.println("El numero no puede ser nulo.");
					System.out.println("Escribe un numero no nulo:");
					num1 = teclado9.nextDouble();
				}
	
				if (num1 > 0) {
				positivo++;
				}
				else {
				negativo++;
				}
					

			}
			
			System.out.println("Los numeros positivos son: " + positivo);
			System.out.println("Los numeros negativos son: " + negativo);
				
				//ej 11
				
		//Ejercicio 12
			int positivo2 = 0;
			int negativo2 = 0;
			double num4 = 0;
			boolean negativos3 = false;
			Scanner teclado11 = new Scanner (System.in);
			System.out.println("Escribe una serie de numeros y que el último sea 0");
			do {
			num4 = teclado10.nextDouble();
		
			if (num4 < 0) {
				negativos3 = true;
				negativo2++;
			} 
			else {
				positivo2++;
			}
			}
			while(num4 != 0); 
			
		System.out.println("Se han encontrado " + negativo2 + " numeros negativos");
		System.out.println("Se han encontrado " + positivo2 + " numeros positivos");
		
		//Ejercicio 13
		int suma = 0;
		int multiplicacion = 1;
		for (int i = 1; i < 10; i++) {
			suma = i + suma;
			multiplicacion = i * multiplicacion;
		}
		System.out.println("La suma de los 10 primeros numeros naturales es " + suma);
		System.out.println("El producto de los 10 primeros numeros naturales es " + multiplicacion);
		
		//Ejercicio 14
		String nombre;
		double horas1;
		double salariobruto;
		double salarioneto;
		double impuestos;
		double salario = 20;
		Scanner teclado12 = new Scanner (System.in);
		System.out.println("Escribe aqui tu nombre: ");
		nombre = teclado12.nextLine();
		
		Scanner teclado13 = new Scanner (System.in);
		System.out.println("Escribe aqui tus horas trabajadas: ");
		horas1 = teclado13.nextDouble();
		
		if (horas1 <= 35) {
			salariobruto = horas1 * salario;
		}
		else {
			double horas2 = horas1 - 35;
			salariobruto = (35 * salario) + (horas2 * salario * 1.5);
		}
		if (salariobruto <= 500) {
			impuestos = 0;
			salarioneto = salariobruto;
		}
		else if (salariobruto <= 900) {
			impuestos = (salariobruto - 500) * 0.25;
			salarioneto = salariobruto - impuestos;
		}
		else {
			impuestos = (900 - 500) * 0.25;
			impuestos += ( salariobruto - 900) * 0.45;
			salarioneto = salariobruto - impuestos;
		}
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario Bruto: "  + salariobruto);
		System.out.println("Salario Neto: "  + salarioneto);
		System.out.println("Impuestos: "  + impuestos);				
		}//MAIN
}//CLASE

