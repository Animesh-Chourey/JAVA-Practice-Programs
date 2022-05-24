import java.awt.*;
import java.awt.event.*;
public class AWTDemo3 implements WindowListener
{
 public void fun()
 {
  Frame f1=new Frame();
  f1.setBackground(Color.blue);
  f1.setVisible(true);
  f1.setSize(400,300);
  f1.setTitle("Indore");
  f1.addWindowListener(this);
 }
 public static void main(String args[])
 {
  AWTDemo3 obj=new AWTDemo3();
  obj.fun();
 }
 
 public void windowClosing(WindowEvent e)
 {
  System.exit(0);
 }
 public void windowDeactivated(WindowEvent e)
 {
  
 }
 public void windowActivated(WindowEvent e)
 {
  //System.exit(0);
 }
 public void windowDeiconified(WindowEvent e)
 {
  //System.exit(0);
 }
 public void windowIconified(WindowEvent e)
 {
  //System.exit(0);
 }
 public void windowClosed(WindowEvent e)
 {
  //System.exit(0);
 }
 public void windowOpened(WindowEvent e)
 {
  //System.exit(0);
 }
}
