package pattern.strategy.step1;

public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.fly();
    }
}
