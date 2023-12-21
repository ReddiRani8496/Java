import javax.swing.*;
import java.awt.*;

public class LayeredPaneEx {
    public static void main(String[] args) {
        JLabel label1 = new JLabel();
        label1.setBackground(Color.GREEN);
        label1.setOpaque(true);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setBackground(Color.RED);
        label2.setOpaque(true);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setBackground(Color.ORANGE);
        label3.setOpaque(true);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label3, Integer.valueOf(2));

        JFrame frame = new JFrame();
        frame.setSize(new Dimension(800,800));
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layeredPane);
    }
}
