package com.gz.command.simple_remote;

/**
 * @author xiaozefeng
 */
public class GarageDoorCloseCommand implements Command{
    private Door door;
    public GarageDoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
