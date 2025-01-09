public abstract class Astros {
        protected double masa_del_cuerpo;
        protected double diametro_medio;
        protected double tiempo_rotacion;
        protected double tiempo_traslacion;
        protected double distancia_media;
   
        
        public double getMasa_del_cuerpo() {
           return this.masa_del_cuerpo;
        }
     
        public double getDiametro_medio() {
           return this.diametro_medio;
        }
     
        public double getTiempo_rotacion() {
           return this.tiempo_rotacion;
        }
     
        public double getTiempo_traslacion() {
           return this.tiempo_traslacion;
        }
     
        public double getDistancia_media() {
           return this.distancia_media;
        }
     
        public abstract String mostrarInfo();
}
