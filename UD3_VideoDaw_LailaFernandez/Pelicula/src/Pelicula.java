import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    
    public class Pelicula {
        
        private static int contador = 0;
    
        //Atributos
        private int codPeli;
        private String titulo;
        private String genero;
        private String fecha_registro;
        private String fecha_bajaPeli;
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
    
    
        public static int getContador() {
            return contador;
        }
        public int getcodPelicula() {
            return codPeli;
        }
        public String getTitulo() {
            return titulo;
        }
        public String getGenero() {
            return genero;
        }
        public String getfechaRegistro() {
            return fecha_registro;
        }
        public String getfechaBaja() {
            return fecha_bajaPeli;
        }
        public String getfechaAlquiler() {
            return fecha_alquiler;
        }
        public boolean isAlquilada() {
            return isAlquilada;
        }
        
        public String mostrarInfoPelicula(){
            String getInfoPelicula = String.format("INFO DE LA PELICULA" + 
            "Cod: Pel-0%s, Titulo: %s, Genero: %s, Registro: %s", 
            this.codPeli, this.titulo, this.genero, this.fecha_registro);
            return getInfoPelicula;
        }
    }
    

