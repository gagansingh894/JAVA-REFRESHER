package com.company;

public class U2 extends Rocket{

    int cost = 120000000;
    double randomNumber = Math.random();
    int rocketWeight = 16330;
    int cargoLimit = 26308;
    static int cargoCapacity = 9978; //this.cargoLimit - this.rocketWeight;

    int getCost() {
        return this.cost;
    }

    @Override
    public boolean launch() {

        double chancesOfLaunchExplosion = 0.04 * (double)(cargoCapacity/this.cargoLimit);
        if ( chancesOfLaunchExplosion < randomNumber) {
            return false;
        }
        return super.land();
    }

    @Override
    public boolean land() {

        double chancesOfLandingCrash = 0.08 * (double)(cargoCapacity/this.cargoLimit);
        if (chancesOfLandingCrash < randomNumber) {
            return false;
        }
        return super.land();
    }
}