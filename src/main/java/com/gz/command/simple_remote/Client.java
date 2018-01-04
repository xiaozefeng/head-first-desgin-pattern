package com.gz.command.simple_remote;


/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) {
        SimpleRemoteController controller = new SimpleRemoteController();
        Light light = new Light();
        controller.setSlot(new LightOnCommand(light));
        controller.buttonWasPressed();
        controller.setSlot(new LightOffCommand(light));
        controller.buttonWasPressed();

        Door door = new Door();
        controller.setSlot(new GarageDoorOpenCommand(door));
        controller.buttonWasPressed();
        controller.setSlot(new GarageDoorCloseCommand(door));
        controller.buttonWasPressed();

    }
}
