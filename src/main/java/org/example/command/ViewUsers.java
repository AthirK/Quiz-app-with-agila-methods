package org.example.command;

import org.example.Application;
import org.example.User;

import java.io.File;

public class ViewUsers extends Command
{
    public ViewUsers(Application application)
    {
        super("View-Users", "View a list of all users", application);
    }

    @Override
    public void execute(String[] commandArgs)
    {
        // Directory containing user files
        File usersFolder = new File("./users");

        if (!usersFolder.exists() || !usersFolder.isDirectory())
        {
            System.out.println("No users directory found. Type 'help' for a list of commands.");
            return;
        }

        // Get the list of all user files
        File[] userFiles = usersFolder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (userFiles == null || userFiles.length == 0)
        {
            System.out.println("No users found. Type 'help' for a list of commands.");
            return;
        }

        System.out.println("List of users:");
        System.out.println("----------------------");

        for (File userFile : userFiles)
        {
            String username = userFile.getName().replace(".txt", "");
            User user = application.getUserManager().getByUsername(username);

            if (user != null)
            {
                System.out.println("- " + user.getUsername() + " (Points: " + user.getPoints() + ")");
            }
        }

        System.out.println("----------------------");
        System.out.println("Type 'help' for a list of commands.");
    }
}


