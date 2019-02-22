package pattern.command.singleslot;

import pattern.command.Command;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("light off");
    }

    public void undo() {

    }
}
