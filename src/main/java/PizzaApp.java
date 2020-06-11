import matodafabrykujaca.AmerykanskaPizzeria;
import matodafabrykujaca.Pizza;
import matodafabrykujaca.Pizzeria;
import matodafabrykujaca.WloskaPizzeria;

public class PizzaApp {

    public static void main(String[] args) {

        Pizzeria wloskaPizzeria = new WloskaPizzeria();
        Pizza wloskaPizzaSerowa = wloskaPizzeria.zamowPizza("serowa");
        System.out.println("Zamówiono: " + wloskaPizzaSerowa.pobierzNazwa() + "\n");

        Pizzeria amerykanskaPizzeria = new AmerykanskaPizzeria();
        Pizza amerykanskaPizzaSerowa = amerykanskaPizzeria.zamowPizza("serowa");
        System.out.println("Zamówiono: " + amerykanskaPizzaSerowa.pobierzNazwa() + "\n");
    }
}
