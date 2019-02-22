package pattern.factory.improve;


import pattern.factory.improve.ingredient.*;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /**
     * 其他方法不需要改变，只有准备方法因为原料的不同需要改变
     * pizza类本身并不关心原料，靠实现类添加
     */
    abstract void prepare();

    public void bake() {

    }

    public void cut() {

    }

    public void box() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
