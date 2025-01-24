import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) throws Exception {
        
        Scanner reader = new Scanner(System.in);
        String opcion;
        Agenda agenda = new Agenda(null);
        do {
            reader = new Scanner(System.in);
            System.out.println("Bienvenido a tu agenda de contactos!");
            System.out.println("Escoge una opcion: ");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Comprobar que un contacto existe");
            System.out.println("4. Mostrar toda la agenda");
            System.out.println("5. Buscar posicion de contacto");
            System.out.println("6. Salir");
            opcion = reader.nextLine();

            switch (opcion) {
                case "1":
                System.out.println("Escribe el nombre de tu contacto:");
                String nombre = reader.nextLine();
                System.out.println("Escribe el numero de telefono de tu contacto:");
                String telefono = reader.nextLine();

                Contactos c = new Contactos (nombre, telefono);
                boolean agregarContacto = agenda.agregarContacto(c);

                if (agregarContacto) {
                    System.out.println("Tu contacto ha sido añadido correctamente");
                }
                else {
                    System.out.println("No se ha podido completar la operacion con exito, intentelo de nuevo");
                }
                    
                    break;

                case "2": 
                System.out.println("¿A que contacto deseas eliminar?");
                String eliminarNombre = reader.nextLine();

                if (agenda.eliminarContacto(eliminarNombre) == true) {
                    System.out.println("Acabas de eliminar a " + eliminarNombre);
                }
                else {
                    System.out.println(eliminarNombre + "no ha podido ser eliminado, intentelo de nuevo y asegurese de que esta entre sus contactos");
                }
                    break;

                case "3": 
                System.out.println("Escribe el nombre del usuario para comprobar si existe o no: ");
                String comprobarNombre = reader.nextLine();
                if (agenda.existeContacto(comprobarNombre) == true) {
                    System.out.println("Este contacto si existe ");
                }
                else {
                    System.out.println("No hemos podido encontarr este contacto, intentelo de nuevo y asegurese de que este bien escrito");
                }
                break;

                case "4":
                System.out.println("Esta es tu lista de contactos: ");
                agenda.listarContactos();

                case "5":
                System.out.println("Escribe el nombre de tu contacto: ");
                String buscarNombre = reader.nextLine();
                if (agenda.buscarContacto(buscarNombre) != 0) {
                    System.out.println("Este contacto esta en la posicion " + agenda.buscarContacto(buscarNombre));
                }
            }
            } while (!opcion.equals("6"));
        }
        }
