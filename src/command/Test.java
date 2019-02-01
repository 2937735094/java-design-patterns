package command;

import command.commands.LightOffCommand;
import command.commands.LightOnCommand;

public class Test {
    public static void main(String[] args) {
        Light light = new Light();

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));

        simpleRemoteControl.onButtonWasPressed(0);
        light.getState();
        simpleRemoteControl.offButtonWasPressed(0);
        light.getState();
        simpleRemoteControl.undoButtonWasPressed();
        light.getState();

//        new LightOffCommand(light).execute();
    }
}
