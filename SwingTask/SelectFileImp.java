import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SelectFileImp extends JFrame implements ActionListener {
    JButton button;
    SelectFileImp() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(400,400);
        button = new JButton("Choose File");
        button.addActionListener(this);
        this.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("/home/reddirani/Downloads"));
            int response = fileChooser.showOpenDialog(null);
            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
