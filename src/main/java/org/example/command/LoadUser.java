package org.example.command;

import org.example.Application;
import org.example.User;
import org.example.menu.GameMenu;
import org.example.menu.Menu;

import java.util.Scanner;

public class LoadUser extends Command
{
    public LoadUser(Application application)
    {
        super("Load-User", "Load an existing user file", application);
    }

    @Override
    public void execute(String[] commandArgs)
    {
        Scanner scanner = new Scanner(System.in);
        boolean userIsLoaded = false;

        while (!userIsLoaded)
        {
            System.out.println("Enter Username to load:");
            String username = scanner.nextLine().trim();

            // Attempt to load the user
            User user = application.getUserManager().getByUsername(username);
            if (user == null)
            {
                System.out.println("User '" + username + "' does not exist.");

                boolean validMenuChoice = false;
                while (!validMenuChoice)
                {
                    System.out.println("1. Try another username");
                    System.out.println("2. Cancel");

                    String choice = scanner.nextLine().trim();
                    switch (choice) {
                        case "1":
                            validMenuChoice = true;
                            break;

                        case "2":
                            System.out.println("Load-User command cancelled. Type 'help' for a list of commands.");
                            return;

                        default:
                            System.out.println("Invalid choice. Select a number from the list.");
                            break;
                    }
                }
            }
            else
            {
                // Set the loaded user as the current user
                application.setCurrentUser(user);
                System.out.println("User '" + username + "' has been successfully loaded.\n");
                userIsLoaded = true;
            }
        }
        // Change to the game menu after successfully loading a user
        Menu gameMenu = new GameMenu(application);
        application.getMenuManager().setMenu(gameMenu);
    }
}