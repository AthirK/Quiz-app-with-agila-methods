package org.example.menu;

import org.example.Application;

public class SimpleMenuManager implements MenuManager
{
    private Menu menu;

    public SimpleMenuManager(Application application)
    {
        this.menu = new UserMenu(application);
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