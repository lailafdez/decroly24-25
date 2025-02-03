
import java.util.HashMap;
import java.util.Map;

public class Taller {

    private HashMap <String, Coche> cochesTaller;
    
    public Taller() {
        this.cochesTaller = new HashMap<>();
    }

    public boolean agregarCoche (String matricula, String marca, String color) {
       if (cochesTaller.containsKey(matricula)) {
        return false;
       }
       Coche c1 = new Coche(color, marca);
       cochesTaller.put(color, c1);
       return true;
    }

    public boolean eliminarCoche (Taller taller, String matricula) {
        if (taller.cochesTaller.containsKey(matricula)){
            cochesTaller.remove(matricula);
            return true;
        }
            return false;
    }

    public String verMatricula () {
        String listaDeMatriculas = "";
        for (Map.Entry <String, Coche> entry : cochesTaller.entrySet()) {
            listaDeMatriculas += "Matricula: " + entry.getKey();
        }
        return listaDeMatriculas;
    }

    public String verCoches () {
        String listaDeCoches= "";
        for (Coche coche : cochesTaller.values()) {
            listaDeCoches += "Marca: " + coche.getMarca () + " Color: " + coche.getColor();
        }
        return listaDeCoches;
    }
}