public class Cliente {
    public static void main(String[] args) throws Exception {
            private static int contador = 0;
        
            //Atributos
            private String dni;
            private String nombre;
            private String fecha_nacimiento;
            private int numSocio;
            private String direccion;
            private String fecha_baja;
            private int p_alquiladas;
        
            public Cliente(String dni, String nombre, String direccion, String fecha_nacimiento){
                this.numSocio= this.contador;
                this.contador++;
        
                this.dni = dni;
                this.nombre = nombre;
                this.direccion = direccion;
                this.fecha_nacimiento = "";
                this.p_alquiladas = 0;
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
                return fecha_baja;
            }
            public int getPalquiladas() {
                return p_alquiladas;
            }
            
            public String mostrarInfoCliente(){
                String getInformacionCliente = String.format("Información del cliente" +
                "DNI: %s, Nombre: %s, Numero de socio: %s, Direccion: %s, Fecha de nacimiento %s, Nº de películas alquiladas %s",  
                this.dni, this.nombre, this.numSocio, this.direccion, this.fecha_nacimiento, this.p_alquiladas );
                return mostrarInfoCliente();
            }
        


        }//main
    }//class
     

