package com.gz.command.undo;

/**
 * @author xiaozefeng
 */
public class LightOffCommand implements Command{
    Light light;
    /**
     * 记录上次的level
     */
    int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
