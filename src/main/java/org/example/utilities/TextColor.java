package org.example.utilities;


//TextColor class that holds all colors available to use.
public class TextColor {
//RESET to reset text to default after RESET has been implemented at end of TEXT/STATEMENT.

    public static final String ANSI_RESET = "\u001B[0m";

    //LIST of colors and their colorCode "\u001B[30m" that can be used to color texts.
    //TEXT-COLORS
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //BACKGROUND-COLORS
    //EXAMPLE = ANSI_BLACK_BACKGROUND or "\u001B[40m".
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND= "\u001B[41m";
    public static final String GREEN_BACKGROUND= "\u001B[42m";
    public static final String YELLOW_BACKGROUND= "\u001B[43m";
    public static final String BLUE_BACKGROUND= "\u001B[44m";
    public static final String PURPLE_BACKGROUND= "\u001B[45m";
    public static final String CYAN_BACKGROUND= "\u001B[46m";
    public static final String WHITE_BACKGROUND= "\u001B[47m";


}
