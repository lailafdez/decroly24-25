public class Planetas extends Astros {

    //Atributos
    private double distancia_sol;
    private double orbita_sol;
    private double tiene_satelites;

    //Constructores
    public Planetas (double distancia_sol, double orbita_sol, double tiene_satelites, double masa_del_cuerpo,
    double diametro_medio, double tiempo_rotacion, double tiempo_traslacion, double distancia_media) {
        super(masa_del_cuerpo, diametro_medio, tiempo_rotacion, tiempo_traslacion, distancia_media);
        this.tiene_satelites = tiene_satelites;
        this.orbita_sol = orbita_sol;
        this.distancia_sol = distancia_sol;
    }
    //Metodos
    @Override
    public String mostrarInfo () {
        return "Masa del cuerpo =" + masa_del_cuerpo + "diametro medio =" + diametro_medio + "periodo de rotacion sobre su eje =" + tiempo_rotacion + "periodo de traslacion alrededor del cuerpo que orbitan = " + tiempo_traslacion + "distancia media a ese cuerpo = " + distancia_media;  
    }
    @Override
    public String infoPyS() {
        String informacionP = mostrarInfo();
        informacionP += String.format("Distancia al sol: %s, Orbita al sol: %s, Tiene satelites: %s", this.distancia_sol, this.orbita_sol);
        return infoPyS();
    }

    //Getters y Setters
    public double getDistancia_sol() {
        return distancia_sol;
    }

    public double getOrbita_sol() {
        return orbita_sol;
    }

    public double getTiene_satelites() {
        return tiene_satelites;
    }
    public void setDistancia_sol(double distancia_sol) {
        this.distancia_sol = distancia_sol;
    }
    public void setOrbita_sol(double orbita_sol) {
        this.orbita_sol = orbita_sol;
    }
    public void setTiene_satelites(double tiene_satelites) {
        this.tiene_satelites = tiene_satelites;
    }

}
