package com.gz.adapter.ducks;

/**
 * @author xiaozefeng
 */
public class TurKeyAdapter implements Duck{
    TurKey turKey;

    public TurKeyAdapter(TurKey turKey) {
        this.turKey = turKey;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turKey.fly();
        }
    }

    @Override
    public void quack() {
        turKey.gobble();
    }
}
