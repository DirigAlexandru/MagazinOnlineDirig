package entitati;

import java.util.*;


public class Client extends Magazin {

    String adresaEmailClient;
    String numeClient;
    String prenumeClient;
    String parolaClient; // scanner input, if parola = ok mergi mai departe else erroare
    int numareTelefonMobilClient;
    String adresaFacturareClientDefault, adresaLivrareClientDefault;
    int ziNastereClient, lunaNastereClient, anNastereClient;
    String nivelEducatieClient;
    String numeFrimaClient, JClient, CUICLient;

    String cardCumparaturi;
    boolean eligibilDiscount;
    double valoareDiscount;
    double valoareDiscountPersoanaJuridica;
    ArrayList<String> carduriCadou;

    boolean persoanaJuridica;

    public void setAdresaLivrareClientDefualt(String adresa) {
        this.adresaLivrareClientDefault = adresa;
    }

    public void setNumeClient(String nume) {
        this.numeClient = nume;
    }

    public void setValoareDiscountPersoanaJuridica(Double discount) {
        this.valoareDiscountPersoanaJuridica = discount;
    }


    public void setAdresaFacturareClientDefault(String adresa) {
        this.adresaFacturareClientDefault = adresa;
    }

    public void setPersoanaJuridica(boolean valoare) {
        this.persoanaJuridica = valoare;
        setValoareDiscountPersoanaJuridica(19.19);
    }
    public void setPersoanaJuridicaCuDiscount(boolean valoare, double  discount) {
        this.persoanaJuridica = valoare;
        setValoareDiscountPersoanaJuridica(discount);
    }

    public void setareDiscountPersoanaJuridica (double discount){
        setPersoanaJuridica(true);
        System.out.println("Discountul general este de: " + discount);
    }

    /*public void cumparaCosCumparaturi (HashMap<String, Integer> cosCumparaturi) {
        if (interogareStoc()) {
            for (HashMap.Entry i : cosCumparaturi.entrySet()) {
                System.out.println("Clientul va cumpara" + i.getKey() + " / " + i.getValue() + " buc.");
            }
        }
    }*/

    /*public void livrareClient() {
        System.out.println("Adresa de livrare a produsului este " + this.adresaLivrareClientDefault);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Sunteti de acord cu adresa existenta ? (DA/NU) ");
        String raspuns = keyboard.nextLine();
        switch (raspuns) {
            case "DA":
                System.out.println("Vreti ca adresa de livrare sa fie aceeasi cu adresa de facturare ? (DA/NU) ");
                String raspuns2 = keyboard.nextLine();
                switch (raspuns2) {
                    case "DA":
                        System.out.println("Comanda se va livra si factura la adresa: " + this.adresaLivrareClientDefault);
                        break;
                    case "NU":
                        System.out.println("Introduceti o alta adresa de facturare: ");
                        String adresaFacturareNoua = keyboard.nextLine();
                        System.out.println("Comanda se va livra la adresa: " + this.adresaLivrareClientDefault + " ,iar adresa de facturare este: " + adresaFacturareNoua);
                        break;
                    default:
                        System.out.println("Optiune inexistenta");
                        break;
                }
                break;
            case "NU":
                System.out.println("Introduceti o alta adresa de livrare: ");
                String adresaLivrareNoua = keyboard.nextLine();
                System.out.println("Vreti ca adresa de livrare sa fie aceeasi cu adresa de facturare ? (DA/NU) ");
                String raspuns3 = keyboard.nextLine();
                switch (raspuns3) {
                    case "DA":
                        System.out.println("Comanda se va livra si factura la adresa: " + adresaLivrareNoua);
                        break;
                    case "NU":
                        System.out.println("Introduceti o alta adresa de facturare: ");
                        String adresaFacturareNoua = keyboard.nextLine();
                        System.out.println("Comanda se va livra la adresa: " + adresaLivrareNoua + " ,iar adresa de facturare este: " + adresaFacturareNoua);
                        break;
                    default:
                        System.out.println("Optiune inexistenta!");
                        break;
                }
                break;
            default:
                System.out.println("Raspunsul nu este valid! ");
                break;
        }

    }

    /*public void adaugaInformatiiFirma(Client client) {
        Scanner keyboard = new Scanner(System.in);

        if (persoanaJuridica) {
            HashMap<String, String> informatiiFirma = new LinkedHashMap<>();
            System.out.println("Introduceti CUI client: ");
            this.CUICLient = keyboard.nextLine();
            informatiiFirma.put("CUI", this.CUICLient);
            System.out.println("Introduceti J client: ");
            this.JClient = keyboard.nextLine();
            informatiiFirma.put("J", this.JClient);
            System.out.println("Introduceti nume firma : ");
            this.numeFrimaClient = keyboard.nextLine();
            informatiiFirma.put("Nume Firma", this.numeFrimaClient);
            System.out.println("Introduceti Adresa Livrare: ");
            this.adresaLivrareClientDefault = keyboard.nextLine();
            informatiiFirma.put("Adresa Livrare", this.adresaLivrareClientDefault);
            System.out.println("Introduceti Adresa Facturare: ");
            this.adresaFacturareClientDefault = keyboard.nextLine();
            informatiiFirma.put("Adresa Facturare", this.adresaFacturareClientDefault);

            for (Map.Entry i : informatiiFirma.entrySet()) {
                System.out.println("clientul " + client.numeClient + " are urmatoarele informatii " + i.getKey() + " " + i.getValue());
            }
        } else {
            System.out.println("Clientul nu este persoana juridica");
        }
        System.out.println("Clientul " + client.numeClient + " are un discount de " + this.valoareDiscountPersoanaJuridica);
    }*/

}

