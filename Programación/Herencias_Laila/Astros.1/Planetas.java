public class Planetas extends Astros {

    //Atributos
    private double distancia_sol;
    private double orbita_sol;
    private String [] nPlaneta;
    private double tiene_satelites;

    //Constructores
    public Planetas (double distancia_sol, double orbita_sol, double tiene_satelites, double masa_del_cuerpo,
    double diametro_medio, double tiempo_rotacion, double tiempo_traslacion, double distancia_media) {
        this.tiene_satelites = tiene_satelites;
        this.orbita_sol = orbita_sol;
        this.distancia_sol = distancia_sol;
    }
    //Metodos
    @Override
    public String mostrarInfo () {
        return "Masa del cuerpo =" + masa_del_cuerpo + "diametro medio =" + diametro_medio + "periodo de rotacion sobre su eje =" + tiempo_rotacion + "periodo de traslacion alrededor del cuerpo que orbitan = " + tiempo_traslacion + "distancia media a ese cuerpo = " + distancia_media + "Distancia al sol = " + this.distancia_sol + "Orbita al sol = " + this.orbita_sol + "Tiene satelites = " + this.tiene_satelites;
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

    public String [] getNplanetas() {
        return nPlaneta ;
    }

}
