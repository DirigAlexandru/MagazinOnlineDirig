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
        Cos NewCos = new Cos();
        NewStore.setNumeMagazin("Altex");
        NewProduct.setNumeProdus("Sony Bravia");
        NewStore.adaugaStocMagazin(NewProduct,30);
        Client Mircea = new Client();
        NewCos.adaugaInCosulDeCumparaturi(NewProduct, 2);
        NewProduct.setNumeProdus("iPhone XS");
        NewStore.adaugaStocMagazin(NewProduct,10); //comment this line to check the interogareStoc and updateStoc method
        NewCos.adaugaInCosulDeCumparaturi(NewProduct, 20);
        NewProduct.setNumeProdus("iPad Pro");
        NewStore.adaugaStocMagazin(NewProduct, 10);
        NewCos.adaugaInCosulDeCumparaturi(NewProduct, 1);
        NewCos.afisareCosCumparaturi();
        NewStore.interogareStoc(NewCos);
        //Mircea.cumparaCosCumparaturi();
        NewStore.updateStocMagazin(NewCos);
        //NewStore.afisareStocMagazin();
    }
}
