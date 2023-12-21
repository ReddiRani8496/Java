import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelsGUI {
    public static void main(String[] args) {

//        frame.setResizable(false);
        ImageIcon image = new ImageIcon("cat.png");
        Border border = BorderFactory.createLineBorder(Color.BLUE,3);
        JLabel label = new JLabel();
        label.setText("Welcome to java swing");
       label.setIcon(image);
    //   label.setHorizontalAlignment(JLabel.CENTER); // left, right, center (set both image and text)
      //  label.setVerticalAlignment(JLabel.TOP); // top center bottom (set both image and text)
        label.setHorizontalTextPosition(JLabel.CENTER); // set text right, left, center
        label.setVerticalTextPosition(JLabel.TOP); // set text top, center, bottom
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Helvetica Neue",Font.BOLD,20));
        label.setBackground(Color.PINK); // set background color
        label.setOpaque(true); // display background color
        label.setIconTextGap(25); // set gap between icon and text
        label.setBorder(border); // set border for layout
      //  label.setBounds(30,0,600,600); // setting size of label and border will apply upto this

        JFrame frame = new JFrame();
        frame.setVisible(true);
      //  frame.setSize(900,900);
        frame.add(label);
     //   frame.setLayout(null); // to set size of label
        frame.pack(); // set the size of frame as much required
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
