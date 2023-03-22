import java.awt.*;
import java.awt.event.*;
import java.security.KeyPairGenerator;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
public class login extends Frame implements ActionListener{
    Frame f=new Frame("SIGN INTO ACCOUNT");

   
      Button b=new Button("LOGIN");
     Label l1=new Label("USERNAME");
      Label l2 = new Label("PASSWORD");
      Label l3=new Label();
     TextField t1=new TextField();
     TextField t2=new TextField();
    login(){
        l1.setBounds(50,100,100,30);
        l2.setBounds(50, 150, 100, 30);
        t1.setBounds(200, 100, 150, 30);
        t2.setBounds(200, 150, 150, 30);
        b.setBounds(250, 250, 100, 30);
        l3.setBounds(250, 300, 350, 30);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(l3);
        f.add(b);
        b.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
    }
    public void actionPerformed(ActionEvent e){
        String x="Nani_123";
        String y="ram123";
       
        String z=t1.getText();
        String k=t2.getText();
    
       

        if(z.equals(x)){
                if(k.equals(y))
                
                        l3.setText("Your details is valid,procceed to login");
        }
         else
         l3.setText("Your username is invalid");
    
    }
    public static void main(String ars[]){
        new login();
    }

}