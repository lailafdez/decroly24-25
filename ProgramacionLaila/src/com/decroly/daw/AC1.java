package com.decroly.daw;

import java.util.Scanner;

public class AC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Double = números reales, Int = Números enteros.
		//Ejercicio 1
		System.out.println("Buenos días");
		//Ejercicio 2 
		double lado = 5;
		double area = Math.pow(5,2); //Pow sirve para elevar un número a la potencia que yo le asigne, esta vez yo he elevado el 5 al cuadrado
		System.out.println("El area de un cuadrado de lado 5 es = " + area);
		//Ejercicio 3
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el lado del cuadrado: ");
		double lado1 = teclado.nextDouble(); //El nextDouble me esta leyendo el número entero
		double area1 = Math.pow(lado1,2);
		System.out.println("Si el lado del cuadrado es "+ lado1 + "el area del cuadrado es " + area1);
		//Ejercicio 4
		Scanner teclado1 = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero1 = teclado1.nextInt();
		System.out.println("Introduzca otro número: ");
		int numero2 = teclado1.nextInt();
		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
	
		
		
		
	}

}
