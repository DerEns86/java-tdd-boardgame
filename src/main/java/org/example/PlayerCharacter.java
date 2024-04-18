package org.example;

public class PlayerCharacter {

    static int x = 0;
    static int y = 0;

    public static int getX() {

        return x;
    }

    public static int getY() {

        return y;
    }

    public static int move(char arg){
        if (arg == 'w') {
            y++;
            return getY();
        } else if (arg == 's') {
            y--;
            return getY();
        } else if (arg == 'a') {
            x--;
            return getX();
        } else if (arg == 'd') {
            x++;
            return getX();
        } else {
            return 0;
        }
    }
}
