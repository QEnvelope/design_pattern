package pattern.command.singleslot;

import pattern.command.Command;

/**
 * 遥控器打开电灯指令
 * 命令本身，传入接收者，执行接受者的行为
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
