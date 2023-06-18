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

        this.musicFile = this.getClass().getResource("/Ария.wav");
        this.filePathReplace = this.musicFile.toString().replace(".wav", "");

        try (final AudioInputStream musicAudio = AudioSystem.getAudioInputStream(this.musicFile)) {
            this.clip = AudioSystem.getClip();
            this.clip.open(musicAudio);

        }
    }

    public Clip getClip() {
        return this.clip;
    }

    public void playMusic() {
        if (this.clip != null) {
            this.clip.start();
            final File musicFileObj = new File(this.musicFile.getFile());
            final String songNameEncoded = musicFileObj.getName();
            String songName = null;
            songName = URLDecoder.decode(songNameEncoded, StandardCharsets.UTF_8);
            System.out.println("Currently playing: " + songName.replace(".wav", ""));
        } else {
            throw new RuntimeException("The orchestra is on vacation.");
        }
    }
}


