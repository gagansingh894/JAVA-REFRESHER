package com.company;

import java.lang.Math;

public class U1 extends Rocket {

    int cost = 100000000;
    double randomNumber = Math.random();
    int rocketWeight = 9072;
    int cargoLimit = 16330;
    static int cargoCapacity = 7258; //this.cargoLimit - this.rocketWeight

    int getCost() {
        return this.cost;
    }

    @Override
    public boolean launch() {

        double chancesOfLaunchExplosion = 0.01 * (double)(cargoCapacity/this.cargoLimit);
        if (chancesOfLaunchExplosion < randomNumber) {
            return false;
        }
        return super.land();
    }


    @Override
    public boolean land() {

        double chancesOfLandingCrash = 0.05 * (double)(cargoCapacity/this.cargoLimit);
        if (chancesOfLandingCrash < randomNumber) {
            return false;
        }
        return super.land();
    }

}
