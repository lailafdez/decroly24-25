import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in); 

        //menu
        System.out.println("1- Crear y Registrar VideoClub en la franquicia");
        System.out.println("2- Registrar pelicula en VideoClub");
        System.out.println("3- Crear y registrar cliente en VideoClub");
        System.out.println("4- Alquilar pelicula");
        System.out.println("5- Devolver pelicula");
        System.out.println("6- Dar de baja a cliente");
        System.out.println("7- Dar de baja a película");
        System.out.println("8- Salir");

          String teclado1 = reader.nextLine();
    do{
        if(teclado1.equals("1")) {
        
        }
        else if(teclado1.equals("2")) {
           
        }
        else if(teclado1.equals("3")) {

        } 
        else if(teclado1.equals("4")) {

        }
        else if(teclado1.equals("5")) {

        }
        else if(teclado1.equals("6")) {
           
        }
        else if(teclado1.equals("7")) {

        } 
    }while (!teclado1.equals ("8") );

    System.out.println("Has cerrado el programa");
    }
}