package dekorator;

public class Main {

    public static void main(String[] args) {
        Napoj mocnoPalona = new MocnoPalona();
        System.out.println(mocnoPalona.opis+" "+mocnoPalona.koszt());

        mocnoPalona = new Mleko(mocnoPalona);
        System.out.println(mocnoPalona.opis+" "+mocnoPalona.koszt()+" +mleko");
    }
}
