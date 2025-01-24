import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) throws Exception {
        
        //Paso1
        Producto ordenador = new Producto("Ordenador HP", 2);
        Producto television = new Producto("Television SONY", 1);
        Producto secador = new Producto("Secador de pelo", 3);
        Producto vestido = new Producto("Vestido", 1);
        Producto leche = new Producto("Bricks de leche", 6);
        Producto jamon = new Producto("Jamon Serrano", 2);

        //Paso2
        ArrayList <Producto> productos = new ArrayList <Producto> (5);

        //Paso3
        productos.add(ordenador);
        productos.add(television);
        productos.add(secador);
        productos.add(vestido);
        productos.add(leche);

        //Paso4
        Iterator <Producto> iterar = productos.iterator();
        Producto cadaProducto;
        while (iterar.hasNext()) {
            cadaProducto = iterar.next();
            System.out.println(cadaProducto.infoProducto());
        //Paso5
            if (cadaProducto.getNombre().equals("Vestido")) {
                iterar.remove();
            }
            if (cadaProducto.getNombre().equals("Ordenador HP")) {
                iterar.remove();
            }
        }

        System.out.println("Recorrido despues de borrar vestido y ordenador");
        for (Producto  p : productos) {
            System.out.println(p.infoProducto());
        }

        //Paso6
        productos.add(2, jamon);

        //Paso7
        System.out.println("Recorrido despues de agregar otro producto");
        for (Producto  p : productos) {
            System.out.println(p.infoProducto());
        }

        //Paso8
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

