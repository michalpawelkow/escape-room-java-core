package gra.service;


import gra.model.Thing;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public final class Controller {

    private static Scanner scanner = new Scanner(System.in);
    private Game game;

    public Controller(Game game) {
        this.game = game;
    }

    public void startGame() {
        do {
            startMenu();
        } while (game.isRunning());
    }

    public void startMenu() {
        printOptions();
        try {
            int input = getPlayerInput();
            System.out.println(game.useThing(input - 1));
        } catch (InputMismatchException e) {
            System.out.println("YOU MUST TO WRITE A NUMBER!");
        } catch (ThingNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printOptions() {
        System.out.println("CHOOSE WHAT YOU WANT TO DO:");
        List<Thing> thingsInRoom = game.getThingsToPrint();
        System.out.println(game.getThingsInPlayer());
        for (int i = 0; i < thingsInRoom.size(); i++) {
            System.out.println(i + 1 + " " + thingsInRoom.get(i));
        }
    }



    public static int getPlayerInput() {
        return scanner.nextInt();
    }


}


