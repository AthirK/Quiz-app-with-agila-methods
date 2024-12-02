package org.example.command;

import org.example.Application;

import java.util.Scanner;

import static org.example.utilities.TextColor.*;

public class SportQuiz extends Command {
    public SportQuiz(Application application) {
        super("Sport-Quiz", "Type 'Sport-quiz' to play a sweaty sport game.", "\u001B[34m", application);
    }

    @Override
    public void execute(String[] commandArgs)
    {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("Important notice, if you input anything other than a,b or c, this will count as a try and result in loss of 1 point");

        // Question 1
        System.out.println(ANSI_BLUE + "How many teams play in a soccer match?" + ANSI_RESET);
        System.out.println("a) 2\nb) 3\nc) 5");
        String input1 = scan.nextLine();
        if (input1.equalsIgnoreCase("a") || input1.equalsIgnoreCase("Two")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
        } else {
            System.out.println(ANSI_RED + "Wrong! The correct answer is a) 2." + ANSI_RESET);
        }

        // Question 2
        System.out.println(ANSI_BLUE + "How many players are on a basketball team?" + ANSI_RESET);
        System.out.println("a) 5\nb) 8\nc) 11");
        String input2 = scan.nextLine();
        if (input2.equalsIgnoreCase("a") || input2.equalsIgnoreCase("Five")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
        } else {
            System.out.println(ANSI_RED + "Wrong! The correct answer is a) 5." + ANSI_RESET);
        }

        // Question 3
        System.out.println(ANSI_BLUE + "What do tennis players hit the ball with?" + ANSI_RESET);
        System.out.println("a) A bat\nb) A racket\nc) Their hands");
        String input3 = scan.nextLine();
        if (input3.equalsIgnoreCase("b") || input3.equalsIgnoreCase("A racket")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
        } else {
            System.out.println(ANSI_RED + "Wrong! The correct answer is b) A racket." + ANSI_RESET);
        }


        // Question 4
        System.out.println(ANSI_BLUE + "Which team won the NBA finals of the year 2022?" + ANSI_RESET);
        System.out.println("a) Golden State Warriors\nb) Miami Heat \nc) Chicago Bulls");
        String input4 = scan.nextLine();
        if (input4.equalsIgnoreCase("a") || input4.equalsIgnoreCase("Golden State Warriors")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
        } else {
            System.out.println(ANSI_RED + "Wrong! The correct answer is a) Golden State Warriors." + ANSI_RESET);
        }

        // Question 5
        System.out.println(ANSI_BLUE + "What is the term for two extremely tall and dominant players on one team?" + ANSI_RESET);
        System.out.println("a) Twin Towers\nb) Deuce Dribblers \nc) Big Ballers");
        String input5 = scan.nextLine();
        if (input5.equalsIgnoreCase("a") || input5.equalsIgnoreCase("Twin Towers")) {
            System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
            score++;
        } else {

            System.out.println(ANSI_RED + "Wrong! The correct answer is a) Twin Towers." + ANSI_RESET);
        }


        // Display the final score
        System.out.println("\nYou scored " + score + " out of 5! Type help to return to main menu");

        // Saves points to user and saves user to file
        application.getPointsManager().updatePoints(score);

        System.out.println("The sport quiz is finished, type 'help' to see menu.");
    }
}
