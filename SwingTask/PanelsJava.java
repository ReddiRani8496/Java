import javax.swing.*;
import java.awt.*;

public class PanelsJava {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("smile.png");

        JLabel label = new JLabel();
        label.setText("Keep smiling :)");
        label.setIcon(image);
      //  label.setHorizontalAlignment(JLabel.RIGHT); // if layout is null, no need to write these
      //  label.setVerticalAlignment(JLabel.BOTTOM);
        label.setBounds(0,0,250,250);


        JPanel pinkpanel = new JPanel();
        pinkpanel.setBackground(Color.PINK);
        pinkpanel.setBounds(0,0,300,300);
        pinkpanel.setLayout(null);


        JPanel orangePanel = new JPanel();
        orangePanel.setBackground(Color.ORANGE);
        orangePanel.setBounds(300,0,300,300);
       // orangePanel.setLayout(new BorderLayout());
        orangePanel.add(label);
        orangePanel.setLayout(null);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,300,600,300);
      //  greenPanel.setLayout(new BorderLayout()); // to apply horizontal and vertical alignment  will apply
       // greenPanel.add(label);
        greenPanel.setLayout(null);



        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setTitle("Smile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pinkpanel);
        frame.add(orangePanel);
        frame.add(greenPanel);

    }
}
