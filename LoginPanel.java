import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class LoginPanel extends JPanel {
    
    public LoginPanel() {
        setLayout(new BorderLayout());
        
        // Create login components
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        
        // Create panel for login components
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 2));
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(new JLabel()); // Empty label for spacing
        loginPanel.add(loginButton);
        
        // Add login panel to the center of this panel
        add(loginPanel, BorderLayout.CENTER);
        
        // Add a border with 15px line on top
        Border border = BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(15, 0, 0, 0, Color.BLACK),
            BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setBorder(border);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new LoginPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
