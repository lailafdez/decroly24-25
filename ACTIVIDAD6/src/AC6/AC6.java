<<<<<<< HEAD
package AC6;

import java.util.Scanner;

public class AC6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio1

		        int[][] matriz = new int[5][5];
		        int numero = 1;

		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 5; j++) {
		                matriz[i][j] = numero;
		                numero++;
		            }
		        }

		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 5; j++) {
		                System.out.print(matriz[i][j] + "\t");
		            }
		            System.out.println();
		        }

		        
		//Ejercicio2 
		        int[][] matriz1 = new int[10][10];

		        for (int i = 0; i < 10; i++) {
		        	for (int j = 0; j < 10; j++) {
		        		matriz1[i][j] = (i + 1) * (j + 1);
		                   }
		                }
 
		        for (int i = 0; i < 10; i++) {
		        	for (int j = 0; j < 10; j++) {
		                 System.out.print(matriz1[i][j] + "\t"); 
		                 }
		                 System.out.println();
		             }
		//Ejercicio3
		        Scanner scanner1 = new Scanner(System.in);
		        
		        System.out.print("Elige el número de filas, sera N: ");
		        int N = scanner1.nextInt();
		        System.out.print("Elige el número de filas, sera M: ");
		        int M = scanner1.nextInt();

		        int[][] matriz2 = new int[N][M];

		        System.out.println("Escribe los valores de la matriz:");
		        for (int i = 0; i < N; i++) {
		            for (int j = 0; j < M; j++) {
		                System.out.print("Los valores estn en la posicion [" + i + "][" + j + "]: ");
		                matriz2[i][j] = scanner1.nextInt();
		            }
		        }

		        int mayor0 = 0;
		        int menor0 = 0;
		        int igual0 = 0;

		        for (int i = 0; i < N; i++) {
		            for (int j = 0; j < M; j++) {
		                if (matriz2[i][j] > 0) {
		                    mayor0++;
		                } else if (matriz2[i][j] < 0) {
		                    menor0++;
		                } else {
		                    igual0++;
		                }
		                System.out.print(matriz2[i][j] + "\t");
		            }
		        }
		        System.out.println();
		        System.out.println("Cantidad de valores mayores que cero: " + mayor0);
		        System.out.println("Cantidad de valores menores que cero: " + menor0);
		        System.out.println("Cantidad de valores iguales a cero: " + igual0);

		        scanner1.close();		        
		        
		  //Ejercicio4

		                Scanner scanner2 = new Scanner(System.in);
		                final int alumnos = 4;
		                final int asignaturas = 5;
		              
		                double[][] notas = new double[alumnos][asignaturas];
		                
		                for (int i = 0; i < alumnos; i++) {
		                    System.out.println("Escribe las notas para el alumno" + (i + 1) );
		                    for (int j = 0; j < asignaturas; j++) {
		                        System.out.print("Nota de la asignatura " + (j + 1) + ": ");
		                        notas[i][j] = scanner2.nextDouble();
		                    }
		                }


		                for (int i = 0; i < alumnos; i++) {
		                    double min = notas[i][0];
		                    double max = notas[i][0];
		                    double suma = 0;

		                    for (int j = 0; j < asignaturas; j++) {
		                        suma += notas[i][j];
		                        if (notas[i][j] < min) {
		                            min = notas[i][j];
		                        }
		                        if (notas[i][j] > max) {
		                            max = notas[i][j];
		                        }
		                    }

		                    double media = suma / asignaturas;
		                    System.out.println("Alumno " + (i + 1) + ":");
		                    System.out.println("Nota mínima: " + min);
		                    System.out.println("Nota máxima: " + max);
		                    System.out.println("Media: " + media);
		                    System.out.println();
		                }

		                scanner2.close();

		        

}
}
=======
package AC6;

public class AC6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio1
		        int[][] matriz = new int[5][5];
		        int contador = 1;
		        
		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 5; j++) {
		                matriz[i][j] = contador;
		                contador++;
		            }
		        }

		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 5; j++) {
		                System.out.print(matriz[i] [j]);
		            }
		            System.out.println();
		        }
		        
		//Ejercicio2
		     int [][] matriz1 = new int[10][10];
		     
		     for (int i = 0; i < 10; i++) {
		    	 for (int j = 0; j < 10; i++) {
		    		 matriz1[i][j] = (i + 1) * (j + 1);
		    	 }
		     }
		     for (int i = 0; i < 10; i++) {
		    	 for (int j = 0; j < 10; j++) {
		    	 System.out.print(matriz1[i][j]); 
		    	 }
		    	 System.out.println(); 		    	        
		     }
		    
		        

}
}
>>>>>>> e53c32d1a82505d3df80b039d2b197a35c6056d9
