package command;

import command.commands.Command;
import command.commands.NoCommand;

/**
 * 这里模拟的是一个遥控器
 * <p>
 * (想象音量加减  频道加减)  (一行2个槽  一个开 一个关)  另外附带一个撤销键
 */
public class SimpleRemoteControl {
    private Command[] onCommands = new Command[10];
    private Command[] offCommands = new Command[10];
    // 这里是用来撤销的
    private Command undoCommand;

    SimpleRemoteControl() {
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
        }
        for (int i = 0; i < offCommands.length; i++) {
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    // 设置横向槽对应的命令
    void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // 按下开
    void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    // 按下关
    void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    // 按下撤销
    void undoButtonWasPressed() {
        undoCommand.undo();
    }
}