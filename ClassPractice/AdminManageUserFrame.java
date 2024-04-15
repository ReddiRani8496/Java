package ClassPractice;
import javax.swing.*;
import java.awt.*;

// Admin Interface Frames
class AdminManageUserFrame extends JFrame {
    // UI components for managing users
    private JTable userTable;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;

    public AdminManageUserFrame() {
        // Initialize UI components
        userTable = new JTable();
        addButton = new JButton("Add User");
        updateButton = new JButton("Update User");
        deleteButton = new JButton("Delete User");

        // Layout
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(userTable), BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        this.add(panel);
        this.setTitle("Manage Users");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}