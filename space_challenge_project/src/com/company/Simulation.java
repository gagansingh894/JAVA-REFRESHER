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
            Item item = new Item();
            item.name = line[0];
            item.weight = Integer.parseInt(line[1]);
            allItems.add(item);
        }
        return allItems;
    }

    ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> u1s = new ArrayList<>();
        for(Item item: items) {
            Rocket u1 = new U1();
            U1.cargoCapacity -= item.weight;
            if (U1.cargoCapacity < 0) {
                u1s.add(u1);
                U1.cargoCapacity = 7258;
            }
        }
        return  u1s;
    }

    ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> u2s = new ArrayList<>();
        for(Item item: items) {
            Rocket u2 = new U2();
            U2.cargoCapacity -= item.weight;
            if (U2.cargoCapacity < 0) {
                u2s.add(u2);
                U2.cargoCapacity = 9978;
            }
        }
        return  u2s;
    }

    int runSimulation(ArrayList<Rocket> rockets) {
        int totalCost = 0;

        while (!rockets.isEmpty()) {
            Rocket rocket = rockets.get(0);
            if (rocket.launch() && rocket.land()) {
                totalCost += rocket.getCost();
                rockets.remove(0);
            } else { totalCost += rocket.getCost(); }
        }
        return totalCost;
    }
}
