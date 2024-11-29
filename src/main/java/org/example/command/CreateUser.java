package org.example.command;

import org.example.Application;
import org.example.User;
import org.example.menu.GameMenu;
import org.example.menu.Menu;

import java.util.Scanner;

public class CreateUser extends Command
{
    public CreateUser(Application application)
    {
        super("Create-User", "Create new user file", application);
    }

    @Override
    public void execute(String[] commandArgs)
    {
        Scanner scanner = new Scanner(System.in);
        boolean userIsCreated = false;

        while (!userIsCreated)
        {
            System.out.println("Enter Username");
            String newUsername = scanner.nextLine().trim();


            // Validate username
            if (!isValidUsername(newUsername))
            {
                System.out.println("Invalid username.");
                System.out.println("Usernames must be alphanumeric, non-empty, and cannot be purely numeric.");

                // Skip the rest of the loop and re-prompt for a valid username
                continue;
            }

            // checks if the username is in use.
            if (application.getUserManager().getByUsername(newUsername) != null)
            {
                System.out.println(newUsername + " already exists.");

                boolean validMenuChoice = false;
                while (!validMenuChoice)
                {
                    System.out.println("1. Overwrite user");
                    System.out.println("2. Change username");
                    System.out.println("3. Cancel");

                    String choice = scanner.nextLine().trim();
                    switch (choice)
                    {
                        case "1":
                            // overwrite old user file
                            User existingUser = new User();
                            existingUser.setUsername(newUsername);
                            existingUser.setPoints(0);
                            application.getUserManager().save(existingUser);
                            application.setCurrentUser(existingUser);
                            System.out.println(newUsername + " has been overwritten. \n");

                            userIsCreated = true;
                            validMenuChoice = true;


                            break;

                        case "2":
                            // Allow user to change the username and continue the loop
                            validMenuChoice = true;
                            break;

                        case "3":
                            // cansel the command
                            System.out.println("Create-Users command cancelled. Type 'help' for a list of commands.");
                            return;

                        default:
                            // show 1-3 list again
                            System.out.println("Invalid choice. Select a number from the list.");
                            break;
                    }
                }
            }

            else
            {
                // If user file does not exist, create it
                User newUser = new User();
                newUser.setUsername(newUsername);
                newUser.setPoints(0);
                application.getUserManager().save(newUser);
                application.setCurrentUser(newUser);
                System.out.println("User " + newUsername + " has been created. \n");

                userIsCreated = true;
            }
        }
        //change menu to game menu
        Menu GameMenu = new GameMenu(application);
        application.getMenuManager().setMenu(GameMenu);
    }



    // Helper method to validate the username
    private boolean isValidUsername(String username)
    {
        // Empty or whitespace-only username
        if (username == null || username.trim().isEmpty())
        {
            return false;
        }

        // Purely numeric username
        if (username.matches("\\d+"))
        {
            return false;
        }

        // Non-alphanumeric characters
        if (!username.matches("[a-zA-Z0-9]+"))
        {
            return false;
        }

        // Length constraints (e.g., 3-20 characters)
        if (username.length() < 3 || username.length() > 20)
        {
            return false;
        }
        return true;
    }
}