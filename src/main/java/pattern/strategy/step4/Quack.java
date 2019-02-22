package pattern.strategy.step4;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("duck quack");
    }
}