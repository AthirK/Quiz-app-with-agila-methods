package org.example;

import org.example.menu.GameMenu;
import org.example.menu.Menu;
import org.example.menu.MenuManager;
import org.example.menu.SimpleMenuManager;
import org.example.userManager.FileUserManager;
import org.example.userManager.UserManager;

import java.util.Scanner;

public class Application
{
    public static boolean run = true;
    public static boolean login = false;

    //managers
    private final MenuManager menuManager;
    private final UserManager userManager;

    public Application()
    {
        this.menuManager = new SimpleMenuManager(this);
        this.userManager = new FileUserManager();
    }

    public static void main(String[] args)
    {
        Application application = new Application();

        Scanner scanner = new Scanner(System.in);

        // needs to move to commands with different class names for each user item.
        // exp create user, load user, show list of users and so on...
        String choice = scanner.nextLine();
        Menu GameMenu = new GameMenu(application);

        switch (choice)
        {
            case "1":
                System.out.println("Enter Username");
                String newUsername = scanner.nextLine();
                User newUser = new User();
                newUser.setUsername(newUsername);
                newUser.setPoints(0);
                application.getUserManager().save(newUser);
                login = true;

                application.getMenuManager().setMenu(GameMenu);
                break;

            case "2":
                System.out.println("Enter username");
                String existingUser = scanner.nextLine();
                User loadUser = application.getUserManager().getByUsername(existingUser);
                login = true;
                application.getMenuManager().setMenu(GameMenu);

                if(loadUser == null)
                {
                    System.out.println("exiting game...");
                    run = false;
                }
                break;

            default:
                System.out.println("Invalid choice exiting game...");
                run = false;
        }

        while (run)
        {
            String input = scanner.nextLine();

            application.getMenuManager().getCurrentMenu().tryExecuteCommand(input);
        }
    }

    public MenuManager getMenuManager()
    {
        return menuManager;
    }

    public UserManager getUserManager()
    {
        return userManager;
    }
}