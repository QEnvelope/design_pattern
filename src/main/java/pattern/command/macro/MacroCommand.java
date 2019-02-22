package pattern.command.macro;

import pattern.command.Command;

/**
 * 宏命令
 * 一个命令包含多个接收者的执行动作
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public void undo() {

    }
}
