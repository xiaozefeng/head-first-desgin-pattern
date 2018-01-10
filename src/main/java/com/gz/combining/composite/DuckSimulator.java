package com.gz.combining.composite;

/**
 * @author xiaozefeng
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory factory = new CountingDuckFactory();

        simulator.simulate(factory);
    }

    private void simulate(AbstractDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);

        System.out.println("\nDuck Simulator");

        simulate(flock);

        // the goose is not one times
        System.out.println("The ducks quacked " +
                QuackCounter.getNumberofQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

}
