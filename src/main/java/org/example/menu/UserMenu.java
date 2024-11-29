package org.example.menu;

import org.example.Application;
import org.example.command.Command;
import org.example.command.CreateUser;
import org.example.command.LoadUser;
import org.example.command.SportQuiz;

public class UserMenu extends Menu
{
    public UserMenu(Application application)
    {
        super(application);

        // User commands
        registerCommand(new CreateUser(application));
        registerCommand(new LoadUser(application));
    }

    @Override
    public void display()
    {
        // loops throw command list and prints an index number and command name.
        System.out.println("welcome to the Quiz Game!\n");
        System.out.println("    |-Login Menu-|");
        System.out.println("----------------------");
        for (Command command : commands)
        {
            System.out.println(command.getName());
        }
        System.out.println("----------------------");
    }
}
