package pattern.responsechain;

public class Husband extends Handler {
    public void response(Women women) {
        if (WomenState.WIFE.equals(women.getState())) {
            System.out.println("老婆很棒！");
        }
    }
}
