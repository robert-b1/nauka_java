package dekorator;

public class Mleko extends SkladnikDekorator{

    private final Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Mleko";
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 1.50f;
    }
}
