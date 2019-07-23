package entitati;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Produs {

    int cantitateProdus;
    double pretProdus;
    boolean discountProdus;
    double valoareDiscountProdus;
    String numeProdus;
    ArrayList<String> proprietatiProdus;
    String marcaProdus;
    String tipProdus;
    String categorieProdus;
    int garantieProdus;

    public void setCantitateProdus(int cantitate) {
        this.cantitateProdus = cantitate;
    }

    public void setPretProdus(double pret) {
        this.pretProdus = pret;
    }

    public void setDiscountProdus(boolean discount) {
        this.discountProdus = discount;
    }

    public void setValoareDiscountProdus(double valoareDiscount) {
        this.valoareDiscountProdus = valoareDiscount;
    }

    public void setNumeProdus(String nume) {
        this.numeProdus = nume;
    }

    public void setProprietatiProdus(ArrayList<String> proprietati) {
        this.proprietatiProdus = proprietati;
    }

    public void setMarcaProdus(String marca) {
        this.marcaProdus = marca;
    }

    public void setTipProdus(String tip) {
        this.tipProdus = tip;
    }

    public void setCategorieProdus(String categorie) {
        this.categorieProdus = categorie;
    }

    public void setGarantieProdus(int garantie) {
        this.garantieProdus = garantie;
    }

    public void adaugaCantitate(int cantitateNoua) {
        this.cantitateProdus = this.cantitateProdus + cantitateNoua;
    }

    public void calcularePretDupaDiscount(double pretTelefon, double valoareDiscountTelefon) {
        System.out.println("Pretul actual al telefonului este: " + pretTelefon + " iar discountul este " + valoareDiscountTelefon + " %");
        double pretFinal = pretTelefon - (pretTelefon * valoareDiscountTelefon / 100);
        System.out.println("Pretul telefonului dupa aplicarea discountului este de: " + pretFinal);
    }

    public void calcularePretDupaDiscount(double valoareDiscountTelefon) {
        System.out.println("Pretul actual al telefonului este: " + this.pretProdus + " iar discountul este " + valoareDiscountTelefon + " %");
        // this.pretProdus = this.pretProdus- (this.pretProdus*valoareDiscountTelefon/100);
        double pretFinal = this.pretProdus - (this.pretProdus * valoareDiscountTelefon / 100);
        System.out.println("Pretul telefonului dupa aplicarea discountului este de: " + pretFinal);
    }

    public void adaugaProprietatiProdus() {

        proprietatiProdus = new ArrayList<String>();
        proprietatiProdus.add("jack");
        proprietatiProdus.add("OLED");
        proprietatiProdus.add("ecran 5,5 inch");
        System.out.println("Produsul " + this.numeProdus + " are urmatoarele proprietati: " + proprietatiProdus);
    }
}

