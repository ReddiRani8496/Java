import javax.swing.*;

public class NewPage {
    NewPage() {
        JFrame frame = new JFrame();

        JLabel label = new JLabel("Hello World");
        label.setBounds(300,300,300,40);
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);
    }
}
