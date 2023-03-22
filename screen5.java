import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class screen5 extends JFrame {
    JLabel j1=new JLabel("UPLOADDETAILS");
    JLabel l1=new JLabel("PLACE-1");
  JLabel l2=new JLabel("PLACE-2");
  
  JLabel l3=new JLabel("PLACE-3");
  JLabel l4=new JLabel("PLACE-4");
  JTextField t1=new JTextField();
  JTextField t2=new JTextField();
  JTextField t3=new JTextField();
  JTextField t4=new JTextField();
  screen5(){
    l1.setBounds(50,100,100,40);
    l2.setBounds(50,150,100,40);
    l3.setBounds(50,200,100,40);
    l4.setBounds(50, 250, 100, 40);
    t1.setBounds(150,100,100,40);
t2.setBounds(150,150,100,40);
t3.setBounds(150,200,100,40);
t4.setBounds(150, 250, 100, 40);
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(t3);
add(t4);
setLayout(null);
setVisible(true);
setSize(500,500);
  }
  public static void main(String args[]){
      new screen5();
  }
}

