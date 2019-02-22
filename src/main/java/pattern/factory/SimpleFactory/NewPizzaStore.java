package pattern.factory.SimpleFactory;

import pattern.factory.bean.Pizza;

/**
 * 改进的pizzaStore类
 * 让pizzaStore子类自己决定如何制造pizza
 */
public abstract class NewPizzaStore {

    /**
     * 强制处理订单子类相同
     * @param type
     * @return
     */
    public final Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 让不同的store自己决定如何制造pizza
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
