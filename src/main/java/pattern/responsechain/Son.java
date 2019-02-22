package pattern.responsechain;

public class Son extends Handler {
    public void response(Women women) {
        if (WomenState.MOTHER.equals(women.getState())) {
            System.out.println("妈妈很棒!");
        }
    }
}
