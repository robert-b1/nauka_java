package dekorator;

public class Bezkofeinowa extends Napoj{

    public Bezkofeinowa(){
        opis = "Bezkofeinowa";
    }

    @Override
    public float koszt() {
        return 5.80f;
    }
}
