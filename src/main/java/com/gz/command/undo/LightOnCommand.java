package com.gz.command.undo;

/**
 * @author xiaozefeng
 */
public class LightOnCommand implements Command{
    Light light;
    /**
     * 记录上次的level
     */
    int level;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
