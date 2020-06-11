package fabrykaabstrakcyjna;

public class OwoceMorzaPizza extends Pizza{

    private FabrykaSkładnikowPizzy fabrykaSkładnikowPizzy;

    public OwoceMorzaPizza(FabrykaSkładnikowPizzy fabrykaSkładnikowPizzy) {
        this.fabrykaSkładnikowPizzy = fabrykaSkładnikowPizzy;
    }

    void przygotowanie() {
        System.out.println("Przygotowanie: "+nazwa);
        ciasto = fabrykaSkładnikowPizzy.utworzCiasto();
        sos = fabrykaSkładnikowPizzy.utworzSos();
        ser = fabrykaSkładnikowPizzy.utworzSer();
        malze = fabrykaSkładnikowPizzy.utworzMalze();
    }
}
