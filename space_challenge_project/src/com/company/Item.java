package com.company;

public class Item {
    private String name;
    private int weight;

    Item(String name, int weight) {
        this.setName(name);
        this.setWeight(weight);
    }

    // Getters
    String getName() {
        return this.name;
    }

    int getWeight() {
        return this.weight;
    }

    // Setters
    void setName(String name) {
        this.name = name;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }
}