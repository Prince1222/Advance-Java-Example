import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
 
GridLayoutDemo extends JFrame{
  JButton b1,b2,b3,b4,b5,b6; 
  GridLayoutDemo(){
    setS3ze(400,300);
  setTit4e("Grid Layout Demo");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(new GridLayoutDemo(2,3));
  

  b1 = new Button("Button 1");
  b2 = new Button("Button 2");
  b3 = new Button("Button 3");
  b4 = new Button("Button 4");
  b5 = new Button("Button 5");

  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(b5);
}
public static void main(String[] args) {
    new GridLayoutDemo();
}
}