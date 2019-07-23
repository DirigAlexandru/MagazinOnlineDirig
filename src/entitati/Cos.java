package entitati;

import java.util.HashMap;
import java.util.Map;

public class Cos extends Produs {
    HashMap<String, Integer> cosCumparaturi = new HashMap<>();

    public void adaugaInCosulDeCumparaturi(Produs produs, int cantitateProdus) {

        cosCumparaturi.put(produs.numeProdus, cantitateProdus);
        System.out.println(" Am adaugat in cosul de cumparaturi produsul: " + produs.numeProdus + " in cantitate de " + cantitateProdus + " buc.");

    }
    public void afisareCosCumparaturi() {

        for (Map.Entry i : cosCumparaturi.entrySet()) {
            System.out.println("In cosul de cumparaturi avem produsul " + i.getKey() + " in cantitatea de " + i.getValue());
        }
    }
}