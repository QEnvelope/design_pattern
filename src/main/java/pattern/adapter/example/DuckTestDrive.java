package pattern.adapter.example;

/**
 * 测试适配器类
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new WildDuck();
        Turkey turkey = new WildTurkey();
        TurkeyAdapter adapter = new TurkeyAdapter(turkey);

        System.out.println("Duck:");
        testDuck(duck);

        System.out.println("\nTurkey:");
        testTurkey(turkey);

        System.out.println("\nAdapter:");
        adapter.quack();
        adapter.fly();
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
