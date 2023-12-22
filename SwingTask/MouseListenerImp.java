import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerImp extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon sad;
    ImageIcon anger;

    MouseListenerImp() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 500, 500);
     //   label.setBackground(Color.blue);
        label.setOpaque(true);
        label.addMouseListener(this);

        smile = new ImageIcon("smile.png");
        nervous = new ImageIcon("nervous.png");
        sad = new ImageIcon("sad.png");
        anger = new ImageIcon("anger.png");

        label.setIcon(smile);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        System.out.println("You clicked the mouse");
        label.setIcon(smile);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
      //  label.setBackground(Color.yellow);
        label.setIcon(nervous);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse");
       // label.setBackground(Color.green);
        label.setIcon(sad);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("You entered the component");
      //  label.setBackground(Color.blue);
        label.setIcon(anger);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        System.out.println("You exited the component");
       // label.setBackground(Color.red);
        label.setIcon(smile);
    }
}
