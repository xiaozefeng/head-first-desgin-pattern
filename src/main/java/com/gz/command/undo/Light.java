package com.gz.command.undo;

/**
 * @author xiaozefeng
 */
public class Light {

    String location;
    int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        System.out.println("Light is On");
    }

    public void off() {
        level = 0;
        System.out.println("Light is Off");
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            System.out.println("Light is dimmed to " + level + "%");
        }

    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Light{" +
                "location='" + location + '\'' +
                ", level=" + level +
                '}';
    }
}
