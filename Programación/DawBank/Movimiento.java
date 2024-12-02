

import java.time.LocalDateTime;

public class Movimiento {

    private static int contador = 0;

    //Atributos
    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;


    //Constructor
    public Movimiento (String tipo, double cantidad) {
        this.id = this.contador;
        this.contador++;

        this.fecha = LocalDateTime.now().toString(); //Fecha y hora exacta actualizada
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    //Método
    public String infoMovimiento () {
        
        String info  = String.format("MOVIMIENTO - Numero de movimiento %s, Fecha del movimiento %s, Tipo del movimiento %s, Cantidad de dinero en el movimiento %s", this.fecha, this.tipo, this.cantidad);

        return info;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCantidad() {
        return cantidad;
    }



}
