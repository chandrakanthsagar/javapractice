import java.awt.*;
import java.util.*;
import java.awt.event.*;
class Tables implements ActionListener
{
	Frame f=new Frame("Table Calci");
	Button b1=new Button("GET");
	Label l1=new Label("enter a table digit");
	TextField tf=new TextField();
	TextArea ta=new TextArea();
	Tables()
	{
		l1.setBounds(50,50,150,20);
		tf.setBounds(250,50,50,20);
		b1.setBounds(250,250,30,20);
		ta.setBounds(350,100,50,20);
		f.add(b1);
		f.add(l1);
		f.add(tf);
		f.add(ta);
		f.setSize(600,600);
		f.setVisible(true);
		f.setLayout(null);
		b1.addActionListener(this);
	}

public void actionPerformed(ActionEvent e)
{
	int n1=Integer.parseInt(tf.getText());
	
	

	if(e.getSource()==b1)
	{
		for(int i=1;i<=10;i++)
		{
			 
			int x=n1*i;
		

			ta.setText(x+"\n");
		}
		
	}
}
public static void main(String args[])
{
	new Tables();
}
}