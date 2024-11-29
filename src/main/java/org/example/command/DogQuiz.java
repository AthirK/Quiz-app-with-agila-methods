package org.example.command;

import org.example.Application;
import org.example.User;
import org.example.userManager.FileUserManager;

import java.util.Scanner;

import static org.example.Utilities.TextColor.*;

public class DogQuiz extends Command {


    public DogQuiz(Application application) {
        super("Dog-Quiz", "Type 'Dog-quiz' to play a fun and exiting quiz about dogs!", "\u001B[33m", application);
    }

    @Override
    public void execute(String[] commandArgs) {

        //Welcome and art
        System.out.println(ANSI_YELLOW + " ");
        System.out.println("                            __");
        System.out.println("     ,                    ,\" e`--o");
        System.out.println("    ((                   (  | __,'");
        System.out.println("     \\\\~----------------' \\_;/");
        System.out.println("     (     # DOG QUIZ #     /");
        System.out.println("     /) ._______________.  )");
        System.out.println("    (( (               (( (");
        System.out.println("     ``-'               ``-'" + ANSI_RESET);
        System.out.println();


        Scanner scan = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println(ANSI_YELLOW + "What is the most common dog in Sweden?" + ANSI_RESET);
        System.out.println("a) Labrador\nb) Whippet\nc) German shepherd");
        String input1 = scan.nextLine();

        if (input1.equalsIgnoreCase("a")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();
        } else if (input1.equalsIgnoreCase("Labrador")){
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();
        } else {
            System.out.println(ANSI_RED + "Wrong, the correct answer is Labrador." + ANSI_RESET);
        }

        // Question 2

        System.out.println(ANSI_YELLOW + "How many legs does a dog have?" + ANSI_RESET);
        System.out.println("a) Four\nb) Three\nc) Eight");

        String input2 = scan.nextLine();
        if (input2.equalsIgnoreCase("a")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();

        } else if (input2.equalsIgnoreCase("Four")){
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();
        } else {
            System.out.println(ANSI_RED + "Wrong, the correct answer is four" + ANSI_RESET);
            System.out.println();
        }

        // Question 3
        System.out.println(ANSI_YELLOW + "What do dogs have in common with rabbits?" + ANSI_RESET);
        System.out.println("a) They have a bunny tail\nb) They jump on two legs\nc) They eat grass");
        String input3 = scan.nextLine();
        if (input3.equalsIgnoreCase("c")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();
        } else if (input1.equalsIgnoreCase("they eat grass")){
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();
        } else {
            System.out.println(ANSI_RED + "Wrong, the correct answer is: c) They eay grass" + ANSI_RESET);
            System.out.println();
        }

        // Question 4
        System.out.println(ANSI_YELLOW + "Which sense is most developed in dogs??" + ANSI_RESET);
        System.out.println("a) Sight \nb) Smell \nc) Hearing");
        String input4 = scan.nextLine();
        if (input4.equalsIgnoreCase("b")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();
        } else if (input4.equalsIgnoreCase("Smell")){
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();
        } else {
            System.out.println(ANSI_RED + "Wrong, the correct answer is: Smell" + ANSI_RESET);
            System.out.println();
        }


        // Question 5
        System.out.println(ANSI_YELLOW + "What is a group of puppies called?" + ANSI_RESET);
        System.out.println("a) Pack\nb) Litter\nc) Herd");
        String input5 = scan.nextLine();
        if (input5.equalsIgnoreCase("b")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();
        } else if (input5.equalsIgnoreCase("Litter")){
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
            System.out.println();
        } else {
            System.out.println(ANSI_RED + "Wrong, the correct answer is: Litter" + ANSI_RESET);
        }

        // Displays the final score
        System.out.println(ANSI_YELLOW + " ");
        System.out.println("                            __");
        System.out.println("     ,                    ,\" e`--o");
        System.out.println("    ((                   (  | __,'");
        System.out.println("     \\\\~----------------' \\_;/");
        System.out.println("     (  You scored " + score + " of 5!  /");
        System.out.println("     /) ._______________.  )");
        System.out.println("    (( (               (( (");
        System.out.println("     ``-'               ``-'" + ANSI_RESET);
        System.out.println();

        // Saves points to user and saves user to file
        application.getPointsManager().updatePoints(score);

        System.out.println("The dog quiz is finished, type 'help' to see menu.");
    }
}
