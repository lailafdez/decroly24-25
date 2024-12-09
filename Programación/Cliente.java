import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {

            private static int contador = 0;
        
            //Atributos
            private String dni;
            private String nombre;
            private int numSocio;
            private String fecha_nacimiento;
            private String direccion;
            private String fechaBaja;
            private Pelicula [] peliculas_alquiladas;
            private int nPeliculas;
        
            private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");

            public Cliente(String dni, String nombre, String direccion, String fecha_nacimiento, String fechaBaja, int nPeliculas){
                this.numSocio = this.contador;
                this.contador++;
        
                this.dni = dni;
                this.nombre = nombre;
                this.direccion = direccion;
                this.fecha_nacimiento = " ";
                this.fechaBaja = LocalDateTime.now().format(formatter);
                this.peliculas_alquiladas = new Pelicula [100];
                this.nPeliculas = nPeliculas;
            }
            
            public String getDni() {
                return dni;
            }
            public String getNombre() {
                return nombre;
            }
            public int getNumSocio() {
                return numSocio;
            }
            public String getDireccion() {
                return direccion;
            }
            public String getFechaNacimiento() {
                return fecha_nacimiento;
            }
            public String getFechaBaja() {
                return fechaBaja;
            }
            public int getNumPelis() {
                return nPeliculas;
            }
            
            //Metodos
            public String mostrarInfoCliente(){
                String getMostrarInfoCliente = String.format("INFORMACION DEL CLIENTE: " +
                "DNI: %s, Nombre: %s, Numero de socio: %s, Direccion: %s, Fecha de nacimiento %s, Nº de películas alquiladas %s",  
                this.dni, this.nombre, this.numSocio, this.direccion, this.fecha_nacimiento, this.nPeliculas );
                return getMostrarInfoCliente;
            }

            public String mostrarPelisAlquiladas(){
                String mostrarInfoPeli = String.format("PELICULAS ALQUILADAS: " +
                "Nombre: %s ",
                this.nombre, this.mostrarInfoCliente());
                for (int i = 0; i < nPeliculas; i++){
                    mostrarInfoPeli += peliculas_alquiladas [i].mostrarInfoPelicula();
                }
                return mostrarInfoPeli;
            }
        
}//class
     

