package pattern.factory.SimpleFactory;

import pattern.factory.bean.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    //利用组合的方式引入不同的factory
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
