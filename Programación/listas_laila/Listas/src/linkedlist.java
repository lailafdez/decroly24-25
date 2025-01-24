import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) throws Exception {
        
        //Paso1
        Producto jabon = new Producto("Jabon de manos", 7);
        Producto tortitas = new Producto("Tortitas de maiz", 3);
        Producto pechuga = new Producto("Pechugas de pavo", 1);
        Producto galletas = new Producto("Galletas con chocolate", 4);
        Producto cereales = new Producto("Chocoflakes", 2);
        Producto zumo = new Producto("Zumos de naranja", 3);

        //Paso2
        LinkedList <Producto> productos = new LinkedList <Producto>();

        //Paso3
        productos.add(cereales);
        productos.add(galletas);
        productos.add(pechuga);
        productos.add(tortitas);
        productos.add(jabon);

        //Paso4
        Iterator <Producto> iterar = productos.iterator();
        Producto cadaProducto;
        while (iterar.hasNext()) {
            cadaProducto = iterar.next();
            System.out.println(cadaProducto.infoProducto());
        
        //Paso5
        if (cadaProducto.getNombre().equals("Pechugas de pavo")) {
            iterar.remove();
        }
        if (cadaProducto.getNombre().equals("Tortitas de maiz")) {
            iterar.remove();
        }
        }

        System.out.println("Recorrido despues de borrar Pechugas de pavo y Tortitas de maiz");
        for (Producto  p : productos) {
            System.out.println(p.infoProducto());
        }

        //Paso6
        productos.add(2, zumo);

        //Paso7
        System.out.println("Recorrido despues de agregar el zumo");
        for (Producto  p : productos) {
            System.out.println(p.infoProducto());
        }

        //Paso8
        System.out.println("La lista ordenada por cantidad se veria de la siguiente forma: ");
        Collections.sort(productos); 
        for (Producto p: productos) {
            System.out.println(p.getCantidad() + " " + p.getNombre()); 
        }

        //Paso9
        productos.clear();
        System.out.println("Recorrido despues de eliminar todos los elementos");
        for (Producto  p : productos) {
            System.out.println(p);
        }
        System.out.println("No hay registrado ningun producto");
    }
}
