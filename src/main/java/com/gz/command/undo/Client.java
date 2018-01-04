package com.gz.command.undo;



/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOffCommand = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomOnCommand, livingRoomOffCommand);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }
}
