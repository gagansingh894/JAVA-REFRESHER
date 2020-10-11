package com.company;

import java.util.Scanner;

class UserInput {

    void main() {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("User has entered: " + name);

    }
}
