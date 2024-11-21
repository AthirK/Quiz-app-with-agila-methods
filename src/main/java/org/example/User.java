package org.example;

public class User
{
    private String username;
    private int points;

    //getters
    public String getUsername()
    {
        return username;
    }

    public int getPoints()
    {
        return points;
    }

    //setter
    public void setUsername(String name)
    {
        this.username = name;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }
}
