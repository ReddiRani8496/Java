import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Audio
{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        
        File file = new File("Dog.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(ais);
        clip.start(); // start the clip and terminates immediately, doesn't wait until the clip is completed

        for (int i = 0; i < 1000000000; i++) {
        }

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // we can make the clip to play and wait until input is taken from user

    }
}
