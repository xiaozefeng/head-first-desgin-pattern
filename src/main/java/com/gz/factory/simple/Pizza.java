package com.gz.factory.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaozefeng
 */
public abstract class Pizza {

    /**
     * 名称
     */
    String name;

    /**
     * 面团
     */
    String dough;

    /**
     * 浇头
     */
    String sauce;

    /**
     *
     */
    List<String> toppings = new ArrayList<>();


    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\n' +
                ", dough='" + dough + '\n' +
                ", sauce='" + sauce + '\n' +
                ", toppings=" + toppings +
                '}';
    }
}
