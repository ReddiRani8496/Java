import javax.swing.*;
import java.awt.*;

public class RadioButtonImp extends JFrame {
    RadioButtonImp() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setLayout(new FlowLayout());

        ImageIcon pizzaIcon = new ImageIcon("pizza.png");
        ImageIcon burgerIcon = new ImageIcon("burger.png");
        ImageIcon sliceIcon = new ImageIcon("slice.png");

        JRadioButton pizza = new JRadioButton("Pizza");
        JRadioButton burger = new JRadioButton("burger");
        JRadioButton slice = new JRadioButton("slice");

        pizza.setIcon(pizzaIcon);
        burger.setIcon(burgerIcon);
        slice.setIcon(sliceIcon);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizza);
        buttonGroup.add(burger);
        buttonGroup.add(slice);

        pizza.addActionListener(e->{
            System.out.println("You selected pizza");
        });

        burger.addActionListener(e->{
            System.out.println("You selected Burger");
        });

        slice.addActionListener(e->{
            System.out.println("You selected slice");
        });

        this.add(pizza);
        this.add(burger);
        this.add(slice);
    }
}
