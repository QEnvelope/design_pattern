package pattern.decorator;

/**
 * coffee底类
 */
class DarkRoast extends Beverage{

    @Override
    public double cost() {
        return 0.9;
    }
}

class Decaf extends Beverage{

    @Override
    public double cost() {
        return 0.85;
    }
}