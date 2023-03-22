import  java.awt.*;
import javax.swing.*;
import  java.awt.event.*;
class screen6 extends JFrame implements ActionListener
{
 JLabel l1;
 JTextField t1;
 screen6()
 {
  JButton b= new JButton("Download Certificate");
  b.addActionListener(this);
  b.setBounds(50,200,100,50);
  t1=new JTextField();
  l1=new JLabel("enter reference ID");
  l1.setBounds(50,100,100,20);
  t1.setBounds(150,100,100,20);
  add(b);add(t1);add(l1);
  setSize(700,700);
  setVisible(true);
  setLayout(null);
 }
 public void actionPerformed(ActionEvent e){ 
    
 }
 public static void main(String args[])
 {
  screen6 e1=new screen6();
 }
}