import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Borderlayout extends JFrame{
    Label j;
    
    Borderlayout(){
        JButton b1=new JButton("North");
        JButton b2 =new JButton ("south");
        JButton b3=new JButton("west");
        JButton b4 =new JButton ("east");

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.WEST);
        add(b4,BorderLayout.EAST);
        setVisible(true);
        setSize(500,500);
        
    }
    public static void main(String args[]) {
        new Borderlayout();
    }
}

        
    