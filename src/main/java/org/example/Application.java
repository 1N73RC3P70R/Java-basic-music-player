package org.example;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Application {
    private final LoadingScreen fileHandler;
    private UserInteraction userInteraction;
    private Music song;

    public Application() {
        fileHandler = new LoadingScreen();
        userInteraction = new UserInteraction(song);
    }

    public void startup() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        //Ignition key check
        if (fileHandler.fileExists("SECRET FILE.txt")) {
            userInteraction.loadingMessage();

        } else {
            userInteraction.ignitionKeyError();
            return;
        }
        //Ask username
        String username = userInteraction.askUsername();


        try {
            fileHandler.writeToFile("Welcome.txt", "Welcome, " + username);
            String welcome = fileHandler.readFromFile("Welcome.txt");
            userInteraction.display(welcome);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


        try {
            String ignitionKey = fileHandler.readFromFile("SECRET FILE.txt");
            userInteraction.display(ignitionKey);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Music song = new Music();
        song.playMusic();
        userInteraction = new UserInteraction(song);
        userInteraction.Controls();

        System.out.println("Dosvidania!");
    }
}


