package tareapair;


/**
 *
 * @author juan_
 */
import java.util.ArrayList;

public class TareaPair {

    public static void main(String[] args) {

        ArrayList<Pair<Persona, Persona>> lista = new ArrayList<>();

        Persona dato1 = new Persona("Juan", "18");
        Persona dato2 = new Persona("Comprensar", "17/11/2005");
        Pair<Persona, Persona> yo = new Pair<>(dato1, dato2);
        lista.add(yo);

        for (Pair<Persona, Persona> pair : lista) {
            System.out.println(pair.toString());
        }
        
        
        
    }
}
