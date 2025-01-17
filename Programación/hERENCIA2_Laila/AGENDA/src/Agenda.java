public class Agenda {
    
    private Contactos [] contacto;
    private int nContactos;
    
    public Agenda (Contactos [] contacto) {
        this.contacto = new Contactos[10];
        this.nContactos = 0;
    }

    public boolean agregarContacto (Contactos c){
        boolean isAdd = false; 
        if (c != null) {
        contacto [this.nContactos] = c;
        nContactos ++;
        isAdd = true;
        }
        return isAdd;
    }
    public boolean eliminarContacto (String nombre) {
        boolean isRemove = false;
        if (this.contacto != null) {
            for (int i = 0; i < nContactos; i++) {
                if (contacto [i].getNombre().equalsIgnoreCase(nombre)) {
                    contacto [i] = null;
                    nContactos --;
                }
            }
        }
        return isRemove;
    }
    public boolean existeContacto (String nombre) {
        boolean isTrue = false;
        if (this.contacto != null) {
            for (int i = 0; i < nContactos; i++) {
                if (contacto [i].getNombre().equalsIgnoreCase(nombre)) {
                    isTrue = true;
                }
            }
        }
        return isTrue;
    }

    public void listarContactos () {
        if (this.contacto != null) {
            for (int i = 0; i < nContactos; i++) {
                System.out.println("CONTACTO " + (i + 1) + ":" + contacto [i].toString());
            }
        }
    }
    
    public int buscarContacto (String nombre) {
        int posicion = 0;
        if (this.contacto != null) {
            for (int i = 0; i < nContactos; i++) {
                if (contacto [i].getNombre().equalsIgnoreCase(nombre)) {
                    posicion = i;
                }
            }
        }
        return posicion;
    }


}