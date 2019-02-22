package pattern.responsechain;

/**
 * 女人类
 * 三种状态
 *
 */
public class Women {

    private WomenState state;

    public Women(WomenState state) {
        this.state = state;
    }

    public WomenState getState() {
        return state;
    }

    public void setState(WomenState state) {
        this.state = state;
    }
}
