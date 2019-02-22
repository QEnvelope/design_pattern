package pattern.factory.SimpleFactory;


import pattern.factory.bean.*;

/**
 * 简单工厂模式
 * 把具体实例化哪种对象从操作对象的主业务逻辑中独立出来并封装到factory类里面
 * 具体订购者不关心pizza的创建，具体实例化的过程从客户的代码中删除，这个factory类负责pizza的创建
 * 以后修改时只需修改这个类
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;

    }
}
