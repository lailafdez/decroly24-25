import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        
        

        Astros [] SistemaSolar = new Astros[10];

    }
    private static void menuOpciones() {
        Scanner reader1 = new Scanner(System.in);
        String opcion = "";
        System.out.println("Escoga la opcion que desee");
        System.out.println("1. Registrar Satelite");
        System.out.println("2. Registrar Planeta");
        System.out.println("3. Mostrar Satelites registrados");
        System.out.println("4. Mostrar Planetas registrados");
        System.out.println("5. Salir");
    }

    private static void menuOpciones (String opcion) {
        Scanner reader = new Scanner(System.in);
        switch (opcion) {
            case "1":
            System.out.println("Distancia al planeta: ");
            double distancia_sol = reader.nextDouble();
            System.out.println("Orbita planetaria: ");
            double orbita_planetaria = reader.nextDouble();
            System.out.println("Planeta al que pertenece: ");
            String planeta_pertenece = reader.nextLine();
            System.out.println("Masa del cuerpo: "); 
            double masa_del_cuerpo = reader.nextDouble();
            System.out.println("Diametro medio: "); 
            double diametro_medio = reader.nextDouble();
            System.out.println("Tiempo de rotacion: ");
            double tiempo_rotacion = reader.nextDouble(); 
            System.out.println("Tiempo e traslacion: "); 
            double tiempo_traslacion = reader.nextDouble();
            System.out.println("Distancia media: ");
            double distancia_media = reader.nextDouble();

            System.out.println("Satelite registrado con exito");
                break;
            case "2":

                break;
            case "3":
            System.out.println( );
                break;
            case "4":

                break;
            default:
                System.out.println("Introduzca una opcion correcta del menu");
                break;
    }

    
        
            
    }    
}

        
