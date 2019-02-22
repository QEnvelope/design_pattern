package pattern.strategy.step4;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithSwings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("mallard duck");
    }

}
