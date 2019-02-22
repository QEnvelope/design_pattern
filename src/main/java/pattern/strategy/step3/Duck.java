package pattern.strategy.step3;

/**
 * 利用继承重写方法实现鸭子特定的飞行行为很死板
 * 因为会出现新的鸭子种类和新的行为
 * 这样做法不能穷尽
 * 改为把行为涉及成接口
 */
public class Duck {

    void swim(){
        System.out.println("swim");
    }

    void display(){
        System.out.println("Duck display");
    }

}

