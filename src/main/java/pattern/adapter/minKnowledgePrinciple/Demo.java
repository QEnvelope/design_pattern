package pattern.adapter.minKnowledgePrinciple;

/**
 * 应用最少知识原则
 * 说明
 */
public class Demo {


    /**
     * 从气象站取得温度计，然后在从温度计取得温度
     * @return
     */
    /*public float getTemp() {
        Thermometer thermometer = station.getThermometer();
        return thermometer.getTemperature();
    }*/

    /**
     * 在气象站中加入一个方法，用来向温度计请求温度，可以减少依赖的类的数目
     * @return
     */
    /*public float getTemp() {
        return station.getTemperature();
    }*/
}
