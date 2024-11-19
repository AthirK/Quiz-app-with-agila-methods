package org.example;

import org.example.menu.MenuManager;
import org.example.menu.SimpleMenuManager;
import org.example.userManager.UserManager;

import java.util.Scanner;

public class Application
{
    //managers
    private MenuManager menuManager;
    private UserManager userManager;

    public Application()
    {
        this.menuManager = new SimpleMenuManager(this);
    }

    public static void main(String[] args)
    {
        Application application = new Application();

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            String input = scanner.nextLine();

            application.getMenuManager().getCurrentMenu().tryExecuteCommand(input);
        }
    }

    public MenuManager getMenuManager()
    {
        return menuManager;
    }

}