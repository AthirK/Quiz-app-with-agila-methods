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
        registerCommand(new SportQuiz(application));
    }

    @Override
    public void display()
    {
        // placeholder code
        System.out.println("welcome to the quiz game!");
        System.out.println("1. Create new User");
        System.out.println("2. Load Existing User");

        System.out.println("login menu");
        int index = 1;
        for (Command command : commands)
        {
            System.out.println(index++ + ". " + command.getName());
        }
    }
}
