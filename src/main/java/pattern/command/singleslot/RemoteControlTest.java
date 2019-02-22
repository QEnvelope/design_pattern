package pattern.command.singleslot;

/**
 * 命令模式程序主入口，即客户，负责发起请求
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(new LightOnCommand(new Light()));
        remote.buttonWasPressed();

        remote.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
        remote.buttonWasPressed();
    }
}
