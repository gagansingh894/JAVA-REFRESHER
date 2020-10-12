package com.company;

public class U2 extends Rocket{

    public U2() {
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
        launchExplosion = 0.0;
        landingCrash = 0.0;

        currentWeight = weight;
    }

    @Override
    public boolean launch() {
        int randomNumber = (int) (Math.random() * 100 + 1);
        this.launchExplosion = 4.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.launchExplosion <= randomNumber;
    }

    @Override
    public boolean land() {
        int randomNumber = (int) (Math.random() * 100 + 1);
        this.landingCrash = 8.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.landingCrash <= randomNumber;
    }

}