package org.example.commad;

import org.example.Application;

public abstract class Command
{
    private final String name;
    private final String description;
    protected Application application;

    public Command(String name, String description, Application application)
    {
        this.name = name;
        this.description = description;
        this.application = application;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public abstract void execute(String[] commandArgs);
}