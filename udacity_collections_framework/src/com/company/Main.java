package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

    // Array Example
        int[] myArray = new int[100];
        myArray[0] = 100;
        myArray[1] = 100;
        System.out.println(myArray[3]);
        System.out.println(myArray[0] + myArray[1]);

	// ArrayList Example
        ArrayList<Integer> grades = new ArrayList<>();
    // Add example
        grades.add(100);
        grades.add(97);
        grades.add(80);
    //  General operation example
        System.out.println(grades.get(0)); // Get element at index
        System.out.println(grades.size()); // Get size of list
        grades.remove(0); // Remove element at index 0
        grades.clear(); // Clear all elements

    // Loops & Collections Code
        grades.add(50);
        grades.add(78);
        grades.add(90);
        for (int i : grades) {
            System.out.println(i);
        }

    }
}
