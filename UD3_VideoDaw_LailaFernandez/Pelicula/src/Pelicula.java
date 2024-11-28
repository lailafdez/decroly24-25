import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    
    public class Pelicula {
        
        private static int contador = 0;
    
        //Atributos
        private int codPeli;
        private String titulo;
        private String genero;
        private String fecha_registro;
        private String fecha_bajaCliente;
        private String fecha_alquiler;
        private boolean isAlquilada;    
    
        private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");

        //Constructores
        public Pelicula(String titulo, String genero){
            this.codPeli = this.contador;
            this.contador++;
    
            this.titulo = titulo;
            this.genero = genero;
            this.fecha_registro = LocalDateTime.now().format(formatter);
            this.isAlquilada = false;
        }

        //Getters
        public static int getContador() {
            return contador;
        }

        public int getCodPeli() {
            return codPeli;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getGenero() {
            return genero;
        }

        public String getFecha_registro() {
            return fecha_registro;
        }


        public String getFecha_bajaCliente() {
            return fecha_bajaCliente;
        }


        public String getFecha_alquiler() {
            return fecha_alquiler;
        }

        public boolean isAlquilada() {
            return isAlquilada;
        }
        

        public DateTimeFormatter getFormatter() {
            return formatter;
        }

        public String mostrarInfoPelicula(){
            String getInfoPelicula = String.format("INFORMACIÓN DE LA PELICULA" + 
            "Codigo Peli: %s, Titulo: %s, Genero: %s, Registro: %s", 
            this.codPeli, this.titulo, this.genero, this.fecha_registro);
            return getInfoPelicula;
        }
    }
    

