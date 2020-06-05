package dekorator;

public class Espresso extends Napoj{

    public Espresso(){
        opis = "Espresso";
    }

    @Override
    public float koszt() {
        return 5.35f;
    }
}
