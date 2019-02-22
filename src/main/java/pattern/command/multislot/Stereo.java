package pattern.command.multislot;

public class Stereo {

    private String info;

    public Stereo(String info) {
        this.info = info;
    }

    public void on() {
        System.out.println("light on");
    }

    public void off() {
        System.out.println("light off");
    }

    @Override
    public String toString() {
        return "Stereo{" +
                "info='" + info + '\'' +
                '}';
    }
}
