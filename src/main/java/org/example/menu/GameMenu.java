package org.example.menu;

import org.example.Application;
import org.example.command.Command;
import org.example.command.DogQuiz;
import org.example.command.ExitCommand;
import org.example.command.LogOutUser;
import org.example.command.SportQuiz;

public class GameMenu extends Menu
{
    public GameMenu(Application application)
    {
        super(application);

        // Game commands
        registerCommand(new SportQuiz(application));
        registerCommand(new DogQuiz(application));
        registerCommand(new ExitCommand(application));
        registerCommand(new LogOutUser(application));

    }

    @Override
    public void display()
    {
        System.out.println("       <GAME MENU>");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("type the command name from the list below to proceed.");
        System.out.println("example 'help'.");

        // loops throw command list and prints an index number and command name.
        for (Command command : commands)
        {
            System.out.println(command.getColoredName());
        }
    }
}
