import javax.swing.*;
import java.awt.*;

public class SliderImp extends JFrame {
    SliderImp() {
        JFrame frame = new JFrame("Slider Demo");
        JPanel panel = new JPanel();
        JLabel label= new JLabel();
        JSlider slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);

        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        slider.setOrientation(SwingConstants.VERTICAL);

        label.setFont(new Font("MV Boli",Font.BOLD,15));
        label.setText("°C = "+slider.getValue());

        slider.addChangeListener(e->{
            label.setText("°C = "+slider.getValue());
        });

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
