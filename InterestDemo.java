import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InterestDemo extends JFrame implements ActionListener
{
    JLabel l1, l2, l3,l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3;

    public InterestDemo(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER,150,10));

        l1 = new JLabel("Principle");
        l2= new JLabel("Time");
        l3= new JLabel("Rate");
        l4= new JLabel("Result");


        t1= new JTextField(10);
        t2= new JTextField(10);
        t3= new JTextField(10);
        t4= new JTextField(10);

        b1=new  JButton("Simple Intrest");
        b2= new JButton("Amount");
        b3 = new JButton("Clear");

      

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener((ActionListener)this);
        b2.addActionListener((ActionListener) this);
        b3.addActionListener((ActionListener)this);

        //setSize(400, 300);
        setVisible(true);


    }

       public void actionPerformed(ActionEvent ax)
       {
        	float x, y, z, r,a;
		x = Float.parseFloat(t1.getText());			
		y = Float.parseFloat(t2.getText());	
        z = Float.parseFloat(t3.getText());

        if(ax.getSource()==b1){
            r= x*y*z/100;
            t4.setText(String.valueOf(r));
        }

        else if(ax.getSource() ==b2){
            r= x+(x*y*z/100);
            t4.setText(String.valueOf(r));
        }
        else{
            
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
       }

            

        }
        public static void main(String[] args) {
            new InterestDemo();
        }
        

}
