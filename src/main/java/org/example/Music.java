package org.example;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class Music {

    Clip clip;
    String filePathReplace;
    URL musicFile;

    public Music() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        musicFile = getClass().getResource("/Ария.wav");
        filePathReplace = musicFile.toString().replace(".wav", "");

        try (AudioInputStream musicAudio = AudioSystem.getAudioInputStream(musicFile)) {
            clip = AudioSystem.getClip();
            clip.open(musicAudio);

        }
    }

    public Clip getClip() {
        return clip;
    }

    public void playMusic() {
        if (clip != null) {
            if (clip.isRunning()) {
                clip.stop();
            }
            clip.setMicrosecondPosition(0);
            clip.start();
            File musicFileObj = new File(musicFile.getFile());
            String songNameEncoded = musicFileObj.getName();
            String songName = null;
            songName = URLDecoder.decode(songNameEncoded, StandardCharsets.UTF_8);
            System.out.println("Currently playing: " + songName.replace(".wav", ""));
        } else {
            throw new RuntimeException("The orchestra is on vacation.");
        }
    }
}


