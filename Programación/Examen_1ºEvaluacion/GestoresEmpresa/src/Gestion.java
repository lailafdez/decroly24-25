import java.util.Scanner;
import java.util.regex.Pattern;

public class Gestion {
    public static void main(String[] args) throws Exception {

        System.out.println("Bienvenidos a la empresa GestoresEmpresa");

        Scanner reader = new Scanner(System.in); 

        System.out.println("Introduzca el nombre de la empresa:");
        String nombre_empresa = reader.nextLine();
        System.out.println("Introduzca su CIF: ");
        String cif = reader.nextLine();
        Pattern patron = Pattern.compile("[A-Z]{1}[0-9]{10}");
        
        if (patron.matcher(cif).matches()) {
        System.out.println(" CIF correcto.");
        } 
        else {
            System.out.println("El CIF debe tener 1 letra mayuscula y 10 digitos.");
            System.out.println("Introduzca su CIF: ");
            cif = reader.nextLine();
        }

        Empresa empresa1 = new Empresa(nombre_empresa, cif, null, 5); 
        System.out.println("Empresa creada");

        String opcion;
        Scanner reader1;
        do {
            reader1 = new Scanner(System.in);
            
            imprimirMenuOpciones();

            opcion = reader.nextLine();

            menuBanca(empresa1, opcion);


        } while(!opcion.equalsIgnoreCase("8");

        private static void imprimirMenuOpciones() {
        System.out.println("Escoga la opcion que desee");
        System.out.println("1. Crear persona");
        System.out.println("2. Registrar trabajador en la empresa");
        System.out.println("3. Mostrar informacion general de la empresa");
        System.out.println("4. Mostrar el numero de trabajadores actuales");
        System.out.println("5. Mostrar informacion de todos los trabajadores");
        System.out.println("6. Eliminar trabajador de la empresa");
        System.out.println("7. Eliminar persona del programa");
        System.out.println("8. Salir de la aplicacion");

        private static void menuEmpresa (Empresa empresa1, String opcion) {
        switch (opcion1) {
        case "1":
            Trabajador trabajador;
            System.out.println("Introduzca su nombre:");
            String nombre_trabajador = reader1.nextLine();
            System.out.println("Introduzca su DNI: ");
            String dni = reader1.nextLine();
            Pattern patron1 = Pattern.compile("[0-9]{10}[A-Z]{1}");

                if (patron1.matcher(dni).matches()) {
                System.out.println(" DNI correcto.");
                } 
                else {
                System.out.println("El DNI debe tener 8 digitos y 1 letra.");
                System.out.println("Introduzca su DNI: ");
                dni = reader.nextLine();
            }
            System.out.println("Introduce su numero de la seguridad social: ");
            String numero_ss = reader.nextLine();
            Pattern patron2 = Pattern.compile("[0-9]{10}");
                if (patron2.matcher(numero_ss).matches()) {
                    System.out.println(" Numero correcto.");
                    } 
                    else {
                    System.out.println("El numero debe tener 10 digitos.");
                    System.out.println("Introduzca su DNI: ");
                    cif = reader.nextLine();
            }

            trabajador = new Trabajador (nombre_trabajador, dni, numero_ss); 
            System.out.println("Usuario creado");
        break;
    
        case "2":
           
        break;
        case "3":
            System.out.println("" + empresa1.mostrarInfoEmpresa());
        break;
        case "4":
            System.out.println("Numero de trabajadores actuales: " + empresa1.getTrabajadores());
        break;
        case "5":
            Trabajador [] trabajadores = empresa1.getTrabajadores();
            System.out.println("Trabajadores que hay registradoes en la empresa: ");
        break;
        case "6":
        break;
        case "7":
        break;
        case "8":
            System.out.println("Se cerrara el programa, gracias por tu visita");
        break;

        default:
        System.out.println("Opcion incorrecta, vuelva a escoger");

    }
    }
}



