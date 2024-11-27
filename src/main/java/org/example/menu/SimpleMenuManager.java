package org.example.menu;

import org.example.Application;

import static org.example.Application.login;

public class SimpleMenuManager implements MenuManager
{
    private Menu menu;

    public SimpleMenuManager(Application application)
    {
        // checks if user is logged in and sets menu.
        if (!login)
        {
            this.menu = new UserMenu(application);
        }

        else
        {
            this.menu = new GameMenu(application);
        }

        this.menu.display();
    }

    @Override
    public void setMenu(Menu menu)
    {
        this.menu = menu;
        menu.display();
    }

    @Override
    public Menu getCurrentMenu()
    {
        return menu;
    }
}