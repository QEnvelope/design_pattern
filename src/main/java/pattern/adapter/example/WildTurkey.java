package pattern.adapter.example;

/**
 * 野火鸡
 */
public class WildTurkey implements Turkey{

    public void gobble() {
        System.out.println("gobble");
    }

    public void fly() {
        System.out.println("turkey fly");
    }
}
