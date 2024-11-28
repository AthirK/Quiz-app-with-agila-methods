package org.example.menu;

import org.example.Application;
import org.example.command.Command;
import org.example.command.DogQuiz;
import org.example.command.SportQuiz;

public class GameMenu extends Menu
{
    public GameMenu(Application application)
    {
        super(application);

        // Game commands
        registerCommand(new SportQuiz(application));
        registerCommand(new DogQuiz(application));
    }

    @Override
    public void display()
    {
        // loops throw command list and prints an index number and command name.
        System.out.println("Welcome to the Quiz Game! Type 'help' for a list of commands.");
        int index = 1;
        for (Command command : commands)
        {
            System.out.println(index++ + ". " + command.getName());
        }
    }
}
