package org.example;

public class PlayerCharacter {

    static int x;
    static int y;

    public static int getX() {
        int x = 0;
        return x;
    }

    public static int getY() {
        int y = 0;
        return y;
    }

    public static boolean move(char arg){
        if (arg == 'w') {
            y = 1;
            return true;
        } else {
            return false;
        }
    }
}
