import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerImp extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;
    KeyListenerImp() {
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1600,1600);
        this.addKeyListener(this);
        icon = new ImageIcon("car.png");
        label = new JLabel();
        label.setBounds(0,0,900,900);
        label.setIcon(icon);
        label.setBackground(Color.black);
        label.setOpaque(true);
        this.add(label);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a' -> label.setLocation(label.getX() - 20, label.getY());
            case 'd' -> label.setLocation(label.getX() +20, label.getY());
            case 'w' -> label.setLocation(label.getX(), label.getY() - 20);
            case 's' -> label.setLocation(label.getX(), label.getY() + 20);

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37 -> label.setLocation(label.getX() - 10, label.getY());
            case 39 -> label.setLocation(label.getX() + 10, label.getY());
            case 38 -> label.setLocation(label.getX(), label.getY() - 10);
            case 40 -> label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
