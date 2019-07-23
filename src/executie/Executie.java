package executie;

import entitati.Client;
import entitati.Cos;
import entitati.Magazin;
import entitati.Produs;

import java.util.HashMap;

public class Executie {

    public static void main(String[] args) {

        Produs NewProduct = new Produs();
        Magazin NewStore =new Magazin();
        NewStore.setNumeMagazin("Altex");
        NewProduct.setNumeProdus("Sony Bravia");
        NewStore.adaugaStocMagazin(NewProduct,30);
        //NewProduct.setNumeProdus("iPhone XS");
        Client Mircea = new Client();
        Cos NewCos = new Cos();
        NewCos.adaugaInCosulDeCumparaturi(NewProduct, 14);
        NewCos.afisareCosCumparaturi();

    }
}
