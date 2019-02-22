package pattern.strategy.step5;

import pattern.strategy.step4.FlyBehavior;
import pattern.strategy.step4.QuackBehavior;

/**
 * 设计模式提倡面向接口编程，而step4中鸭子类的构造函数实例化了行为
 * 本步中动态设定行为，利用set方法
 *
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

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
