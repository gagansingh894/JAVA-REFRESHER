package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MovieList movies = new MovieList("/home/gagandeep/GS-Lair/Codes/JAVACODES/JAVA-REFRESHER/guess_the_movie_project/movies_list.txt");
        String movieName = movies.getMovieName().toLowerCase().replaceAll("\\s+", "_");
        int movieNameLen = movieName.length();
        int score = 10;
        int numOfGuesses = 0;
        StringBuilder answer = new StringBuilder();
        answer.append("_".repeat(movieNameLen));
        StringBuilder wrongCharacters = new StringBuilder();
        System.out.println(movieName);

        while (score != 0) {
            System.out.println("You are guessing:" + answer.toString());
            System.out.println("You have guessed (" + numOfGuesses + ") wrong letters: " + wrongCharacters.toString());
            System.out.print("Guess a letter: ");
            String temp = scanner.next();

            // Occurence Logic
            int index = -1;
            int cnt = 0;
            while (true) {
                index = movieName.indexOf(temp, index + 1);
                // When the entered string is not present
                if (index == -1) {
                    if (cnt == 0) {
                        numOfGuesses ++;
                        if (!wrongCharacters.toString().contains(temp)) {
                            wrongCharacters.append(temp);
                            score --;
                        }
                        break;
                    }
                    break;
                } else {
                    cnt ++;
                    answer.setCharAt(index, temp.charAt(0));
                }
            }
            if (movieName.equals(answer.toString())) {
                System.out.println("You have guessed the movie correctly");
                System.out.println("Your score: " + score);
                break;
            }

            if (score == 5) {
                System.out.println("You have 5 more chances");
            }

        }
        System.out.println("You exhausted all your chances. You Lost");
    }
}
