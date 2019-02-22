package pattern.strategy.step4;

public class WuQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("wu wu wu");
    }
}
