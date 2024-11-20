package org.example.commad;

import org.example.Application;
import org.example.commad.Command;

import java.util.Scanner;

public class NatureQuiz extends Command
{
    public NatureQuiz(Application application) {
        super( "sport","this is a sport quiz", application);
    }

    @Override
    public void execute(String[] commandArgs)
    {
        System.out.println("sport quiz");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();


    }
}