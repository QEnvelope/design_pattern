package pattern.strategy.step3;

public class RubberDuck extends Duck implements Quackable{
    void display(){
        System.out.println("rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("rubber quack");
    }
}
