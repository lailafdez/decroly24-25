import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Empresa {

    //Atributos
    private int contadorTrabajadores = 0;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private String nombre_empresa;
    private String cif;
    private String fecha_fundacion;
    private int max_trabajadores;
    private Trabajador [] trabajadores;



    public Empresa (String nombre_empresa, String cif, String fecha_fundacion, int max_trabajadores) {
        this.nombre_empresa = nombre_empresa;
        this.cif = cif;
        this.fecha_fundacion = LocalDateTime.now().format(formatter);
        this.max_trabajadores = 5;
        this.trabajadores = new Trabajador[5];
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public String getCif() {
        return cif;
    }

    public String getFecha_fundacion() {
        return fecha_fundacion;
    }

    public int getMax_trabajadores() {
        return max_trabajadores;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void registrarTrabajador (Trabajador trabajador) {
        this.trabajadores[contadorTrabajadores] = trabajador;
        contadorTrabajadores++;
        if (contadorTrabajadores > max_trabajadores) {
            contadorTrabajadores = 0;
        }
    }

    public void eliminarTrabajador (Trabajador trabajador) {
        this.trabajadores[contadorTrabajadores] = trabajador;
        contadorTrabajadores--;
    }

    public String mostrarInfoEmpresa () {
        String info_empresa = String.format("INFORMACION DE LA EMPRESA: \n Nombre de la empresa: %s \n CIF: %s \n Fecha de fundacion: %s", this.nombre_empresa, this.cif, this.fecha_fundacion);
        return info_empresa;
    }

    public String mostrarInfoTrabajadores () {
        String info_trabajadores = "";
        if(contadorTrabajadores > 0){
            for(int i = 0; i < this.contadorTrabajadores; i++){
                if(this.trabajadores[i] != null) {
                    info_trabajadores += this.trabajadores[i].mostrarInfoTrabajador() + "\n";
                }
            }
        }else{
            info_trabajadores = "No hay trabjadores en esta empresa";
        }
        return info_trabajadores;
    }
}
