import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseColorImp extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ChooseColorImp() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(800,800);

        button = new JButton("Pick a Color");
        label = new JLabel();
        label.setText("You choose color: ");
        label.setFont(new Font(null,Font.PLAIN,80));
        label.setBackground(Color.white);
        label.setOpaque(true);
        button.addActionListener(this);
        this.add(button);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"Pick a color",Color.BLACK);
            label.setBackground(color);
        }

    }
}
