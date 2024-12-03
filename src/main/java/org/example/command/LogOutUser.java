package org.example.command;

import org.example.Application;
import org.example.menu.GameMenu;
import org.example.menu.Menu;
import org.example.menu.UserMenu;

public class LogOutUser extends Command{
    public LogOutUser(Application application)
    {
        super("Log-out","log out to user menu", application);
    }

    @Override
    public void execute(String[] commandArgs)
    {
        //change menu to user menu
        Menu UserMenu = new UserMenu(application);
        application.getMenuManager().setMenu(UserMenu);
    }
}
