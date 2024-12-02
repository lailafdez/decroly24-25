import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VideoDaw {
    
    //Atributos
    private String cif;
    private String nombreVideoClub;
    private String direccion;
    private Pelicula [] pelis_registradas;
    private int nPelisRegistradas;
    private Cliente [] clientes_registrados;
    private String fechaAlta;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");

    //Constructores 
    public VideoDaw (String cif, String direccion, String nombreVideoClub, int nPelisRegistradas) {
        this.cif = cif;
        this.nombreVideoClub = nombreVideoClub;
        this.direccion = direccion;
        this.pelis_registradas = new Pelicula [100];
        this.clientes_registrados = new Cliente [100];
        this.fechaAlta = LocalDateTime.now().format(formatter);
        this.nPelisRegistradas = nPelisRegistradas;
    }

    //Getters 
    public String getCif() {
        return cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public Pelicula[] getPelis_registradas() {
        return pelis_registradas;
    }

    public Cliente[] getClientes_registrados() {
        return clientes_registrados;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public String getNombreVideoClub() {
        return nombreVideoClub;
    }

    public int getNumPelisRegistradas() {
        return nPelisRegistradas;
    }

    //Metodos
    public String mostrarInfoVideoClub() {
        String getMostrarInfoVideoClub = String.format( "INFORMACION DEL VIDEO CLUB: " +
        "CIF: %s, Direccion: %s, Nombre del club: %s",  
        this.cif, this.direccion, this.nombreVideoClub );
        return getMostrarInfoVideoClub;
    }

    public String mostrarPelisRegistradas() {
        
    }
}

