package org.example.menu;

import org.example.Application;
import org.example.command.Command;
import org.example.command.SportQuiz;

public class UserMenu extends Menu
{
    public UserMenu(Application application)
    {
        super(application);

        // placeholder code will replace with user login commands

    }

    @Override
    public void display()
    {
        // placeholder code

        System.out.println("welcome to the Quiz Game!\n");
        System.out.println("    |-Login Menu-|");
        System.out.println("----------------------.");
        System.out.println("1. Create new User    |");
        System.out.println("2. Load Existing User |");
        System.out.println("----------------------´");


        int index = 1;
        for (Command command : commands)
        {
            System.out.println(index++ + ". " + command.getName());
        }
    }
}
