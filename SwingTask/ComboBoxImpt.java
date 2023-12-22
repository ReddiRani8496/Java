import javax.swing.*;
import java.awt.*;

public class ComboBoxImpt extends JFrame {
    ComboBoxImpt() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[] animals = {"Dog","Rabbit","Monkey"};
        JComboBox comboBox= new JComboBox(animals);

        comboBox.addActionListener(e->{
            System.out.println(comboBox.getSelectedItem());
        });

       // System.out.println(comboBox.getItemCount());
        comboBox.addItem("cat");
        comboBox.insertItemAt("horse",0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("cat");
        comboBox.removeItemAt(1);
        comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }
}
