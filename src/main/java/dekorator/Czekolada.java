package dekorator;

public class Czekolada extends SkladnikDekorator {

    private final Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }


    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Czekolada";
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 2.11f;
    }
}
