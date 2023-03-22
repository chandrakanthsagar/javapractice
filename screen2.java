import  java.awt.*;
import javax.swing.*;
import  java.awt.event.*;
class screen2 extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5;
 JTextField t1,t2,t3,t4;
private Object u;
 screen2()
 {
  JButton u= new JButton("Generate ID");
  u.addActionListener(this);
  u.setBounds(50,500,300,50);
  t1=new JTextField();
  t2=new JTextField();
  t3=new JTextField();
  t4=new JTextField();
  l1=new JLabel("Address");
  l2=new JLabel("Pin code");
  l3=new JLabel("Purpose of Deforestation");
  l4=new JLabel("Estimated Land");
  l1.setBounds(50,100,100,40);
  l2.setBounds(50,150,100,40);
  l3.setBounds(50,200,200,40);
  l4.setBounds(50, 200, 100, 40);
  t1.setBounds(250,100,100,40);
t2.setBounds(250,150,100,40);
t3.setBounds(250,200,100,40);
t4.setBounds(250, 250, 100, 40);

  add(u);add(t1);add(t2);add(t3);add(t4);add(l1);add(l2);add(l3);add(l4);
  setSize(700,700);
  setVisible(true);
  setLayout(null);
 }
 public void actionPerformed(ActionEvent e){ 
     if(e.getSource()==u){
         screen3 jjj=new screen3();
     }
 }
 public static void main(String args[])
 {
  screen2 e1=new screen2();
 }
}
