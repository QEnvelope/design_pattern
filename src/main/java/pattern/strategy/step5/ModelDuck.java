package pattern.strategy.step5;

import pattern.strategy.step4.FlyNoWay;
import pattern.strategy.step4.WuQuack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new WuQuack();
    }

    public void display(){
        System.out.println("model duck");
    }
}
