package AC3;

import java.util.Scanner;

public class AC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		
		//Ejercicio1
		System.out.println("Escribe la cantidad de euros, tiene que ser múltiplo de 5: ");
		int cantidad = reader.nextInt();
		
		int billete5 = 0;
		int billete10 = 0;
		int billete20 = 0;
		int billete50 = 0;
		int billete100 = 0;
		int billete200 = 0;
		int billete500 = 0;
		
			if (cantidad > 0) {
					if (cantidad % 5 == 0 )
					{
						if (cantidad >= 500) {
							billete500 = cantidad / 500;
							cantidad %= 500;
							System.out.println("La cantidad de billetes de 500 es, " + billete500 + " billete/s.");
						}
						if (cantidad >= 200) {
							billete200 = cantidad / 200;
							cantidad %= 200;
							System.out.println("La cantidad de billetes de 200 es, " + billete200 + " billete/s.");
						}
						if (cantidad >= 100) {
							billete100 = cantidad / 100;
							cantidad %= 100;
							System.out.println("La cantidad de billetes de 100 es, " + billete100 + " billete/s.");
						}
						if ( cantidad >= 50) {
							billete50 = cantidad / 50;
							cantidad %= 50;
							System.out.println("La cantidad de billetes de 50 es, " + billete50 + " billete/s.");
						}
						if ( cantidad >= 20) {
							billete20 = cantidad / 20;
							cantidad %= 20;
							System.out.println("La cantidad de billetes de 20 es, " + billete20 + " billete/s.");
						}
						if ( cantidad >= 10) {
							billete10 = cantidad / 10;
							cantidad %= 10;
							System.out.println("La cantidad de billetes de 10 es, " + billete10 + " billete/s.");
						}
						if ( cantidad >= 5) {
							billete5 = cantidad / 5;
							cantidad %= 5;
							System.out.println("La cantidad de billetes de 5 es, " + billete5 + " billete/s.");
						}
				}
		}		
		  
		//Ejercicio 2
		int opcion;
		double num1;
		double num2;
		
		do {
			System.out.println("Selecciona la opción que prefieras");
			System.out.println("1- Sumar");
			System.out.println("2- Restar");
			System.out.println("3- Multiplicar");
			System.out.println("4- Dividir");
			System.out.println("5- Salir");
			opcion = reader.nextInt();
			
			if (opcion == 1) {
				System.out.println("Escriba un numero: ");
				num1 = reader.nextDouble();
				System.out.println("Escriba otro numero: ");
				num2 = reader.nextDouble();
				System.out.println("El resultado de tu suma es " + (num1 + num2));
			}
			else if ( opcion == 2) {
				System.out.println("Escriba un numero: ");
				num1 = reader.nextDouble();
				System.out.println("Escriba otro numero: ");
				num2 = reader.nextDouble();
				System.out.println("El resultado de tu resta es " + (num1 - num2));
			}
			else if ( opcion == 3) {
				System.out.println("Escriba un numero: ");
				num1 = reader.nextDouble();
				System.out.println("Escriba otro numero: ");
				num2 = reader.nextDouble();
				System.out.println("El resultado de tu multiplicación es " + (num1 * num2));
			}
			else if ( opcion == 4) {
				System.out.println("Escriba un numero: ");
				num1 = reader.nextDouble();
				System.out.println("Escriba otro numero: ");
				num2 = reader.nextDouble();
				System.out.println("El resultado de tu division es " + (num1 / num2));
			}
			
		} while( opcion != 5 ) ;
		
	
		}
}
	
