package pattern.strategy.step1;

/**
 * 最初版本定义duck父类，多种duck子类
 * 但由于继承的特性，许多不应该存在相应行为的子类也必须继承相应行为
 */
public class Duck {
    void quack(){
        System.out.println("quack");
    }

    void swim(){
        System.out.println("swim");
    }

    void display(){
        System.out.println("Duck display");
    }

    public void fly(){
        System.out.println("i can fly");
    }
}
