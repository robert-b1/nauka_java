package fabrykaabstrakcyjna;

public class SerowaPizza extends Pizza{

    private FabrykaSkładnikowPizzy fabrykaSkładnikowPizzy;

    public SerowaPizza(FabrykaSkładnikowPizzy fabrykaSkładnikowPizzy) {
        this.fabrykaSkładnikowPizzy = fabrykaSkładnikowPizzy;
    }

    /**
     * metoda realizuje kolejne etapy tworzenia pizzy
     * kiedy potrzebuje jakiegoś składnika, prosi o jego wykonanie fabrykę
     */
    void przygotowanie() {
        System.out.println("Przygotowanie: "+ pobierzNazwa());
        ciasto = fabrykaSkładnikowPizzy.utworzCiasto();
        sos = fabrykaSkładnikowPizzy.utworzSos();
        ser = fabrykaSkładnikowPizzy.utworzSer();
    }
}
