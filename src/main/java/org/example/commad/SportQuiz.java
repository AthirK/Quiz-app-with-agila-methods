package org.example.commad;

import org.example.Application;

import java.util.Scanner;

public class SportQuiz extends Command{
    public SportQuiz(Application application) {
        super( "sport","this is a sport quiz", application);
    }

    @Override
    public void execute(String[] commandArgs)
    {
        System.out.println("hur många lag spelar samtidigt i en match");
        System.out.println("a). 2. b). 3. c). 5.");

    }
}
