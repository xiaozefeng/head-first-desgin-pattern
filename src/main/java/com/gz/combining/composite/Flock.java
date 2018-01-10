package com.gz.combining.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaozefeng
 */
public class Flock implements Quackable{
    private List<Quackable> quackers = new ArrayList<>();

    @Override
    public void quack() {
        for (Quackable quackable : quackers) {
            quackable.quack();
        }

    }

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public String toString() {
        return "Flock of Quarckers";
    }
}
