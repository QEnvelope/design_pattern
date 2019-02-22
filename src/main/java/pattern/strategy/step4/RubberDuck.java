package pattern.strategy.step4;

public class RubberDuck extends Duck {

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new WuQuack();
    }

    public void display(){
        System.out.println("rubber duck");
    }

}
