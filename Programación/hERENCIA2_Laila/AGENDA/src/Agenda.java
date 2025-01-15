public class Agenda {
    
    private Contactos [] contacto;

    public Agenda () {
        this.contacto = new Contactos [10];
    }
    public boolean agregarContacto(Contactos c){
        boolean isAdd = false;
        for (int i = 0; i < contacto.length && !isAdd; i++){
            if (contacto[i] == null) {
                contacto[i] = c;
                isAdd = true;
            }
        }
        return agregarContacto(c);
    }
    public boolean eliminarContacto(String nombre) {
        return false;
    }
    public boolean existeContacto (Contactos c) {

        for (int i = 0; i < contacto.length; i++){
            if (contacto[i] != null) {
                contacto[i] = c;
                return true;
            }
        }
        return false;
    }

}
