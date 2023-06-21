package org.example;

import java.util.Scanner;

public class UserInteraction {
    private Scanner scanner = new Scanner(System.in);
    private final Music music;

    public UserInteraction(final Music music) {
        this.music = music;
        scanner = new Scanner(System.in);
    }

    public String askUsername() {
        System.out.println("Who is starting up the program?\n");
        return scanner.nextLine();
    }

    public void display(String text) {
        System.out.println(text);
    }

    public void loadingMessage() {
        try{System.out.println("Loading.");
        Thread.sleep(3000);
        System.out.println("Loading..");
            Thread.sleep(3000);
        System.out.println("Loading...");
            Thread.sleep(3000);
    } catch (InterruptedException e){;
        }}

    public void ignitionKeyError() {
        System.out.println("Failed to load!\nError 001");
    }

    public void Controls() {
        System.out.println("Enter the number of the operation which you would like to execute.\n0. Exit" +
                "\n1. Stop music\n2. Start music\n3. Repeat song");
        int choice = scanner.nextInt();
        while (choice >= 0) {
            switch (choice) {
                case 0:
                    return;
                case 1:
                    this.music.getClip().stop();
                    break;
                case 2:
                    this.music.getClip().start();
                    break;
                case 3:
                    this.music.getClip().setMicrosecondPosition(0);
                    this.music.getClip().start();
                    break;
                default:
                    System.out.println("Try again.");
            }
            choice = scanner.nextInt();
        }
    }
}

