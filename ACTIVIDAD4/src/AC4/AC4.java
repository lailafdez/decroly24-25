package AC4;

import java.util.Scanner;

public class AC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Ejercicio 1
		double [] num = new double [10]; 
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Escribe 10 numeros reales: ");
		 for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            num[i] = reader.nextDouble();
	        }
		        System.out.println("Los números son:");
		 for (double numero : num) {
		        System.out.println(numero);
		        }
		 //Ejercicio 2
		 double suma = 0;
		 double [] num1 = new double [10]; 
			Scanner reader1 = new Scanner(System.in);
			
			System.out.println("Escribe 10 numeros reales: ");
			 for (int i = 0; i < 10; i++) {
		            System.out.print("Número " + (i + 1) + ": ");
		            num1[i] = reader1.nextDouble();
		            suma += num1[i];
		        }
			 System.out.println("Los suma de los números es: " + suma);
	
		//Ejercicio3	 
		double [] num2 = new double[10];
		Scanner reader2 = new Scanner(System.in);
		System.out.println("Escribe 10 numeros reales: ");
		 	for (int i = 0; i < 10; i++) {
		 		
	            System.out.print("Número " + (i + 1) + ": ");
	            num2[i] = reader2.nextDouble();
		 	}
		 	
		 	
	        double maximo = Double.MIN_VALUE;
	        double minimo = Double.MAX_VALUE;
	        
	        for(int i = 0; i < num2.length; i++) {
	        	
	            if (num2 [i] > maximo) {
	                 maximo = num2 [i];
	            }
	            if (num2 [i] < minimo) {
	                 minimo = num2[i];
	            }
	            

		 	}
           	System.out.println("El numero maximo es: " + maximo);
	        System.out.println("El numero minimo es: " + minimo);
		
	    //Ejercicio4
	    int [] num3 = new int [20];
	    int numpositivo = 0;
	    int numnegativo = 0;
	    Scanner reader3 = new Scanner (System.in);
	    System.out.println("Escribe 20 numeros ( pueden ser positivos y negativos ): ");
	    	for (int i = 0; i < 20; i++) {
	    		 System.out.print("Número " + (i + 1) + ": ");
	    		 num3[i] = reader3.nextInt();
	    		 }
	    		
	    	for (int i = 0; i < num3.length; i++) {
	    		
	    		if (num3 [i] > 0) {
	    			numpositivo += num3[i];
	    		}
	    		
	    		if (num3 [i] < 0) {
	    			numnegativo += num3[i];
	    		}
	    	}
	    		System.out.println("La suma de los numeros positivos es: " + numpositivo );
	    		System.out.println("La suma de los numeros negativos es: " + numnegativo );
	    		
	   //Ejercicio5
	   double [] num4 = new double [20];
	   Scanner reader4 = new Scanner (System.in);
	   System.out.println("Escribe 20 numeros ( pueden ser positivos y negativos ): ");
	   		for (int i =0; i < 20; i++) {
	   			System.out.print("Número " + (i + 1) + ": ");
	   			num4[i] = reader4.nextDouble();
	   			
	   		}
	   		
	   		for(int i = 0; i < num4.length; i++) {
	   			
	   		}
	
	
	}
}

		
	
