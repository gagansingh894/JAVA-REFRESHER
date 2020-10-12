package com.company;

public class Rocket implements SpaceShip{

    int getCost() {
        return 0;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return false;
    }

    @Override
    public void carry(Item item) {

    }
}
