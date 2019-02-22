package pattern.singleton;
/*
* 单例模式demo，验证实例化只能通过instance，而且只有一个实例
* */
public class SingleTest {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        //显示消息
        object.showMessage();
        object2.showMessage();

        System.out.println(object==object2);

        System.out.println(object.getClass());
        System.out.println(object2.getClass());

        SimpleObject simpleObject = new SimpleObject();
        SimpleObject simpleObject2 = new SimpleObject();

        simpleObject.showMessage();
        simpleObject2.showMessage();

        System.out.println(simpleObject==simpleObject2);

        System.out.println(simpleObject.getClass());
        System.out.println(simpleObject2.getClass());
    }
}
