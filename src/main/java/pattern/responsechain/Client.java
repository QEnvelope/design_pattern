package pattern.responsechain;

import java.util.ArrayList;
import java.util.List;

/**
 * 场景类，使用责任链模式
 */
public class Client {
    public static void main(String[] args) {
        Women mother = new Women(WomenState.MOTHER);
        List<Handler> pipline = new ArrayList<Handler>();
        pipline.add(new Father());
        pipline.add(new Husband());
        pipline.add(new Son());
        for (Handler person : pipline) {
            person.response(mother);
        }
    }
}
