import java.util.Scanner;
import java.util.regex.Pattern;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in); 
        CuentaBancaria cuenta1;
        double saldo = 0;

        System.out.println("Introduzca su IBAN: ");
        String iban = reader.nextLine();
        Pattern patron = Pattern.compile("[A-Z]{2}[0-9]{22}");
        
            if (patron.matcher(iban).matches()) {
                System.out.println("IBAN correcto.");
            } 
            else {
                System.out.println("El IBAN debe tener 22 caracteres.");
                System.out.println("Introduzca su IBAN: ");
                iban = reader.nextLine();
            }

        System.out.println("Introduzca el títular de la tarjeta: ");
        String titular = reader.nextLine();

        cuenta1 = new CuentaBancaria(iban, titular, 0); 
        System.out.println("Cuenta creada");

        
        System.out.println("Que deseas hacer en tu cuenta: ");
        System.out.println("1 - Datos de la cuenta");
        System.out.println("2 - IBAN");
        System.out.println("3 - Titular");
        System.out.println("4 - Saldo");
        System.out.println("5 - Ingreso");
        System.out.println("6 - Retirada");
        System.out.println("7 - Movimientos");
        System.out.println("8 - Salir");
        String opcion = reader.nextLine();
        
        do{
            if(opcion.equals("1")) {
                System.out.println(cuenta1.informacionCuenta());
            }
            else if(opcion.equals("2")) {
                System.out.println("IBAN: " + cuenta1.informacionIban());
            }
            else if(opcion.equals("3")) {
                System.out.println("Titular de la tarjeta: " + cuenta1.getTitular());
            } 
            else if(opcion.equals("4")) {
                System.out.println("Saldo: " + cuenta1.getSaldo());
            }
            else if(opcion.equals("5")) {
                reader = new Scanner(System.in);
                System.out.println("Cantidad a introducir = ");
                double cantIngresar = reader.nextDouble();
                if (cantIngresar > 0) {
                    System.out.println("Cantidad Valida");
                }
                else {
                    System.out.println("La cantidad a ingresar no es valida");
                }
                Movimiento m1 = new Movimiento("Ingresar", cantIngresar);
                cuenta1.ingresarDinero(m1);
            }
            else if(opcion.equals("6")) {
                reader = new Scanner(System.in);
                System.out.println("Cantidad a retirar = ");
                double cantRetirar = reader.nextDouble();
                if (cantRetirar > 0) {
                    System.out.println("Cantidad Valida");
                }
                else {
                    System.out.println("La cantidad a retirar no es valida");
                }
                Movimiento m1 = new Movimiento("Ingresar", cantRetirar);
                cuenta1.sacarDinero(m1);
            }
            else if(opcion.equals("7")) {
                System.out.println("Movimientos: " + cuenta1.informacionMovimiento());
            } 
        }while (!opcion.equals ("8") );
    }
}

    


