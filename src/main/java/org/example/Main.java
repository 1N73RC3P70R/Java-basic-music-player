package org.example;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Application Pulvinus = new Application();

        try {
            try {
                Pulvinus.startup();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedAudioFileException e) {
                throw new RuntimeException("Audio not supported.");
            } catch (LineUnavailableException e) {
                throw new RuntimeException("No more space available.");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}

