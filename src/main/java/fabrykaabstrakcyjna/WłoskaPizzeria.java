package fabrykaabstrakcyjna;

public class WłoskaPizzeria extends Pizzeria{
    public Pizza utworzPizza(String type) {
        Pizza pizza = null;
        FabrykaSkładnikowPizzy fabrykaSkładnikowPizzy = new WloskaFabrykaSkladnikowPizzy();

        if (type.equals("serowa")){
            pizza = new SerowaPizza(fabrykaSkładnikowPizzy);
            pizza.ustawNazwa("Włoska pizza serowa");
        }

        return pizza;
    }
}
