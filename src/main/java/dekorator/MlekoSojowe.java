package dekorator;

public class MlekoSojowe extends SkladnikDekorator{

    private final Napoj napoj;

    public MlekoSojowe(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Mleko sojowe";
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 2.10f;
    }
}
