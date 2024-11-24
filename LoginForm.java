
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


 class LoginForm extends JFrame{

    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    LoginForm(){
        setSize(700,700);
        setTitle("Login Form");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       //setLayout(new BorderLayout(100,100));
      
       l1 = new JLabel("User Login");
       l2 = new JLabel("User Id");
       l3 = new JLabel("Password");


       
       t1 = new JTextField("Id");
       t2 = new JTextField("Password");

       b1 = new JButton("OK");
       b2= new JButton("Cancel");
       
     
       l2.setBounds(50, 50, 50, 50); 
       l3.setBounds(50, 200, 50, 50); 

       t1.setBounds(50, 150, 50, 50);
       t2.setBounds(150, 300, 50, 50);

       //b1.setBounds(150, 250,50,50);
       b2.setBounds(150, 350,50,50);

       add(b1);
       add(b2);

       //add(l1);
       add(l2);
       add(l3);

       add(t1);
       add(t2);

       setVisible(true);
    }


    public static void main(String[] args) {
        new LoginForm();
    }
}
