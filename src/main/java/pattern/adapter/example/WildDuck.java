package pattern.adapter.example;

/**
 * 野鸭子，继承鸭子类
 */
public class WildDuck implements Duck {

    public void quack() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("duck fly!");
    }
}
