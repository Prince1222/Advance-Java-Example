import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Simple extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3;
    Simple(){
        setSize(300,300);
        setLayout(new FlowLayout(300,150),CENTER);
        

        l1 = new JLabel ("Principal");
        l2 = new JLabel ("TIme");
        l3 = new JLabel ("Rate");
        l4 = new JLabel ("Result");
    }
}
