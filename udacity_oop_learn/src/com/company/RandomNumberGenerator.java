package com.company;

import java.util.Scanner;

class RandomNumberGenerator {

    void main() {

        int numberOfChances = 10;
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);

        while (numberOfChances != 0) {
            System.out.println("Number of chances left: " + numberOfChances);
            System.out.println("Please enter a number between 1 to 100");
            int userInput = Integer.parseInt(scanner.nextLine());
            if (userInput > randomNumber) {
                System.out.println("The correct number is less than the random number");
            } else if (userInput < randomNumber) {
                System.out.println("The correct number is greater than the random number");
            } else {
                System.out.println("You Won! You have guessed the correct number");
                break;
            }
            numberOfChances--;
            if (numberOfChances == 0) {
                System.out.println("You ran out of chances");
            }
        }

    }
}
