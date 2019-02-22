package pattern.command.singleslot;

import pattern.command.Command;

public class GarageDoorCloseCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        System.out.println("garage door close");
    }

    public void undo() {

    }
}
