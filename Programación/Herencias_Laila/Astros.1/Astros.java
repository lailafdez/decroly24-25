public abstract class Astros {
        protected double masa_del_cuerpo;
        protected double diametro_medio;
        protected double tiempo_rotacion;
        protected double tiempo_traslacion;
        protected double distancia_media;
    
        public Astros (double masa_del_cuerpo, double diametro_medio, double tiempo_rotacion, double tiempo_traslacion, double distancia_media) {
         this.masa_del_cuerpo = masa_del_cuerpo;
         this.tiempo_traslacion = tiempo_traslacion;
         this.diametro_medio = diametro_medio;
         this.tiempo_rotacion = tiempo_rotacion;
         this.distancia_media = distancia_media;
        }
     
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
        public abstract String infoPyS();
}
