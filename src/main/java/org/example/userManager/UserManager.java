package org.example.userManager;

import org.example.User;

public interface UserManager
{
    void save(User user);
    void remove(User user);
    User getByUsername(String Username);
}
