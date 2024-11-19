package org.example.commad;

public interface CommandManager
{
    void registerCommand(Command command);
    void tryExecuteCommand(String input);
}