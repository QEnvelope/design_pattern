package pattern.strategy.step2;

import pattern.strategy.step1.Duck;

/**
 * 但是橡皮鸭不会飞
 * 此步用了继承，将空方法的fly覆盖了父类fly
 */
public class RubberDuck extends Duck {
    public void fly(){
        System.out.println("i can't fly");
    }
}
