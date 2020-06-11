package fabrykaabstrakcyjna;

public class WloskaFabrykaSkladnikowPizzy implements FabrykaSkładnikowPizzy{
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
        Warzywo warzywa[] ={new Czosnek(), new Cebula(), new Pieczarki(),
        new CzerwonaPapryka()};

        return warzywa;
    }

    public Pepperoni utworzPepperoni() {
        return new PlasryPepperoni();
    }

    public Malze utworzMalze() {
        return new SwierzeMalze();
    }
}
