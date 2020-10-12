package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Path currentDir = Paths.get(System.getProperty("user.dir"));
        String phase1Path = Paths.get(currentDir.toString(), "Phase1.txt").toString();
        String phase2Path = Paths.get(currentDir.toString(), "Phase2.txt").toString();
        System.out.println(phase1Path);
        System.out.println(phase2Path);
    }
}
