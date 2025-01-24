public class Producto implements Comparable <Producto>{

    String nombre;
    int cantidad;

    public Producto (String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String infoProducto () {

        String info = String.format("Información del producto - Nombre del producto: %s, - Cantidad: %s", this.nombre, this.cantidad);

        return info;
    }

    @Override
    public int compareTo (Producto productos) {
        if (this.getCantidad() > productos.getCantidad()) {
            return 1;
        } 
        else if (this.getCantidad() < productos.getCantidad()) {
            return -1;
        }
        else {
            return 0;
        }

    }
}
