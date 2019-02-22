package pattern.strategy.step3;

public class RedHeadDuck extends Duck implements Flyable,Quackable {

    public void fly() {
        System.out.println("i can fly");
    }


    public void quack() {
        System.out.println("redhead duck");
    }
}
