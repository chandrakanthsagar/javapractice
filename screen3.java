import  java.awt.*;
import javax.swing.*;
import  java.awt.event.*;
class screen3 extends JFrame
{
 JLabel l1;
 JTextField t1;
 screen3()
 {
  
 
  t1=new JTextField("project21233434");
  l1=new JLabel(" Reference Unique ID");
  t1.setBounds(250,100,200,50);
  l1.setBounds(50,100,100,50);
  add(t1);add(l1);
  setSize(700,700);
  setVisible(true);
  setLayout(null);
 }

 public static void main(String args[])
 {
  screen3 e1=new screen3();
 }
}
