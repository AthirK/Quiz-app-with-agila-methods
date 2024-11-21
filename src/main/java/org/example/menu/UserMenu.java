package org.example.menu;

import org.example.Application;
import org.example.command.DogQuiz;
import org.example.command.SportQuiz;

public class UserMenu extends Menu
{
    public UserMenu(Application application)
    {
        // commands
        super(application);
        registerCommand(new SportQuiz(application));
        registerCommand(new DogQuiz(application));

    }

    @Override
    public void display()
    {
        System.out.println("welcome to the quiz game!");
        System.out.println("1. Create new User");
        System.out.println("2. Load Existing User");
    }
}
