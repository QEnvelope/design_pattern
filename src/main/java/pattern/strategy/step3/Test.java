package pattern.strategy.step3;

public class Test {
    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.display();
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
    }
}
