package marketplace;

import utils.Metode;

import java.util.HashMap;

public class Marketplace extends Metode {

    String numeMarketplace;
    String adresaMarketplace;
    String adresaEmailMarketplace;
    int numarTelefonMarketplace;;
    HashMap<String, String> orarMarketplace;//LocalDateTime - to check if is open at  given time
    String contBancarMarketplace;

    public void setNumeMarketplace ( String nume) { this.numeMarketplace = nume;}
    public void setAdresaMarketplace ( String adresa) { this.adresaMarketplace = adresa; }
    public void setAdresaEmailMarketplace ( String adresaEmail) { this.adresaEmailMarketplace = adresaEmail; }
    public void setNumarTelefonMarketplace ( int numarTelefon) { this.numarTelefonMarketplace = numarTelefon; }
    public void setOrarMarketplace(HashMap<String, String> orar) {this.orarMarketplace = orar;}
    public void setContBancarMarketplace ( String cont ) { this.contBancarMarketplace = cont; }

}
