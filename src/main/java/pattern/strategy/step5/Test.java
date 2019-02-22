package pattern.strategy.step5;

import pattern.strategy.step4.FlyWithSwings;
import pattern.strategy.step4.Quack;

public class Test {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyWithSwings());
        duck.setQuackBehavior(new Quack());
        duck.performFly();
        duck.performQuack();
    }
}
