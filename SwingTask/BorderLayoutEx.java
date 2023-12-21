import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(new BorderLayout(10,10)); // to add margin between panel use hgap and vgap

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.PINK);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.RED);
        panel5.setBackground(Color.cyan);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.SOUTH);


        /* sub panel */
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.BLACK);
        panel7.setBackground(Color.GRAY);
        panel8.setBackground(Color.WHITE);
        panel9.setBackground(Color.RED);
        panel10.setBackground(Color.MAGENTA);

        panel6.setPreferredSize(new Dimension(100,100));
        panel7.setPreferredSize(new Dimension(100,100));
        panel8.setPreferredSize(new Dimension(100,100));
        panel9.setPreferredSize(new Dimension(100,100));
        panel10.setPreferredSize(new Dimension(100,100));

        panel3.setLayout(new BorderLayout());

        panel3.add(panel6,BorderLayout.NORTH);
        panel3.add(panel7,BorderLayout.WEST);
        panel3.add(panel8,BorderLayout.CENTER);
        panel3.add(panel9,BorderLayout.EAST);
        panel3.add(panel10,BorderLayout.SOUTH);

    }
}
