import java.awt.*;
import java.awt.event.*;
 
class InterstCalculator implements ActionListener
{
//Declaring Objects
Frame f=new Frame();
Label l1=new Label("PRINCIPAL AMOUNT");
Label l2=new Label("TIME");
Label l3=new Label("RATE");
Label l4=new Label("INTERST");
Label l5=new Label("TOTAL AMOUNT");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
TextField t4=new TextField();
TextField t5=new TextField();
Button b1=new Button("INTERST");
Button b2=new Button("TOTAL AMOUNT");

Button b3=new Button("Cancel");
InterstCalculator()
{
//Giving Coordinates
l1.setBounds(50,100,100,20);
l2.setBounds(50,130,100,20);
l3.setBounds(50,160,100,20);
l4.setBounds(50,190,100,20);
l5.setBounds(50,210,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,130,100,20);
t3.setBounds(200,160,100,20);
t4.setBounds(200,190,100,20);
t5.setBounds(200,210,100,20);
b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);

b3.setBounds(170,250,50,20);
//Adding components to the frame
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(t4);
f.add(t5);
f.add(b1);
f.add(b2);
f.add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

f.setLayout(null);
f.setVisible(true);
f.setSize(600,600);
}
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
int n3=Integer.parseInt(t3.getText());
if(e.getSource()==b1)
{
t4.setText(String.valueOf((n1*n2*n3)/100));
}
if(e.getSource()==b2)
{
t5.setText(String.valueOf(n1+((n1*n2*n3)/100)));
}

if(e.getSource()==b3)
{
System.exit(0);
}
}
public static void main(String...s)
{
new InterstCalculator();
}
}