package AC5;

import java.util.Scanner;

public class AC5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();

        String[] palabras = texto.split(" ");
        

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
       
		        
		//Ejercicio2
		        Scanner scanner1 = new Scanner(System.in);

		        System.out.print("Pon la primera cadena: ");
		        String cadena1 = scanner1.nextLine();
		                
		        System.out.print("Pon la segunda cadena: ");
		        String cadena2 = scanner1.nextLine();

		        boolean SonIguales = cadena1.equals(cadena2);
		        boolean SinMayusculas = cadena1.equalsIgnoreCase(cadena2);

		        if (SonIguales) {
		           System.out.println("Las cadenas son iguales.");
		        } else {
		           System.out.println("Las cadenas son diferentes.");
		        }

		        if (SinMayusculas) {
		           System.out.println("Las cadenas son iguales (sin diferenciar mayúsculas y minúsculas).");
		        } else {
		            System.out.println("Las cadenas son diferentes (sin diferenciar mayúsculas y minúsculas).");
		        }

		       
		  
		//Ejercicio3
		        Scanner scanner2 = new Scanner(System.in);

		        System.out.print("Escribe tu nombre: ");
		        String nombre = scanner2.nextLine();
		                
		        System.out.print("Escribe tu apellido: ");
		        String apellido = scanner2.nextLine();
		        
		        System.out.print("Escribe tu segundo apellido: ");
		        String apellido2 = scanner2.nextLine();
		       
		        String codigo = 
		        (nombre.length() >= 3 ? nombre.substring(0, 3).toUpperCase() : nombre.toUpperCase()) +
		        (apellido.length() >= 3 ? apellido.substring(0, 3).toUpperCase() : apellido.toUpperCase()) +
		        (apellido2.length() >= 3 ? apellido2.substring(0, 3).toUpperCase() : apellido2.toUpperCase());
		                
		         
		        System.out.println("El código del usuario es: " + codigo);
		                
		//Ejercicio4
		        Scanner scanner3 = new Scanner(System.in);
		            
		        System.out.print("Escribe una frase: ");
		        String frase = scanner3.nextLine().toLowerCase();
                int vocalA = 0;
                int vocalE = 0;
                int vocalI = 0;
                int vocalO = 0;
                int vocalU = 0;
                
         
                for (char letra : frase.toCharArray()) {
                    switch (letra) {
                        case 'a':
                            vocalA++;
                            break;
                        case 'e':
                            vocalE++;
                            break;
                        case 'i':
                            vocalI++;
                            break;
                        case 'o':
                            vocalO++;
                            break;
                        case 'u':
                            vocalU++;
                            break;
                        default:
                            break; 
                    }
                }
                
  
                System.out.println("Nº de A: " + vocalA);
                System.out.println("Nº de E: " + vocalE);
                System.out.println("Nº de I: " + vocalI);
                System.out.println("Nº de O: " + vocalO);
                System.out.println("Nº de U: " + vocalU);
                
         //Ejercicio5
    
                        Scanner scanner4 = new Scanner(System.in);
                        
                        System.out.print("Escribe una frase solo con letras y espacios  (ni comas, ni puntos, "
                        		+ "ni acentos, etc.): ");
                        String frase1 = scanner.nextLine();
                       
            

                        
                    

		               
		          

		        


                scanner3.close();
		        scanner1.close();
		        scanner.close();
		        scanner2.close();
	}

}
