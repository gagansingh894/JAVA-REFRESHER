package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class WordCount {

    WordCount(String path) throws Exception {

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int words = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                words += line.split(" ").length;
            }
            System.out.println("Number of words: " + words);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
