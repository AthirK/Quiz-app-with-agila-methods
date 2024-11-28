package org.example.menu;

import org.example.Application;
import org.example.command.Command;
import org.example.command.CreateUser;

public class UserMenu extends Menu
{
    public UserMenu(Application application)
    {
        super(application);

        // User commands
        registerCommand(new CreateUser(application));
    }

    @Override
    public void display()
    {
        // loops throw command list and prints an index number and command name.
        System.out.println("login menu");
        int index = 1;
        for (Command command : commands)
        {
            System.out.println(index++ + ". " + command.getName());
        }
    }
}
