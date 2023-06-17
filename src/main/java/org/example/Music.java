package org.example;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Music {

    Clip clip;

    public Music() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        URL musicFile = getClass().getResource("/Ария.wav");
        try (AudioInputStream musicAudio = AudioSystem.getAudioInputStream(musicFile)) {
            clip = AudioSystem.getClip();
            clip.open(musicAudio);
        }
    }

    public void playMusic(){
//        while(!response.equals(""))
        if(clip!=null){
        clip.start();
    }else {throw new RuntimeException("The orchestra is on vacation.");}}
}

