package org.example;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LoadingScreen loadingScreen = new LoadingScreen();
        UserInteraction userInteraction = new UserInteraction();


        //Ignition key check
        if (loadingScreen.fileExists("SECRET FILE.txt")) {
            userInteraction.loadingMessage();

        } else {
            userInteraction.ignitionKeyError();
            return;
        }


        //Ask username
        String username = userInteraction.askUsername();

        try {
            Music song = new Music();
            song.playMusic();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        try {
            loadingScreen.writeToFile("Welcome.txt", "Welcome, " + username);
            String welcome = loadingScreen.readFromFile("Welcome.txt");
            userInteraction.display(welcome);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


        try {
            String ignitionKey = loadingScreen.readFromFile("SECRET FILE.txt");
            userInteraction.display(ignitionKey);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    while (true) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }}

}

