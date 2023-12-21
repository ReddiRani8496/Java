import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(800,800);
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Welcome to Java Swing");
        JLabel label1 = new JLabel("Welcome to Java Swing Gui world");
        frame.add(label);
        frame.add(label1);
   //     frame.getContentPane().setBackground(Color.white);
        ImageIcon imageIcon = new ImageIcon("Dog.jpg");
        frame.setIconImage(imageIcon.getImage());

        frame.setTitle("Dog frame");
//        frame.getDefaultCloseOperation();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}