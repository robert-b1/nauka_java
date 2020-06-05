package adapter;

public class DzikaKaczka implements Kaczka {
    @Override
    public void kwacz() {
        System.out.println("kwa! Kwa!");
    }

    @Override
    public void lataj() {
        System.out.println("Latam");
    }
}
