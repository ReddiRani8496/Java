import javax.swing.*;
import java.awt.*;

public class CheckBoxImp extends JFrame {
    CheckBoxImp() {
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);

        ImageIcon close = new ImageIcon("close.png");
        ImageIcon tick = new ImageIcon("checkicon.png");

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Do you code?");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkBox.setIcon(close);
        checkBox.setSelectedIcon(tick);

        JButton button = new JButton();
        button.setText("Submit");
        button.addActionListener(e-> {
            System.out.println(checkBox.isSelected());
        });

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
