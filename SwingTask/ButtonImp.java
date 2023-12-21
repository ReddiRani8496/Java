import javax.swing.*;
import java.awt.*;

public class ButtonImp extends JFrame {
    ButtonImp() {

        ImageIcon image = new ImageIcon("smileheart.png");

        JLabel label = new JLabel();
        label.setBounds(450,600,700,700);
        label.setIcon(image);
        label.setVisible(false);

        JButton button = new JButton();
        button.setText("Click Me!");
        button.setBounds(600,400,250,200);
        button.setFocusable(false);
        button.setForeground(Color.MAGENTA);
        button.setFont(new Font("Comic Sans",Font.BOLD,30));
        button.setBackground(Color.lightGray);
        button.addActionListener(e -> {
           // System.out.println("clicked me");
           // button.setIcon(image);
            label.setVisible(true);
           // button.setVisible(false); not visible on frame
            button.setEnabled(false); // button is disabled once it is clicked
        });
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setVisible(true);
        this.setSize(1500,1500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button);
        this.add(label);

    }
}
