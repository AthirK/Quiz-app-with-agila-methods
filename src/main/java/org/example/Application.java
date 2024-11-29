package org.example;

import org.example.menu.MenuManager;
import org.example.menu.SimpleMenuManager;
import org.example.userManager.FileUserManager;
import org.example.userManager.UserManager;

import java.util.Scanner;

public class Application
{
    public static boolean run = true;

    //Managers
    private final MenuManager menuManager;
    private final UserManager userManager;

    // Current user stores the active user
    private User currentUser;

    public Application()
    {
        this.menuManager = new SimpleMenuManager(this);
        this.userManager = new FileUserManager();

        // Initialize with no active user
        this.currentUser = null;
    }

    public static void main(String[] args)
    {
        Application application = new Application();

        Scanner scanner = new Scanner(System.in);

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

    public User getCurrentUser()
    {
        return currentUser;
    }

    public void setCurrentUser(User currentUser)
    {
        this.currentUser = currentUser;
    }
}