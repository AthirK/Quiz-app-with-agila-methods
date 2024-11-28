package org.example.userManager;

import org.example.User;

import java.io.*;

public class FileUserManager implements UserManager
{
    @Override
    public void save(User user)
    {
        File folder = new File("./Users");
        if (!folder.exists() && !folder.mkdirs())
        {
            System.out.println("Error: Could not create Users folder.");
            return;
        }

        File file = new File(folder, user.getUsername() + ".txt");
        try (FileWriter writer = new FileWriter(file))
        {
            writer.append(user.getUsername()).append("\n")
                    .append(String.valueOf(user.getPoints())).append("\n");

            System.out.println("User " + user.getUsername() + " created successfully!\n" );
        }
        catch (IOException e)
        {
            System.out.println("Error failed to create user: " + e.getMessage());
        }
    }

    @Override
    public void remove(User user)
    {
        File file = new File("./User", user.getUsername() + ".txt");
        if (file.exists())
        {
            if (file.delete())
            {
                System.out.println(user.getUsername() + "' removed.");
            }
            else
            {
                System.out.println("Error: Could not delete User file.");
            }
        }
        else
        {
            System.out.println("Error: User file not found.");
        }
    }

    @Override
    public User getByUsername(String Username)
    {
        File file = new File("./Users", Username + ".txt");
        if (!file.exists())
        {
            System.out.println("Error: '" + Username + "' not found.");
            return null;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            User user = new User();
            user.setUsername(reader.readLine());
            user.setPoints(Integer.parseInt(reader.readLine()));

            System.out.println("User " + user.getUsername() + " Loaded successfully!\n");

            return user;
        }
        catch (IOException e)
        {
            System.out.println("Error loading '" + Username + "': " + e.getMessage());
            return null;
        }
    }
}
