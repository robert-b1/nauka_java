package fabrykaabstrakcyjna;

public class AmerykanskaPizzeria extends Pizzeria {
    public Pizza utworzPizza(String type) {

        Pizza pizza = null;
        FabrykaSkładnikowPizzy fabrykaSkładnikowPizzy = new AmerykanskaFabrykaSkladnikowPizzy();

        if (type.equals("Amerikańska")){
            pizza = new SerowaPizza(fabrykaSkładnikowPizzy);
            pizza.ustawNazwa("Amerykańska pizza serowa");
        }

        return pizza;
    }
}
