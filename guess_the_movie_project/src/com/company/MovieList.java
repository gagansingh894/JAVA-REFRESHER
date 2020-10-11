package com.company;

import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class MovieList {
    private final Scanner scanner;
    private final int randomNumber;

    MovieList(String path) throws Exception {
        File file = new File(path);
        this.scanner = new Scanner(file);
        this.randomNumber = (int) (Math.random() * 25) + 1;
    }

    String getMovieName() {
        for (int i = 0; i < this.randomNumber; i++) {
            this.scanner.nextLine();
            if (i == this.randomNumber-1){
                return this.scanner.nextLine();
            }
        }
        return null;
    }
}
