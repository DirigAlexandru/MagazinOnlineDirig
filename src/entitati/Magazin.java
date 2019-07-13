package entitati;

import marketplace.Marketplace;
import utils.Metode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Magazin extends Marketplace {

    String numeMagazin;
    String adresaMagazin;
    String adresaEmailMagazin;
    int numarTelefonMagazin;
    Map<String, String> orar = new LinkedHashMap<>();
    HashMap<String, String> orarMagazin; //LocalDateTime - to check if is open at  given time
    String contBancarMagazin;
    HashMap<String, Integer> stocMagazin; // if stocMagazin <50 suplimenteaza pana la o anumita valoare e.g. 100

    public void setNumeMagazin(String nume) { this.numeMagazin = nume; }
    public void setAdresaMagazin(String adresa) { this.adresaMagazin = adresa; }
    public void setAdresaEmailMagazin(String adresaEmail) { this.adresaEmailMagazin = adresaEmail;System.out.println("Adresa de e-mail a magazinului este: " + adresaEmailMagazin); }
    public void setNumarTelefonMagazin(int numarTelefon) { this.numarTelefonMagazin = numarTelefon; }
    public void setOrarMagazin(HashMap<String, String> orar) { this.orarMagazin = orar; }
    public void setContBancarMagazin(String cont) { this.contBancarMagazin = cont; }
    public void setStoc(HashMap<String, Integer> stoc) { this.stocMagazin = stoc; }

    /*public void adaugaStocMagazin(Produs produs, int cantitate) {
        stocMagazin = new HashMap<String, Integer>();
        stocMagazin.put(produs.numeProdus, cantitate);
        System.out.println("Am adaugat in stocul magazinului " + numeMagazin + " produsul de tip " + produs.numeProdus + " in cantitate de " + cantitate + " bucati");
    }*/
    public void adaugaStocMagazin(Produs produs, int cantitate) {

        stocMagazin.put(produs.numeProdus, cantitate);
        System.out.println("Am adaugat in stocul magazinului produsul de tip " + produs.numeProdus + " intr-o " + "cantitate de "
                + cantitate + " bucati!");
    }
    public void interogareStoc(Produs produs , String produsCautat , int cantitate) {

        if (new Produs().numeProdus == produsCautat) {
            if (new Produs().cantitateProdus >= cantitate) {
                System.out.println("Produsul " + new Produs().numeProdus + " are cantitatea de " + new Produs().cantitateProdus);
                //adaugaInCosulDeCumparaturi(produsCautat, cantitate);
            }
            else{
                System.out.println("Stoc insuficient");
            }
        }
        else
            {
                System.out.println("Nu exista produsul ");
        }
        //TO DO return adaugaInCosulDeCumparaturi
    }
    public void orarMagazin() {
        orar.put("Duminca   ", " Magazinul este inchis");
        orar.put("Luni      ", " 08:00 - 17:00");
        orar.put("Marti     ", " 08:00 - 17:00");
        orar.put("Miercuri  ", " 08:00 - 17:00");
        orar.put("Joi       ", " 08:00 - 17:00");
        orar.put("Vineri    ", " 08:00 - 17:00");
        orar.put("Sambata   ", " 10:00 - 15:00");
        for (String key : orar.keySet()){
            System.out.println(key + " " + orar.get(key));
        }

    }


}
