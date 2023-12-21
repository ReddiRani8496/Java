import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700,700);
       frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.GRAY);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
