package org.example.command;

import org.example.Application;
import org.example.menu.GameMenu;
import org.example.menu.Menu;

import java.util.Scanner;
import static org.example.utility.TextColor.*;

public class Exit extends Command{
    public Exit(Application application) {
        super("Quit", "Close the programme", "\u001B[36m", application);
    }

    @Override
    public void execute(String[] commandArgs) {

        System.out.println("    _.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._");
        System.out.println(" .-'---      - ---     --     ---   -----   - --       ----  ----   -     ---`-.");
        System.out.println(" )                     .---------------------------------.                    (");
        System.out.println("(                      |  .---------------------------.  |                      )");
        System.out.println(" )                     |[]|                           |[]|                    (");
        System.out.println("(                      |  | Type [\u001B[31mQuit" + ANSI_RESET +"] to close the  |  |                      )");
        System.out.println(" )                     |  |   programme or [\u001B[32mStay" + ANSI_RESET +  "]     |  |                    (");
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
        System.out.println("(                      |     |  |___|           |     |  |                      )");
        System.out.println(" )                     \\_____|__________________|_____|__|                    (");
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

                Application.run = false;


            } else {

                Menu gameMenu = new GameMenu(application);
                application.getMenuManager().setMenu(gameMenu);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}