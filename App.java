import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);
    Taller taller = new Taller ();
    String opcion;
    String matricula, color, marca;
    
    System.out.println("Bienvenido a talleres laila");
    do{
      System.out.println("Escoge una opcion");
      System.out.println("1 - Añadir coche");
      System.out.println("3 - Eliminar coche");
      System.out.println("5 - Salir");
      opcion = teclado.nextLine();

      switch (opcion) {
        case "1":
        do {
          System.out.println("Escribe la matricula del coche: ");
          matricula = teclado.nextLine();
        } while (!validarMatricula(matricula));
        System.out.println("Escribe el color del coche: ");
        color = teclado.nextLine();
        System.out.println("Escribe la marca del coche: ");
        marca = teclado.nextLine();
        taller.agregarCoche(matricula, marca, color);
        System.out.println("El coche ha sido añadido exitosamente. ");
          break;
        case "2":
        System.out.println("Escribe la matricula del coche: ");
        matricula = teclado.nextLine();
        if (taller.eliminarCoche(taller, matricula) == true){
          System.out.println("El coche se ha eliminado exitosamente");
        }
        else {
          System.out.println("El coche no se ha podido eliminar");
          System.out.println("Escribe la matricula del coche: ");
          matricula = teclado.nextLine();
        }
          break;
        case "3":
        System.out.println("Has salido del programa, gracias.");
          break;
        default : 
        System.out.println("Opcion incorrecta");
      }
    }while (!opcion.equals("3"));
}
      public static boolean validarMatricula(String matricula) {
      Pattern pat = Pattern.compile("[0-9]{4}[A-Z]{3}");
      Matcher mat = pat.matcher(matricula);
      return mat.matches();
  
}
}





    
  
