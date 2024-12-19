
public class Trabajador {

    //Atributos
    private String nombre_trabajador;
    private String fecha_nacimiento;
    private String dni;
    private String direccion;
    private String numero_ss;

    public Trabajador (String nombre_trabajador, String dni, String numero_ss) {
        this.fecha_nacimiento = fecha_nacimiento;
        this.nombre_trabajador = nombre_trabajador;
        this.dni = dni;
        this.direccion = direccion;
        this.numero_ss = numero_ss;
    }

    public String getNombre_trabajador() {
        return nombre_trabajador;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumero_ss() {
        return numero_ss;
    }

    //Metodos
    public String mostrarInfoTrabajador () {
        String info_trabajador = String.format("DATOS DEL TRABAJADOR \n Nombre: %s \n Fecha de nacimiento: %s \n DNI: %s \n Direccion: %s \n Numero SS: %s", this.nombre_trabajador, this.dni, this.direccion, this.numero_ss);
        return info_trabajador;
    }

    
}
