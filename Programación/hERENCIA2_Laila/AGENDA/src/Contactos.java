public class Contactos {
    
    private String nombre;
    private String telefono;

    public Contactos (String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre () {
        return nombre;
    }
    public String getTelefono () {
        return telefono;
    }

    @Override
    public String toString() {
        return "Contactos [nombre=" + nombre + ", telefono=" + telefono + "]";
    }
}
