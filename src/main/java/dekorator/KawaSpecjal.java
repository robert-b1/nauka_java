package dekorator;

import adapter.Kaczka;

public class KawaSpecjal extends Napoj{

    public KawaSpecjal(){
        opis = "Kawa specjalna";
    }

    @Override
    public float koszt() {
        return 10.00f;
    }
}
