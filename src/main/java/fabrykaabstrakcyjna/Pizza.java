package fabrykaabstrakcyjna;

public abstract class Pizza {
    String nazwa;
    Ciasto ciasto;
    Sos sos;
    Warzywo[] warzywa;
    Ser ser;
    Pepperoni pepperoni;
    Malze malze;

    abstract void przygotowanie();

    public void pieczenie(){
        System.out.println("Pieczenie: 30 minut w temperaturze 320 stopni");
    }

    public void krojenie(){
        System.out.println("Krojenie pizzy na 6 kawałków");
    }

    public void pakowanie() {
        System.out.println("Pakowanie pizzy w oficjalne pudełko naszej sieci Pizzerii.");
    }

    public void ustawNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String pobierzNazwa() {
        return nazwa;
    }
}
