import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class AudioMethods
{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("Dog.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(ais);

        char ch='h';
        Scanner sc = new Scanner(System.in);

        while (ch != 'Q') {
            System.out.println("P for play, S for stop, R for reset, Q for quit");
            System.out.print("Enter your choice: ");
            ch = sc.next().charAt(0);
            if(ch>=97)
                ch -=32;
            switch (ch) {
                case 'P' -> clip.start();
                case 'S' -> clip.stop();
                case 'R' -> clip.setMicrosecondPosition(0);
                case 'Q' -> clip.close();
                default -> System.out.println("Invalid choice!");
            }

        }
        System.out.println("Byeeeeeee!");

    }
}
