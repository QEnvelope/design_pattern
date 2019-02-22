package pattern.command.singleslot;

import pattern.command.Command;

/**
 * 遥控器类
 * 调用者invoker
 */
public class SimpleRemoteControl {
    //按钮插槽
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
