package pattern.command;

/**
 * 命令接口
 *
 * 执行命令和撤销命令
 * 在特定命令下，撤销命令只需和执行命令相反即可
 */
public interface Command {

    void execute();

    void undo(); //撤销命令
}
