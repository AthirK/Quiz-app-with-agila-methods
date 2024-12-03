package org.example.command;

import org.example.Application;
import org.example.User;

import java.util.Scanner;

public class RemoveUser extends Command
{
    public RemoveUser(Application application)
    {
        super("Remove-User", "Remove an existing user file", application);
    }

    @Override
    public void execute(String[] commandArgs)
    {
        Scanner scanner = new Scanner(System.in);
        boolean userIsRemoved = false;

        while (!userIsRemoved)
        {
            System.out.println("Enter Username to remove:");
            String username = scanner.nextLine().trim();

            // Attempt to find the user
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
                            validMenuChoice = true; // Break out and re-prompt
                            break;

                        case "2":
                            System.out.println("Remove-User command cancelled. Type 'help' for a list of commands.");
                            return;

                        default:
                            System.out.println("Invalid choice. Select a number from the list.");
                            break;
                    }
                }
            }
            else
            {
                // Confirm removal
                System.out.println("Are you sure you want to remove user '" + username + "'? This action cannot be undone.");
                System.out.println("1. Yes");
                System.out.println("2. No");

                String choice = scanner.nextLine().trim();
                if ("1".equals(choice))
                {
                    application.getUserManager().remove(user);
                    System.out.println("User '" + username + "' has been successfully removed.");
                    userIsRemoved = true;
                }
                else if ("2".equals(choice))
                {
                    System.out.println("Remove-User command cancelled. Type 'help' for a list of commands.");
                    return;
                }
                else
                {
                    System.out.println("Invalid choice. Select a number from the list");
                }
            }
        }
    }
}