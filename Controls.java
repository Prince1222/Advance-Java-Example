import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Controls extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    public Controls() {
        super("Login Form");
        
        // Initialize components
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        
        // Set layout
        setLayout(new GridLayout(3, 1));
        
        // Add components to the frame
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginButton);
        
        // Add action listener to login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                // For simplicity, let's hardcode a valid username and password
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login Failed. Invalid username or password.");
                }
            }
        });
        
        // Set frame properties
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Create the login form frame
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm();
            }
        });
    }
}
