package org.example.command;

import org.example.Application;

import java.util.Scanner;

public class DogQuiz extends Command {


    public DogQuiz(Application application) {
        super("Dog", "Type 'Dog' to play a fun and exiting quiz about dogs!", application);
    }

    @Override
    public void execute(String[] commandArgs) {

        //Welcome and art
        System.out.println("                            __");
        System.out.println("     ,                    ,\" e`--o");
        System.out.println("    ((                   (  | __,'");
        System.out.println("     \\\\~----------------' \\_;/");
        System.out.println("     (     # DOG QUIZ #     /");
        System.out.println("     /) ._______________.  )");
        System.out.println("    (( (               (( (");
        System.out.println("     ``-'               ``-'");
        System.out.println();


        Scanner scan = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("What is the most common dog in Sweden?");
        System.out.println("a) Labrador\nb) Whippet\nc) German shepherd");
        String input1 = scan.nextLine();
        if (input1.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else if (input1.equalsIgnoreCase("Labrador")){
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else {
            System.out.println("Wrong, the correct answer is Labrador.");
        }

        // Question 2
        System.out.println("How many legs does a dog have?");
        System.out.println("a) 4\nb) 3\nc) 8");
        String input2 = scan.nextLine();
        if (input2.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else if (input1.equalsIgnoreCase("4")){
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else {
            System.out.println("Wrong, the correct answer is 4");
        }

        // Question 3
        System.out.println("What do dogs have in common with rabbits?");
        System.out.println("a) They have a bunny tail\nb) They jump on two legs\nc) They eat grass");
        String input3 = scan.nextLine();
        if (input3.equalsIgnoreCase("c")) {
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else if (input1.equalsIgnoreCase("they eat grass")){
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else {
            System.out.println("Wrong, the correct answer is: c) They eay grass");
        }


        // Question 4
        System.out.println("Which sense is most developed in dogs??");
        System.out.println("a) Sight \nb) Smell \nc) Hearing");
        String input4 = scan.nextLine();
        if (input3.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else if (input1.equalsIgnoreCase("Smell")){
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else {
            System.out.println("Wrong, the correct answer is: Smell");
        }


        // Question 5
        System.out.println("What is a group of puppies called?");
        System.out.println("a) Pack\nb) Litter\nc) Herd");
        String input5 = scan.nextLine();
        if (input3.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else if (input1.equalsIgnoreCase("Litter")){
            System.out.println("Correct!");
            score++;
            System.out.println();
        } else {
            System.out.println("Wrong, the correct answer is: Litter");
        }

        // Displays the final score
        System.out.println("\nYou scored " + score + " out of 5!");

        System.out.println("The dog quiz is finished, type 'help' to see menu.");
    }
}
