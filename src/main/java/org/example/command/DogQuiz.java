package org.example.command;

import org.example.Application;

import java.util.Scanner;

public class DogQuiz extends Command {


    public DogQuiz(Application application) {
        super("Dog", "Type 'Dog' to play a fun and exiting quiz about dogs!", application);
    }

    @Override
    public void execute(String[] commandArgs) {

        Scanner scan = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("What is the most common dog in Sweden?");
        System.out.println("a) Labrador\nb) Whippet\nc) A mix of american bully and blood hound");
        String input1 = scan.nextLine();
        if (input1.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else {
            System.out.println("Wrong! The correct answer is a) Labrador.");
        }

        // Question 2
        System.out.println("How many legs does a dog have?");
        System.out.println("a) 4\nb) 3\nc) 8");
        String input2 = scan.nextLine();
        if (input2.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else {
            System.out.println("Wrong! The correct answer is a) 4 legs");
        }

        // Question 3
        System.out.println("What do dogs have in common with rabbits?");
        System.out.println("a) They have a bunny tail\nb) They jump on two legs\nc) They eat grass");
        String input3 = scan.nextLine();
        if (input3.equalsIgnoreCase("c")) {
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else {
            System.out.println("Wrong! The correct answer is c) They eay grass");
        }

        // Display the final score
        System.out.println("\nYou scored " + score + " out of 3!");
    }

}

