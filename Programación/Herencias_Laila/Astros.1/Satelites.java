public class Satelites extends Astros {

    //Atributos
    private double distancia_planeta;
    private double orbita_planetaria;
    private String [] nSatelites;
    private String planeta_pertenece;

    //Constructores
    public Satelites (double distancia_planeta, double orbita_planetaria, String planeta_pertenece, double masa_del_cuerpo, double diametro_medio, double tiempo_rotacion, double tiempo_traslacion, double distancia_media) {
        super(masa_del_cuerpo, diametro_medio, tiempo_rotacion, tiempo_traslacion, distancia_media);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planetaria = orbita_planetaria;
        this.planeta_pertenece = planeta_pertenece;
    }

    //Metodos
    @Override
    public String mostrarInfo() {
        return "Masa del cuerpo =" + masa_del_cuerpo + "diametro medio =" + diametro_medio + "periodo de rotacion sobre su eje =" + tiempo_rotacion + "periodo de traslacion alrededor del cuerpo que orbitan = " + tiempo_traslacion + "distancia media a ese cuerpo = " + distancia_media;  
    }

    @Override
    public String infoPyS() {
        String informacionS = mostrarInfo();
        informacionS += String.format("Distancia al planeta: %s, Orbita planetaria: %s, Plantea al que pertenece: %s", this.distancia_planeta, this.orbita_planetaria, this.planeta_pertenece);
        return infoPyS();
    }

    //Getters y Setters
    public double getDistancia_planeta() {
        return distancia_planeta;
    }

    public String [] getNsatelites () {
        return nSatelites();
    }

    public void setDistancia_planeta(double distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public double getOrbita_planetaria() {
        return orbita_planetaria;
    }

    public void setOrbita_planetaria(double orbita_planetaria) {
        this.orbita_planetaria = orbita_planetaria;
    }

    public String getPlaneta_pertenece() {
        return planeta_pertenece;
    }

    public void setPlaneta_pertenece(String planeta_pertenece) {
        this.planeta_pertenece = planeta_pertenece;
    }
    
}
