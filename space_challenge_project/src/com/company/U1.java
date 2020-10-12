package com.company;

import java.lang.Math;

public class U1 extends Rocket {

    public U1() {
        cost = 100;
        weight = 1000;
        maxWeight = 1;
        launchExplosion = 0.0;
        landingCrash = 0.0;
        currentWeight = weight;
    }

    @Override
    public boolean launch() {
        int randomNumber = (int) (Math.random() * 100 + 1);
        this.launchExplosion = 5.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.launchExplosion <= randomNumber;
    }

    @Override
    public boolean land() {
        int randomNumber = (int) (Math.random() * 100 + 1);
        this.landingCrash = 1.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.landingCrash <= randomNumber;
    }
}