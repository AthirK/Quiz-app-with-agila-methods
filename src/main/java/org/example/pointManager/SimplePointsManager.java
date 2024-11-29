package org.example.pointManager;

import org.example.Application;

public class SimplePointsManager implements PointsManager
{

    protected Application application;

    public SimplePointsManager(Application application)
    {
        this.application = application;
    }

    @Override
    public void updatePoints(int score)
    {
        // gets score points form quiz's and adds to total.
        int totalScore = application.getCurrentUser().getPoints() + score;
        System.out.println("Your total score is: " + totalScore);

        // sets total points to user and current user
        application.getCurrentUser().setPoints(totalScore);

        // Saves current to user file
        application.getUserManager().save(application.getCurrentUser());
    }
}
