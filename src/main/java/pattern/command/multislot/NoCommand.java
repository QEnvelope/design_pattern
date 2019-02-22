package pattern.command.multislot;

import pattern.command.Command;

public class NoCommand implements Command {


    public void execute() {
        System.out.println("no command state");
    }

    public void undo() {

    }
}
