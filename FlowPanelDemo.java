import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

 class FlowPanelDemo extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6;

  public FlowPanelDemo(){
    setSize(500,200);
    setTitle("Flow Panel Demo");
    setLayout(new FlowLayout(FlowLayout.LEFT));
    b1= new JButton("Button 1");
    b2= new JButton("Button 2");
    b3= new JButton("Button 3");
    b4= new JButton("This is Button four");
    b5= new JButton("5");
    b6= new JButton(" Button six");
    
   add(b1);
   add(b2);
   add(b3);
   add(b4);
   add(b5);
   add(b6);
   setVisible(true);

  }
  public static void main(String[] args) {
   new FlowPanelDemo();
      
  }
}