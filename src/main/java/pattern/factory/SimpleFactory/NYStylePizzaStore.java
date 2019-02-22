package pattern.factory.SimpleFactory;

import pattern.factory.bean.Pizza;

/**
 * 具体商店，决定如何制造披萨
 */
public class NYStylePizzaStore extends NewPizzaStore {
    //子商店自己决定用哪种工厂
    NYStylePizzaFactory factory;

    public NYStylePizzaStore(NYStylePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza createPizza(String type) {
        return factory.createPizza(type);
    }
}
