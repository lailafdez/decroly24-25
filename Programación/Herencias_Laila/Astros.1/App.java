import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Astros [] SistemaSolar = new Astros[10];
        String opcion = "";
        Scanner reader;

    }
    private static void menuOpciones() {
            System.out.println("Escoga la opcion que desee");
            System.out.println("1. Registrar Astro");
            System.out.println("2. Registrar Satelite");
            System.out.println("3. Registrar Planeta");
            System.out.println("4. Salir");
    }
    private static void menuOpciones() {
        switch (opcion) {
            case "1":
                System.out.println(miCuenta.mostrarInfoCuentaBancaria());
                break;

            case "2":
                System.out.println(miCuenta.getIban());
                break;

            case "3":
                System.out.println(miCuenta.getTitular());
                break;
            case "4":
                System.out.println(miCuenta.getSaldo());
                break;

            case "5":
                double cantidad = MiUtils.leerDoublePantalla("Introduzca la cantidad a ingresar");
                miCuenta.ingresar(cantidad);
                if(cantidad > 3000.0){
                    System.out.println("ALta cantidad: se ejecuta aviso a Hacienda");
                }
                break;

            case "6":
                double cantidadR = MiUtils.leerDoublePantalla("Introduzca la cantidad a retirar");
                if((miCuenta.getSaldo()-cantidadR) < -50){
                    System.out.println("“AVISO: Saldo negativo, no se puede realizar la retirada");
                }
                else{
                    miCuenta.retirar(cantidadR);
                }
                break;

            case "7":
                System.out.println(miCuenta.mostrarInfoMovimientos());
                break;
            case "8":
                System.out.println("Se cerrara el programa. Sayonra baby!!!");
                break;

            default:
                System.out.println("Opcion incorrecta, vuelva a escoger");
            }
        }
    }

