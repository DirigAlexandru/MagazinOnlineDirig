package executie;

import entitati.Client;
import entitati.Magazin;
import entitati.Produs;

import java.util.HashMap;

public class Executie {

    public static void main(String[] args) {

        //HashMap<String,Integer> cc =new HashMap<>();

        Produs NewProduct = new Produs();
        Magazin NewStore =new Magazin();
        NewStore.setNumeMagazin("Altex");
        NewProduct.setNumeProdus("Sony Bravia");
        NewStore.adaugaStocMagazin(NewProduct,30);
        Client Mircea = new Client();
        Mircea.adaugaInCosulDeCumparaturi("Sony Bravia", 15);
        //Mircea.cumpara();
        NewStore.interogareStoc();
    }
}
