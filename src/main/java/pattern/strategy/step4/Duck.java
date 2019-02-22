package pattern.strategy.step4;

/**
 * step3中利用接口的话，不能够很好地利用继承代码重用的优势，要重复写很多代码
 * 因此把会变的行为和不变的类分开，独立出行为接口
 */
public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("duck swim");
    }

    public void display(){
        System.out.println("duck display");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

}
