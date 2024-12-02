package org.example.command;

import org.example.Application;

import static org.example.utility.TextColor.ANSI_RESET;


public abstract class Command
{
    private final String name;
    private final String description;
    private final String colorCode;
    protected Application application;

    public Command(String name, String description, String colorCode, Application application)
    {
        this.name = name;
        this.description = description;
        this.colorCode = colorCode;
        this.application = application;
    }
    // NEW CONSTRUCTOR THAT GIVES THE OPTION TO HAVE PARAMETERS IN COMMANDS WITHOUT COLOR NEEDED ex CreateUser.
    public Command(String name, String description, Application application)
    {
        this(name, description,"", application);
    }

    public String getName()
    {
        return name;
    }
    //Decides either to get name without color or and name with color.
    public String getColoredName()
    {
        if (colorCode.isEmpty()){
            return name;
        }

        return colorCode + name + ANSI_RESET;
    }

    public String getDescription()
    {
        return description;
    }

    public abstract void execute(String[] commandArgs);
}