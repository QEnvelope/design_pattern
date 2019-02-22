package pattern.adapter.example;

/**
 * 适配器类
 * 将火鸡包装成鸭子
 * 实现要包装成的类的接口
 */
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    //传入被包装的对象
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //行为的包装
    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i=0;i<5;i++) {
            turkey.fly();
        }
    }
}
