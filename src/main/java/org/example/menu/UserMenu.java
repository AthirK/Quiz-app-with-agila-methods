package org.example.menu;

import org.example.Application;
import org.example.command.Command;
import org.example.command.CreateUser;
import org.example.command.LoadUser;
import org.example.command.RemoveUser;

import static org.example.utilities.TextColor.ANSI_GREEN;
import static org.example.utilities.TextColor.ANSI_RESET;

public class UserMenu extends Menu
{
    public UserMenu(Application application)
    {
        super(application);

        // User commands
        registerCommand(new CreateUser(application));
        registerCommand(new LoadUser(application));
        registerCommand(new RemoveUser(application));
    }

    @Override
    public void display()
    {
        // loops throw command list and prints an index number and command name.
        System.out.println("welcome to the Quiz Game!\n");
        System.out.println("\u001B[40m" + ANSI_GREEN + "    |-Login Menu-|    " + ANSI_RESET);
        System.out.println("----------------------");
        for (Command command : commands)
        {
            System.out.println(command.getName());
        }
        System.out.println("----------------------");
    }
}
