import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Flowlayout extends JFrame{
    Label j;
    
    Flowlayout(){
        JButton b1=new JButton("North");
        JButton b2 =new JButton ("south");
        JButton b3=new JButton("west");
        JButton b4 =new JButton ("east");

        
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(500,500);
        
    }
    public static void main(String args[]) {
        new Flowlayout();
    }
}

        
    
