import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    
    public FlowLayoutExample() {
        // Create a new JFrame
        JFrame frame = new JFrame("FlowLayout Example");
        
        // Create a panel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());
        
        // Add components to the panel
        panel.add(new JButton("Button 1"));
        panel.add(new JTextField(""));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Set frame properties
        frame.setSize(250, 150); // Set size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true); // Make the frame visible
    }
    
    public static void main(String[] args) {
        // Create the GUI on the event dispatch thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FlowLayoutExample();
            }
        });
    }
}
