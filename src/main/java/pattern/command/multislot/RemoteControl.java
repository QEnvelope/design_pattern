package pattern.command.multislot;

import pattern.command.Command;

/**
 * 多个槽位的调用者
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offComand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offComand;
    }

    public void onButtonWasButtoned(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasButtoned(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("");
        }
        return stringBuffer.toString();
    }

}
