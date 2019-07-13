package executie;

import entitati.Client;
import entitati.Magazin;
import entitati.Produs;

import java.util.HashMap;

public class Executie {

    public static void main(String[] args) {

        HashMap<String, Integer> cosCumparaturi = new HashMap<>();

        Magazin Surubel = new Magazin();
        //Surubel.generateRandomStoreName();
        //Surubel.inputStore();
        /*Surubel.setNumeMagazin("Altex");
        Surubel.setAdresaEmailMagazin("contact@surubel.com");
        Surubel.setStoc(new HashMap<>());
        Surubel.orarMagazin();

        Produs telefon = new Produs();
        telefon.setNumeProdus("Televizor HD");
        telefon.setCantitateProdus(5);
        telefon.adaugaCantitate(10);
        telefon.afiseazaCantitate();
        Surubel.adaugaStocMagazin(telefon, 20);
        telefon.adaugaProprietatiProdus();
        telefon.suplimentareStoc("Alcatel", 100);
        //telefon.calcularePretDupaDiscount(1000,20);
        telefon.setPretProdus(1500);
        telefon.calcularePretDupaDiscount(20);*/

        Client mircea = new Client();
        //cosCumparaturi.put("Alcatel",1);
        //cosCumparaturi.put("iPhone",5);
        //mircea.afisareCosCumparaturi(cosCumparaturi);

        //mircea.setAdresaLivrareClientDefualt("Dancu");
        //mircea.livrareClient();
        mircea.setNumeClient ("Vasile");
        mircea.setPersoanaJuridica(true);
        mircea.setValoareDiscountPersoanaJuridica(5.5);
        //mircea.setPersoanaJuridicaCuDiscount(true, 25);
        mircea.adaugaInformatiiFirma(mircea);
    }
}
