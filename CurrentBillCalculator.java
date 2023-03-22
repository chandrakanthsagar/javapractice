
import java.awt.*;
import java.awt.event.*;
public class CurrentBillCalculator implements ActionListener {
    Frame f=new Frame();
    Label l1=new Label("UNITS CHARGED");

    Label l2=new Label("Bill");
    TextField t1=new TextField();
    TextField t2=new TextField();
    Button b1=new Button("BILL");
    Button b2=new Button("CANCEL");
    CurrentBillCalculator(){
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,130,100,20);
        t1.setBounds(200,100,100,20);
         t2.setBounds(200,130,100,20);
        b1.setBounds(50,250,50,20);
        b2.setBounds(110,250,50,20);
        f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(b1);
f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(500,550);
    }   
    public void actionPerformed(ActionEvent e)
    {
    int n1=Integer.parseInt(t1.getText());
    double n2,x,y,z,t,k;
    if(n1<=50)
    {
    y=(n1*0.5);
    x=0.2*(n1*0.5);
    n2=x+y;
        
    }
   else if(n1<50 && n1<=100){
       y=50*0.5;
       x=(n1-50*0.75);
       z=0.2*(x+y);
       n2=x+y+z;
   }
   else if(n1<100 && n1<=250){
       y=50*0.2;
       x=100*0.75;
       z=(n1-150)*1.20;
       t=0.2*z;
       n2=x+y+z+t;
   }
    else {
        y=50*0.2;
        x=100*0.75;
        z=100*1.20;
        t=(n1-250)*1.50;
        k=0.2*t;
        n2=x+y+z+t+k;
    }

   
    if(e.getSource()==b1)

    {
    
    t2.setText(String.valueOf(n2));
}
if(e.getSource()==b2)
{
    System.exit(0);
}
    }
public static void main(String s[])
{
new CurrentBillCalculator();
}
}
    

