package pattern.singleton;

/**
 * 采用静态内部类的方式，当外部类被装载时，instance不一定被初始化，因为没有显示调用那个静态内部类
 * 达到了延迟加载instance的效果
 */
public class SingletonHolderTest {
    private static SingletonHolderTest instance = new SingletonHolderTest();

    private static class SingletonHolder{
        static int a = 5;
        static{
            System.out.println("静态内部类");
        }
    }


    private SingletonHolderTest(){
        dayin();
    }

    public static SingletonHolderTest getInstance(){
        return instance;
    }

    private static void dayin(){
        System.out.println("dayin");
    }
}

class test{
    public static void main(String[] args) {
        //SingletonHolderTest singletonHolderTest = new SingletonHolderTest();
        SingletonHolderTest.getInstance();
    }
}
