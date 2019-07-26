package entitati;

import marketplace.Marketplace;
import utils.Metode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Magazin extends Cos {

    String numeMagazin;
    String adresaMagazin;
    String adresaEmailMagazin;
    int numarTelefonMagazin;
    Map<String, String> orar = new LinkedHashMap<>();
    HashMap<String, String> orarMagazin; //LocalDateTime - to check if is open at  given time
    String contBancarMagazin;
    HashMap<String, Integer> stocMagazin = new HashMap<>(); // if stocMagazin <50 suplimenteaza pana la o anumita valoare e.g. 100

    public void setNumeMagazin(String nume) {
        this.numeMagazin = nume;
    }

    public void setAdresaMagazin(String adresa) {
        this.adresaMagazin = adresa;
    }

    public void setAdresaEmailMagazin(String adresaEmail) {
        this.adresaEmailMagazin = adresaEmail;
        System.out.println("Adresa de e-mail a magazinului este: " + adresaEmailMagazin);
    }

    public void setNumarTelefonMagazin(int numarTelefon) {
        this.numarTelefonMagazin = numarTelefon;
    }

    public void setOrarMagazin(HashMap<String, String> orar) {
        this.orarMagazin = orar;
    }

    public void setContBancarMagazin(String cont) {
        this.contBancarMagazin = cont;
    }

    public void setStoc(HashMap<String, Integer> stoc) {
        this.stocMagazin = stoc;
    }

    public void afisareStocMagazin() {

        System.out.println("In stocul magazinului avem: ");
        for (String i : stocMagazin.keySet()) {
            System.out.println("   - produsul " + i + " in cantitatea de " + stocMagazin.get(i) + " buc.");
        }
    }

    public void adaugaStocMagazin(Produs produs, int cantitate) {

        stocMagazin.put(produs.numeProdus, cantitate);
        System.out.println("Am adaugat in stocul magazinului " + this.numeMagazin + " produsul " + produs.numeProdus + " in cantitate de " + cantitate + " bucati");
    }

    public void interogareStoc(Cos cosulet) {

        System.out.println("Interogare stoc: ");

        if ((cosulet).cosCumparaturi.keySet().equals(stocMagazin.keySet())) {
            for (String i : (cosulet).cosCumparaturi.keySet()) {
                for (String j : stocMagazin.keySet()) {
                    if ((cosulet).cosCumparaturi.get(i) <= stocMagazin.get(j)) {
                        System.out.println("   - produsul " + i + " este pe stoc in cantitatea dorita de client!");
                        break;
                    } else {
                        System.out.println("   - produsul " + i + " NU este pe stoc! Cantitate comandata: "+ (cosulet).cosCumparaturi.get(i) + " Cantitate stoc: "+ stocMagazin.get(j));
                        break;
                    }
                }
            }
        }
    }

    public void updateStocMagazin(Cos cosulet) {

        System.out.println("Update stoc: ");
        if ((cosulet).cosCumparaturi.keySet().equals(stocMagazin.keySet())) {
            for (String i : (cosulet).cosCumparaturi.keySet()) {
                for (String j : stocMagazin.keySet()) {
                    stocMagazin.put(j, stocMagazin.get(j) - (cosulet).cosCumparaturi.get(i));
                    System.out.println("    Am actualizat stocul produsului " + j + " la valoarea de " + stocMagazin.get(j));
                }
            }
        } else {
            System.out.println("    Produsul  NU mai este pe stoc!");
        }
    }


    public void orarMagazin() {
        orar.put("Duminca   ", " Magazinul este inchis");
        orar.put("Luni      ", " 08:00 - 17:00");
        orar.put("Marti     ", " 08:00 - 17:00");
        orar.put("Miercuri  ", " 08:00 - 17:00");
        orar.put("Joi       ", " 08:00 - 17:00");
        orar.put("Vineri    ", " 08:00 - 17:00");
        orar.put("Sambata   ", " 10:00 - 15:00");
        for (String key : orar.keySet()) {
            System.out.println(key + " " + orar.get(key));
        }
    }
}


