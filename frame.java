import javax.swing.*;

public class frame extends JFrame{
    JPanel p1;
    JButton b1;

    frame(){
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Form format");
        b1 = new JButton("Submit");
        setBounds(500,500,50,30);
        add(b1);
        setVisible(true);


    }
    public static void main(String[] args) {
        new frame();
    }
}