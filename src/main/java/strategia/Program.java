package strategia;

import obserwator.DzikaKaczka;

public class Program {

    public static void main(String[] args) {

        // Kaczka dzikaKaczka = new DzikaKaczka();
        Kaczka dzikaKaczka = new DzikaKaczka(new LatamBoMamSkrzydla(), new Kwacz());
        dzikaKaczka.wykonajLec();
        dzikaKaczka.wykonajKwacz();
    }
}
