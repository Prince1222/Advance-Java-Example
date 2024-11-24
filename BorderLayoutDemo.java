import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


class BorderLayoutDemo extends JFrame{

    JButton b1,b2,b3,b4,b5;
    BorderLayoutDemo(){
        setSize(500,300);
        setTitle("Border Layout Format");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(30,30));

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}