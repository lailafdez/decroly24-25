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
	   			suma += num4 [i];
	   			}
	   		System.out.println("La media de la suma de los numeros es: " + (suma/num4.length));
	   		
	   //Ejercicio6
	   System.out.println("Escribe el numero del tamaño del array: ");
	   Scanner reader5 = new Scanner(System.in);
	   int N = reader5.nextInt();
	   System.out.println("Escribe el numero para llenar el array: ");
	   Scanner reader6 = new Scanner(System.in);
	   int M = reader6.nextInt();
	   int [] num5 = new int [N];
	   		for (int i = 0; i < N; i++) {
	   			num5[i] = M;
	   		}
	   System.out.println("El array es: ");
	   		for (int value : num5) {
	   			System.out.println(value + " ");
	   		}
	   		
	   //Ejercicio7
	   System.out.println("Escribe  numero que sera P: ");
	   Scanner reader7 = new Scanner(System.in);
	   int P = reader7.nextInt();
	   System.out.println("Escribe numero mayor que P que sera Q: ");
	   Scanner reader8 = new Scanner(System.in);
	   int Q = reader8.nextInt();
	   int array;
	   if (P <= Q) {
		   array = Q - P + 1;
	   }
	   else {
		   array = P - Q + 1;
	   }
	   int [] num6 = new int [array];
	   for ( int i = 0; i < array; i++) {
		   if ( P <= Q ) {
			   num6[i] = P + i;
		   }
		   if ( Q <= P ) {
			   num6[i] = Q + i;
		   }
	   }
	   System.out.println(" El array es: "); 
	   for (int value : num6) {
		   System.out.println(value + " ");
	   }
	   
	  //Ejercicio8 
	   double[] num7 = new double[100];
		   for (int i = 1; i < num7.length; i++) {
		   num7[i] = Math.random();
		   }
	           Scanner scanner = new Scanner(System.in);
	           System.out.print("Escribe un numero real entre 0,0 y 1,0 que sera R: ");
	           double R = scanner.nextDouble();

	           int igualsup = 0;
	           for (double value : num7) {
	               if (value >= R) {
	                   igualsup++;
	               }
	           }
	           System.out.println("Numero de valores en el array iguales o superiores a R: " + igualsup);
	  //Ejercicio9
	  //Ejercicio10
	           Scanner scanner1 = new Scanner(System.in);
               System.out.print("Introduce el número de alturas a registrar (N): ");
               int N1 = scanner1.nextInt();

               double[] alturas = new double[N1];
               for (int i = 0; i < N1; i++) {
                   System.out.print("Introduce la altura de la persona " + (i + 1) + " (en metros): ");
                   alturas[i] = scanner1.nextDouble();
               }
               double suma1 = 0;
               double max = alturas[0];
               double min = alturas[0];

               for (double altura : alturas) {
                   suma1 += altura;
                   if (altura > max) {
                       max = altura;
                   }
                   if (altura < min) {
                       min = altura;
                   }
               }

               double media = suma1 / N1;
               int porEncima = 0;
               int porDebajo = 0;

               for (double altura : alturas) {
                   if (altura > media) {
                       porEncima++;
                   } else if (altura < media) {
                       porDebajo++;
                   }
               }
               System.out.printf("Altura media:  " + media 	 );
               System.out.printf("Altura máxima:  " + max );
               System.out.printf("Altura mínima: " + min );
               System.out.println("Número de personas por encima de la media: " + porEncima );
               System.out.println("Número de personas por debajo de la media: " + porDebajo );

           
     //Ejercicio11
            int[] array2 = new int[100];
   	        int[] array3 = new int[100];
   	        for (int i = 0; i < array2.length; i++) {
   	            array2[i] = i + 1;
   	        }
   	        for (int i = 0; i < array2.length; i++) {
   	            array3[i] = array2[array2.length - 1 - i]; 
   	        }
   	        System.out.print("Del 1 al 100: ");
   	        for (int num11 : array2) {
   	            System.out.print(num11 + " ");
   	        }
   	        System.out.println();

   	        System.out.print("Del 100 al 1 (inverso): ");
   	        for (int num11 : array3) {
   	            System.out.print(num11 + " ");
   	        }
   	        System.out.println();
       
       	//Ejercicio12
       	          Scanner scanner2 = new Scanner(System.in);
       	          int[] array4 = new int[10]; 
       	          char opcion;

       	          do {
       	              System.out.println("Seleccione una opción:");
       	              System.out.println("a. Mostrar valores.");
       	              System.out.println("b. Introducir valor.");
       	              System.out.println("c. Salir.");
       	              opcion = scanner2.next().charAt(0);

       	              if (opcion == 'a') {
       	                  System.out.println("Valores en el array:");
       	                  for (int i = 0; i < array4.length; i++) {
       	                      System.out.println("Posición " + i + ": " + array4[i]);
       	                  }
       	              } else if (opcion == 'b') {
       	                  System.out.print("Escribe un numero (entero): ");
       	                  int valor = scanner2.nextInt();
       	                  System.out.print("Introduzca una posición (0-9): ");
       	                  int posicion = scanner2.nextInt();

       	                  if (posicion >= 0 && posicion < array4.length) {
       	                      array4[posicion] = valor;
       	                      System.out.println("Valor " + valor + " añadido en la posición " + posicion);
       	                  } else {
       	                      System.out.println("Error, debe estar entre 0 y 9.");
       	                  }
       	              } else if (opcion != 'c') {
       	                  System.out.println("Opción no válida. Intentalo de nuevo.");
       	              }

       	          } while (opcion != 'c');

       	          System.out.println("Saliste del programa");
       	          scanner2.close();
     

       	         //Ejercicio13
       	            Scanner scanner3 = new Scanner(System.in);

       	            System.out.print("Introduzca el valor inicial (V): ");
       	            int V = scanner3.nextInt();

       	            System.out.print("Introduzca el incremento (I): ");
       	            int I = scanner3.nextInt();

       	            System.out.print("Escribe el número de valores a crear (N): ");
       	            int N2 = scanner3.nextInt();
       	            
       	            int[] secuencia = new int[N2];
       	            for (int i = 0; i < N2; i++) {
       	                secuencia[i] = V + (i * I);
       	            }
       	            
       	            System.out.println("La secuencia aritmética es: ");
       	            for (int num13 : secuencia) {
       	                System.out.print(num13 + " ");
       	            }

       	            scanner3.close();
       	       

       	//Ejercicio14
  	            int[] secuencia1 = new int[55]; 
  	            int num12 = 0;

  	            for (int i = 1; i <= 10; i++) {
  	                for (int j = 0; j < i; j++) {
  	                    secuencia[num12++] = i;
  	                }
  	            }

  	            for (int num13 : secuencia1) {
  	                System.out.print(num13 + " ");
  	            }

  	            
	}
	}

	



		
	
