package com.gz.combining.factory;

/**
 * @author xiaozefeng
 */
public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.hook();
    }
}
