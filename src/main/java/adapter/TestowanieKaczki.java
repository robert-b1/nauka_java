package adapter;

public class TestowanieKaczki {

    public static void main(String[] args) {

        DzikaKaczka dzikaKaczka = new DzikaKaczka();
        DzikiIndyk dzikiIndyk = new DzikiIndyk();
        Kaczka indykAdapter = new IndykAdapter(dzikiIndyk);

        System.out.println("Indyk mówi:");
        dzikiIndyk.gulgocz();
        dzikiIndyk.lataj();

        System.out.println("Laczka mówi:");
        testujKaczke(dzikaKaczka);

        System.out.println("IndykAdapter mówi:");
        testujKaczke(indykAdapter);
    }

    private static void testujKaczke(Kaczka kaczka) {
        kaczka.kwacz();
        kaczka.lataj();
    }
}
