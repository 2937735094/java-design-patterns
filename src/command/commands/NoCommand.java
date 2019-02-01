package command.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        // 什么也不做
    }

    @Override
    public void undo() {
        // 什么也不做
    }
}
