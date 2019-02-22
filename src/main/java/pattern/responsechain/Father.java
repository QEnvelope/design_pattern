package pattern.responsechain;

public class Father extends Handler {

    public void response(Women women) {
        if (WomenState.DAUGHTER.equals(women.getState())) {
            System.out.println("女儿很棒！");
        }
    }
}
