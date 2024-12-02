package Ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner reader = new Scanner(System.in);
		//Cantidad total de números a almacenar
		   System.out.println("Escribe el tamaño del array: ");
			int P = reader.nextInt();
			double [] array = new double [P]; 
			  for (int i = 0; i < P; i++) {
		            System.out.print("Número " + (i + 1) + ": ");
		            array[i] = reader.nextDouble();
			  }
		   
		char opcion;
		double suma = 0;
		do {

		System.out.println("Seleccione una opción: ");
		System.out.println("a. Insertar numero ");
		System.out.println("b. Borrar número ");
		System.out.println("c. Modificar numero ");
		System.out.println("d. Estadisticas de la coleeción ");
		System.out.println("e. Ampliar la coleccion ");
		System.out.println("f. Salir ");
		opcion = reader.next().charAt(0);
		
		//Modificar coleccion 
			//Insertar num
		if (opcion == 'a') {
			 System.out.print("Escribe un numero (entero): ");
                int valor = reader.nextInt();
                System.out.print("Introduzca una posición : ");
                int posicion = reader.nextInt();

                if (posicion >= 0 && posicion < array.length) {
                    array[posicion] = valor;
        }
                System.out.println("Valor " + valor + " añadido en la posición " + posicion);
		}
		if (opcion != 'b') {
			 System.out.print("Escribe el numero que quieres borrar: ");
             int valor1 = reader.nextInt();
             System.out.print("Introduzca una posición : ");
             int posicion1 = reader.nextInt();

             if (posicion1 >= 0 && posicion1 < array.length) {
                 array[posicion1] = valor1;
             }
             System.out.println("Valor " + valor1 + " eliminado la posición " + posicion1);
		}
		
		if (opcion != 'c') {
			
		}
		if (opcion != 'd') {
			 for (int i = 0; i < P; i++) {
		            array[i] = reader.nextDouble();
		            suma += array[i];
		        }
             System.out.println("La suma es " + suma);
            
             double maximo = Double.MIN_VALUE;
 	        double minimo = Double.MAX_VALUE;
 	        
 	        for(int i = 0; i < array.length; i++) {
 	        	
 	            if (array [i] > maximo) {
 	                 maximo = array [i];
 	            }
 	            if (array [i] < minimo) {
 	                 minimo = array [i];
 	            }
		}
 	     	System.out.println("El numero maximo es: " + maximo);
 	        System.out.println("El numero minimo es: " + minimo);
		}
		double media = suma / P;
	        System.out.println("La media total es " + media);
		
		if (opcion != 'e') {
			
		}
		if (opcion == 'f') {

		}
		
		}while (opcion != 'f');

		
		
	}

}
