package org.example.menu;

import org.example.Application;
import org.example.commad.DogQuiz;
import org.example.commad.SportQuiz;

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
        System.out.println("Application");
    }
}
