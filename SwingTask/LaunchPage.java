import javax.swing.*;

public class LaunchPage {
    LaunchPage() {
        JFrame frame = new JFrame();
        JButton button = new JButton("New Window");

        button.setBounds(300,300,200,40);
        button.setFocusable(false);

        button.addActionListener(e ->{
            NewPage page = new NewPage();
            frame.dispose();
          //  button.setVisible(false);
        });

        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(button);
    }

}
