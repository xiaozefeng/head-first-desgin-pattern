package com.gz.command.simple_remote;

/**
 * @author xiaozefeng
 */
public class SimpleRemoteController {
    Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void  buttonWasPressed(){
        slot.execute();
    }
}
