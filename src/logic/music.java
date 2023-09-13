package logic;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class music {
    Clip clip;
    AudioInputStream sound;
    public void setFile(String soundFileName) {
        try {
            File file = new File(soundFileName);
            System.out.println(file.canRead());
            sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e) {
        }
    }
    public void play() {
        clip.start();
    }
    public void stop() throws IOException {
        sound.close();
        clip.close();
        clip.stop();
    }
}
