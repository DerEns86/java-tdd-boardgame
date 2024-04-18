package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a key: ");
        char input = getInput();
        PlayerCharacter.move(input);
        System.out.println(PlayerCharacter.x + " " + PlayerCharacter.y);
    }

    public static char getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}