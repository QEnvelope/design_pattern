package pattern.factory.improve;

import pattern.factory.SimpleFactory.PizzaStore;
import pattern.factory.SimpleFactory.SimplePizzaFactory;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    protected  Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("ny");
        }
        return pizza;

    }
}
