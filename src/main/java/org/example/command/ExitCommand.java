package org.example.command;

import org.example.Application;
import org.example.menu.GameMenu;
import org.example.menu.Menu;

import java.util.Scanner;

import static org.example.utilities.TextColor.*;
import static org.example.utilities.TextColor.ANSI_RESET;

public class ExitCommand  extends Command{
    public ExitCommand(Application application) {
        super("Quit", "Close the program", "\u001B[36m", application);
    }

    @Override
    public void execute(String[] commandArgs) {

        System.out.println("    _.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._");
        System.out.println(" .-'---      - ---     --     ---   -----   - --       ----  ----   -     ---`-.");
        System.out.println(" )                     .---------------------------------.                    (");
        System.out.println("(                      |  .---------------------------.  |                      )");
        System.out.println(" )                     |[]|                           |[]|                    (");
        System.out.println("(                      |  | Type [Quit] to close the  |  |                      )");
        System.out.println(" )                     |  |   programme or [Stay]     |  |                    (");
        System.out.println("(                      |  |    to return to the       |  |                      )");
        System.out.println(" )                     |  |    quiz selection menu.   |  |                    (");
        System.out.println("(                      |  |                           |  |                      )");
        System.out.println(" )                     |  |   And don't worry love..  |  |                    (");
        System.out.println("(                      |  | Your points are kept safe |  |                      )");
        System.out.println(" )                     |  |     until next time <3    |  |                    (");
        System.out.println("(                      |  `---------------------------'  |                      )");
        System.out.println(" )                     |      __________________ _____   |                    (");
        System.out.println("(                      |     |   ___            |     |  |                      )");
        System.out.println(" )                     |     |  |   |           |     |  |                    (");
        System.out.println("(                      |     |  |   |           |     |  |                      )");
        System.out.println(" )                     |     |  |   |           |     |  |                    (");
        System.out.println("(                      |     |  |___|           |     |  |                      )");
        System.out.println(" )                     \'____|__________________|_____|__|                    (");
        System.out.println(" (___       _       _       _       _       _       _       _       _       ___)");
        System.out.println("     `-._.-' (___ _) (__ _ ) (_   _) (__  _) ( __ _) (__  _) (__ _ ) `-._.-'");
        System.out.println("             `-._.-' (  ___) ( _  _) ( _ __) (_  __) (__ __) `-._.-'");
        System.out.println("                     `-._.-' (__  _) (__  _) (_ _ _) `-._.-'");
        System.out.println("                             `-._.-' (_ ___) `-._.-'");
        System.out.println("                                     `-._.-'");


        try {
            Scanner scanner = new Scanner(System.in);
            String quitCommand = scanner.nextLine();

            if (quitCommand.equalsIgnoreCase("quit")) {

                System.exit(0);

            } else {

                Menu gameMenu = new GameMenu(application);
                application.getMenuManager().setMenu(gameMenu);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}