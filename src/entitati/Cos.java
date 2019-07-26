package entitati;

import java.util.HashMap;
import java.util.Map;

public class Cos extends Produs {
    HashMap<String, Integer> cosCumparaturi = new HashMap<>();

    public HashMap<String, Integer> adaugaInCosulDeCumparaturi(Produs produs, int cantitateProdus) {

        cosCumparaturi.put(produs.numeProdus, cantitateProdus);
        System.out.println("Am adaugat in cosul de cumparaturi produsul: " + produs.numeProdus + " in cantitate de " + cantitateProdus + " buc.");
        return cosCumparaturi;
    }
    public void afisareCosCumparaturi() {

        System.out.println("In cosul de cumparaturi avem: ");
        for (String i : cosCumparaturi.keySet()) {
            System.out.println("   - produsul " + i + " in cantitatea de " + cosCumparaturi.get(i)+ " buc.");
        }
    }
}
