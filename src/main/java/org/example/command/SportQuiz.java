package org.example.command;

import org.example.Application;

import java.util.Scanner;

public class SportQuiz extends Command {
    public SportQuiz(Application application) {
        super("Sport-Quiz", "Type 'Sport-quiz' to play a sweaty sport game.", application);
    }

    @Override
    public void execute(String[] commandArgs)
    {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("Important notice, if you input anything other than a,b or c, this will count as a try and result in loss of 1 point");

        // Question 1
        System.out.println("How many teams play in a soccer match?");
        System.out.println("a) 2\nb) 3\nc) 5");
        String input1 = scan.nextLine();
        if (input1.equalsIgnoreCase("a") || input1.equalsIgnoreCase("Two")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a) 2.");
        }

        // Question 2
        System.out.println("How many players are on a basketball team?");
        System.out.println("a) 5\nb) 8\nc) 11");
        String input2 = scan.nextLine();
        if (input2.equalsIgnoreCase("a") || input2.equalsIgnoreCase("Five")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a) 5.");
        }

        // Question 3
        System.out.println("What do tennis players hit the ball with?");
        System.out.println("a) A bat\nb) A racket\nc) Their hands");
        String input3 = scan.nextLine();
        if (input3.equalsIgnoreCase("b") || input3.equalsIgnoreCase("A racket")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) A racket.");
        }


        // Question 4
        System.out.println("Which team won the NBA finals of the year 2022?");
        System.out.println("a) Golden State Warriors\nb) Miami Heat \nc) Chicago Bulls");
        String input4 = scan.nextLine();
        if (input4.equalsIgnoreCase("a") || input4.equalsIgnoreCase("Golden State Warriors")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a) Golden State Warriors.");
        }

        // Question 5
        System.out.println("What is the term for two extremely tall and dominant players on one team?");
        System.out.println("a) Twin Towers\nb) Deuce Dribblers \nc) Big Ballers");
        String input5 = scan.nextLine();
        if (input5.equalsIgnoreCase("a") || input5.equalsIgnoreCase("Twin Towers")) {
            System.out.println("Correct!");
            score++;
        } else {

            System.out.println("Wrong! The correct answer is a) Twin Towers.");
        }


        // Display the final score
        System.out.println("\nYou scored " + score + " out of 5! Type help to return to main menu");
    }
}
