package com.gz.command.simple_remote;

/**
 * @author xiaozefeng
 */
public class GarageDoorOpenCommand implements Command{
    private Door door;
    public GarageDoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
