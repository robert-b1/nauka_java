package dekorator;

public class BitaSmietana extends SkladnikDekorator{

    private final Napoj napoj;

    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Bita śmietana";
    }

    @Override
    public float koszt() {
        return napoj.koszt() +2.20f;
    }
}
