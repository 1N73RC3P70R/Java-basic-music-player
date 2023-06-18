package org.example;

import javax.sound.sampled.Clip;
import java.util.Scanner;

public class UserInteraction {
    Clip clip;
    Scanner scanner = new Scanner(System.in);
    private final Music music;

    public UserInteraction(Music music) {
        this.music = music;
        this.scanner = new Scanner(System.in);
    }

    public String askUsername() {
        System.out.println("Who is starting up the program?\n");
        return this.scanner.nextLine();
    }

    public void display(final String text) {
        System.out.println(text);
    }

    public void loadingMessage() {
        System.out.println("Loading.");
        System.out.println("Loading..");
        System.out.println("Loading...");
    }

    public void ignitionKeyError() {
        System.out.println("Failed to load!\nError 001");
    }

    public void Controls() {
        System.out.println("Enter the number of the operation which you would like to execute.\n0. Exit\n1. Stop music\n2. Start music\n3. Repeat song");
        int choice = this.scanner.nextInt();
        while (choice >= 0) {
            switch (choice) {
                case 0:
                    return;
                case 1:
                    music.getClip().stop();
                    break;
                case 2:
                    music.getClip().start();
                    break;
                case 3:
                    music.getClip().setMicrosecondPosition(0);
                    music.getClip().start();
                    break;
                default:
                    System.out.println("Try again.");
            }
            choice = this.scanner.nextInt();
        }
    }
}

