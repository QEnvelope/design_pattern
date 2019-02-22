package pattern.command.macro;

import pattern.command.Command;
import pattern.command.multislot.RemoteControl;
import pattern.command.multislot.Stereo;
import pattern.command.singleslot.*;

/**
 * 宏命令client
 */
public class MacroCommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        Command[] onCommands = {lightOnCommand, garageDoorOpenCommand};
        Command[] offCommands = {lightOffCommand, garageDoorCloseCommand};

        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        MacroCommand offMacroCommand = new MacroCommand(offCommands);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, onMacroCommand, offMacroCommand);
        remoteControl.onButtonWasButtoned(0);
    }
}
