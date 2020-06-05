package dekorator;

public class MocnoPalona extends Napoj{

    public MocnoPalona(){
        opis = "Kawa mocno palona";
    }

    @Override
    public float koszt() {
        return 6.10f;
    }
}
