package com.gz.command.undo;

/**
 * @author xiaozefeng
 */
public interface Command {
    void execute();

    void undo();
}
