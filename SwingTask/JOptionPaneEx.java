import javax.swing.*;

public class JOptionPaneEx {
    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompts user for a value or informs them of something

      //  JOptionPane.showMessageDialog(null,"this is a sample message","title",JOptionPane.PLAIN_MESSAGE);
      //  JOptionPane.showMessageDialog(null,"this is a sample message","title",JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null,"Is it?","title",JOptionPane.QUESTION_MESSAGE);
       // JOptionPane.showMessageDialog(null,"Is it?","title",JOptionPane.WARNING_MESSAGE);
       // JOptionPane.showMessageDialog(null,"Is it?","title",JOptionPane.ERROR_MESSAGE);
       // System.out.println(JOptionPane.showConfirmDialog(null,"Do you eat?","This is my title",JOptionPane.YES_NO_OPTION));
//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello "+name);
        String responses[] = {"yeah you will code","thank you!","Blush"};
        ImageIcon icon = new ImageIcon("smile.png");
        JOptionPane.showOptionDialog(null,"R u code?","my title",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,responses,0);
    }
}
