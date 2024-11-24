import java.awt.*;
import javax.swing.*;

public class CustomPanel extends JPanel{
    @Override
    protected  void paintComponent(Graphics g){
        super.paintComponent(g);
        //custom drawing code
        g.setColor(Color.BLUE);
        g.fillRect(50,50,100,100);
        g.fillOval(100, 150,100,100);   
        g.fillArc(50,150,100,200,0,90);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Panel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        
        CustomPanel cp = new CustomPanel();
        frame.add(cp);
        frame.setVisible(true);
    }
}