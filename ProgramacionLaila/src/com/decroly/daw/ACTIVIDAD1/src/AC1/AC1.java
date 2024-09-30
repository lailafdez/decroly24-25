package AC1;

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
		double numero1 = teclado1.nextDouble();
			System.out.println("Introduzca otro número: ");
		double numero2 = teclado1.nextDouble();
		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
		double producto = numero1 * numero2;
		double division = numero1 / numero2;
			System.out.println("El resultado de " + numero1 + "+" + numero2 + " es " + suma);
			System.out.println("El resultado de " + numero1 + "-" + numero2 + " es " + resta);	
			System.out.println("El resultado de " + numero1 + "*" + numero2 + " es " + producto);
			System.out.println("El resultado de " + numero1 + "/" + numero2 + " es " + division);
			
		//Ejercicio 5
		Scanner teclado2 = new Scanner (System.in);
		double radio;
			System.out.println("¿Cual es el radio de la circunferencia?");
		radio = teclado2.nextDouble();
		double circunferencia = 2 * radio * Math.PI;
		double area2 = Math.PI * Math.pow(radio,2);
		double volumen = (4/3) * Math.PI * Math.pow(radio,3);
			System.out.println("La longitud de la circunferencia es " + circunferencia);
			System.out.println("El area de la circunferencia es " + area2);
			System.out.println("El volumen de la circunferencia es " + volumen);
			
		//Ejercicio 6
		Scanner teclado3 = new Scanner (System.in);
		double PrecioSin;
		double PrecioCon;
			System.out.println("¿Cual es el precio actual del producto?");
		PrecioCon = teclado3.nextDouble();
			System.out.println("¿Cual era el precio antes del descuento?");
		PrecioSin = teclado3.nextDouble();
		double descuento = (PrecioCon * 100) / PrecioSin;
			System.out.println("El descuento realizado en este producto es de un " + descuento + "%");
			
		//Ejercicio 7
		Scanner teclado4 = new Scanner (System.in);
		double millas;
			System.out.println("¿Cuanto es la distancia en millas?");
		millas = teclado4.nextDouble();
		double metros = millas * 1852;
			System.out.println("La distancia en metros  de " + millas + "millas, son " + metros + "metros" );
			
		//Ejercicio 8
		double num3;
		double num4;
		Scanner teclado5 = new Scanner (System.in);
			System.out.println("Escribe un número:");
		num3 = teclado5.nextDouble();
			System.out.println("Ahora escribe otro diferente:");
		num4 = teclado5.nextDouble();
		double NumMax;
		double NumMin;
		NumMax = Math.max(num3, num4);
		NumMin = Math.min(num3, num4);
		System.out.println(NumMax + " , " + NumMin);
		
		//Ejercicio 9
		double num5;
		double num6;
		Scanner teclado6 = new Scanner (System.in);
			System.out.println("Escribe un número:");
		num5 = teclado6.nextDouble();
			System.out.println("Escribe un número:");
		num6 = teclado6.nextDouble();
		double NumMax1 = Math.max(num5, num6);
		boolean MismoNum = num5==num6;
			System.out.println("El numero mayor es " + NumMax1);
			System.out.println("El resultado de si los numeros son iguales o no es, " + MismoNum);
			
		//Ejercicio 10 
		double num7, num8, num9;
		Scanner teclado7 = new Scanner (System.in);
			System.out.println("Escribe 3 numeros diferentes: ");
		num7 = teclado7.nextDouble();
		num8 = teclado7.nextDouble();
		num9 = teclado7.nextDouble();
		double NumMax2 = Math.max(num9,(Math.max(num7, num8)));
			System.out.println("El numero mas grande es " + NumMax2);
			
		//Ejercicio 11
		Scanner teclado8 = new Scanner (System.in);
			System.out.println("Introduzca un número: ");
		double num10 = teclado8.nextDouble();
			System.out.println("Introduzca otro número: ");
		double num11 = teclado8.nextDouble();
		double suma1 = num10 + num11;
		double resta1 = num10 - num11;
		double producto1 = num10 * num11;
		double division1= num10 / num11;
			System.out.println("El resultado de " + num10 + "+" + num11 + " es " + suma);
			System.out.println("El resultado de " + num10 + "-" + num11 + " es " + resta);	
			System.out.println("El resultado de " + num10 + "*" + num11 + " es " + producto);
			System.out.println("El resultado de " + num10 + "/" + num11 + " es " + division);
			
		//Ejercicio 12
		double num12;
		double num13;
		Scanner teclado9 = new Scanner (System.in);
			System.out.println("Escribe un número:");
		num12 = teclado9.nextDouble();
			System.out.println("Ahora escribe otro diferente:");
		num13 = teclado9.nextDouble();
		double NumMax3;
		NumMax3 = Math.max(num3, num4);
			System.out.println("El numero mayor es " + NumMax3);
			
		//Ejercicio 13
		double num14;
		Scanner teclado10 = new Scanner (System.in);
			System.out.println("Escribe un número positivo o negativo: ");
		num14 = teclado10.nextDouble();
		double valor = Math.signum(num14);
			System.out.println("El valor de este numero es " + valor);
			
	}
=======
package AC1;

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
		double numero1 = teclado1.nextDouble();
			System.out.println("Introduzca otro número: ");
		double numero2 = teclado1.nextDouble();
		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
		double producto = numero1 * numero2;
		double division = numero1 / numero2;
			System.out.println("El resultado de " + numero1 + "+" + numero2 + " es " + suma);
			System.out.println("El resultado de " + numero1 + "-" + numero2 + " es " + resta);	
			System.out.println("El resultado de " + numero1 + "*" + numero2 + " es " + producto);
			System.out.println("El resultado de " + numero1 + "/" + numero2 + " es " + division);
			
		//Ejercicio 5
		Scanner teclado2 = new Scanner (System.in);
		double radio;
			System.out.println("¿Cual es el radio de la circunferencia?");
		radio = teclado2.nextDouble();
		double circunferencia = 2 * radio * Math.PI;
		double area2 = Math.PI * Math.pow(radio,2);
		double volumen = (4/3) * Math.PI * Math.pow(radio,3);
			System.out.println("La longitud de la circunferencia es " + circunferencia);
			System.out.println("El area de la circunferencia es " + area2);
			System.out.println("El volumen de la circunferencia es " + volumen);
			
		//Ejercicio 6
		Scanner teclado3 = new Scanner (System.in);
		double PrecioSin;
		double PrecioCon;
			System.out.println("¿Cual es el precio actual del producto?");
		PrecioCon = teclado3.nextDouble();
			System.out.println("¿Cual era el precio antes del descuento?");
		PrecioSin = teclado3.nextDouble();
		double descuento = (PrecioCon * 100) / PrecioSin;
			System.out.println("El descuento realizado en este producto es de un " + descuento + "%");
			
		//Ejercicio 7
		Scanner teclado4 = new Scanner (System.in);
		double millas;
			System.out.println("¿Cuanto es la distancia en millas?");
		millas = teclado4.nextDouble();
		double metros = millas * 1852;
			System.out.println("La distancia en metros  de " + millas + "millas, son " + metros + "metros" );
			
		//Ejercicio 8
		Scanner teclado5 = new Scanner (System.in);
		double numero3; //pppppp
		
		
		
	}

>>>>>>> 6ce97d601c239866ef0b8fe71b45c49ce8095cee
}