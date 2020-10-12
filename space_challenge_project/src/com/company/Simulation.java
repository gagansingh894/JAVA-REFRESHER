package com.company;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Simulation {


    ArrayList<Item> loadItems(String path) throws Exception{

        File file = new File(path);
        Scanner scanner = new Scanner(file);
        ArrayList<Item> allItems = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("=");
            Item item = new Item(line[0], Integer.parseInt(line[1]));
            allItems.add(item);
        }
        return allItems;
    }

    ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> u1s = new ArrayList<>();
        Rocket r = new U1();
        int itemCounter = 1;
        int rocketCounter = 1;

        for (Item item: items) {

            while (!r.canCarry(item)) {
                rocketCounter ++;
                u1s.add(r);
                r = new U1();
            }
            r.carry(item);
            itemCounter++;
        }
        u1s.add(r);
        return  u1s;
    }

    ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> u2s = new ArrayList<>();
        Rocket r = new U2();
        int itemCounter = 1;
        int rocketCounter = 1;

        for (Item item: items) {

            while (!r.canCarry(item)) {
                rocketCounter ++;
                u2s.add(r);
                r = new U2();
            }
            r.carry(item);
            itemCounter++;
        }
        u2s.add(r);
        return  u2s;    }

    int runSimulation(ArrayList<Rocket> rockets) {
        int numOfFailedAttempts = 0;
        int indexSuccess = 1;

        for (Rocket r: rockets) {

            while(!r.launch()) {
                r.launch();
                numOfFailedAttempts ++;
            }

            while(!r.land()) {
                r.land();
                numOfFailedAttempts ++;
            }

            indexSuccess++;
        }
        return rockets.get(0).cost * (rockets.size() + numOfFailedAttempts);
    }
}