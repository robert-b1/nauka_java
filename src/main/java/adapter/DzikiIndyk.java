package adapter;

public class DzikiIndyk implements  Indyk{
    @Override
    public void gulgocz() {
        System.out.println("Gulgulgul");
    }

    @Override
    public void lataj() {
        System.out.println("Latam!... ale tylko na krótkich dystansach");
    }
}
