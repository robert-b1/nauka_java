package fabrykaabstrakcyjna;

public class AmerykanskaFabrykaSkladnikowPizzy implements FabrykaSkładnikowPizzy {
    public Ciasto utworzCiasto() {
        return new CienkieCiasto();
    }

    public Sos utworzSos() {
        return new SosMarinara();
    }

    public Ser utworzSer() {
        return new SerRegionalny();
    }

    public Warzywo[] utworzWarzywa() {
        Warzywo warzywa[] = {new Czosnek(), new Cebula(), new Pieczarki()};

        return warzywa;
    }

    public Pepperoni utworzPepperoni() {
        return new PlasryPepperoni();
    }

    public Malze utworzMalze() {
        return new SwierzeMalze();
    }
}
