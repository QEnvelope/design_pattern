package pattern.decorator;

/**
 * 装饰者模式
 * 咖啡的饮料类，所有咖啡都基于该饮料
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
