package org.example.menu;

import org.example.Application;
import org.example.command.Command;
import org.example.command.CommandManager;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu implements CommandManager
{
    private final List<Command> commands = new ArrayList<>();
    protected Application application;

    public Menu(Application application)
    {
        this.application = application;
    }

    public abstract void display();

    @Override
    public void registerCommand(Command command)
    {
        this.commands.add(command);
    }

    @Override
    public void tryExecuteCommand(String input)
    {
        if (input.isBlank())
        {
            System.out.println("Error: Command input cannot be empty.");
            return;
        }

        if (input.equalsIgnoreCase("help"))
        {
            for (Command command : commands)
            {
                System.out.println(command.getName() + " - " + command.getDescription());
            }
            return;
        }

        String[] commandArgs = input.split(" ");
        String commandName = commandArgs[0];

        for (Command command : commands)
        {
            if (command.getName().equalsIgnoreCase(commandName))
            {
                try
                {
                    command.execute(commandArgs);
                }
                catch (Exception e)
                {
                    System.out.println("Error: An error occurred while executing the command. " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("Error: Unknown command '" + commandName + "'. Type 'help' for a list of commands.");
    }
}

