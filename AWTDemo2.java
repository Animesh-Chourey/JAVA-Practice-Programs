//Create a window also which does not close on clicking i close button
import java.awt.*;
public class AWTDemo2
{
 public static void main(String args[])
 {
  Frame f1=new Frame();
  f1.setVisible(true);
  f1.setSize(500,500);
  f1.setTitle("Indore");
  f1.setLayout(null);
  f1.setBackground(Color.yellow);
  
  Label l1=new Label();
  l1.setText("Welcome Java");
  l1.setBounds(200,150,100,20);
  l1.setForeground(Color.red);
  f1.add(l1);
 }
}