package org.example.command;

import org.example.Application;

import java.util.Scanner;

public class SportQuiz extends Command {
    public SportQuiz(Application application) {
        super("sport", "this is a sport quiz", application);
    }

    @Override
    public void execute(String[] commandArgs) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("How many teams play in a soccer match?");
        System.out.println("a) 2\nb) 3\nc) 5");
        String input1 = scan.nextLine();
        if (input1.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a) 2.");
        }

        // Question 2
        System.out.println("How many players are on a basketball team?");
        System.out.println("a) 5\nb) 8\nc) 11");
        String input2 = scan.nextLine();
        if (input2.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is a) 5.");
        }

        // Question 3
        System.out.println("What do tennis players hit the ball with?");
        System.out.println("a) A bat\nb) A racket\nc) Their hands");
        String input3 = scan.nextLine();
        if (input3.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) A racket.");
        }

        // Display the final score
        System.out.println("\nYou scored " + score + " out of 3!");
    }
}
