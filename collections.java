import java.awt.*;
import java.awt.event.*;

import java.util.Formattable;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class collections implements ActionListener,ItemListener
 {
     Frame f=new Frame();
     
    
    Label l1=new Label("Employee Name");
    Label l2=new Label("Employee ID");
    Label l3=new Label("Salary");
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    TextField t4=new TextField();
    TextField t5=new TextField();
    
    Label l4=new Label("GENDER");
    Label l5=new Label("WORKTIMINGS");
    Label l6=new Label("HOBIES");

    TextArea a1=new TextArea(1,1);

  Button b1=new Button("Submit");
  Button b2=new Button("close"); 
  Checkbox v1=new Checkbox("java");
  Checkbox v2=new Checkbox("Python");
  CheckboxGroup cbg=new CheckboxGroup();
  CheckboxGroup cb=new CheckboxGroup();
  

Checkbox k1=new Checkbox("Male",cbg,false);
Checkbox k2=new Checkbox("Female",cbg,false);
Checkbox k3=new Checkbox("other",cbg,false);
Checkbox p1=new Checkbox("MORNING",cb,false);
Checkbox p2=new Checkbox("AFTERNOON",cb,false);
Checkbox p3=new Checkbox("NIGHT",cb,false);
List u1=new List(5,true);


  collections(){
  f.add(a1);
  
 a1.setBounds(350,100,200,200);
 v1.setBounds(550,550,100,20);
 v2.setBounds(550,580,100,20);
 u1.add("PLAYING");
u1.add("SINGING");
u1.add("EATING ");
u1.add("SLEEPING");
u1.add("READING");
f.add(u1);



 l1.setBounds(50,100,100,20);
 l2.setBounds(50,140,100,20);
 l3.setBounds(50,180,100,20);
 l4.setBounds(50,220,100,20);
 l5.setBounds(50,320,100,20);
 t1.setBounds(160,100,100,20);
 t2.setBounds(160,140,100,20);
 t3.setBounds(160,180,100,20);
 t4.setBounds(160,220,100,20);
 t5.setBounds(160,300,100,20);
 u1.setBounds(160,380,100,40);
l6.setBounds(50,380,100,20);
f.add(l6);
 
 
 b1.setBounds(250, 550, 50, 25);
 
 b2.setBounds(350, 550, 50, 25);
     f.setLayout(null);
f.setVisible(true);
f.setSize(600,600);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(b1);
f.add( b2);
f.add(t4);
f.add(l5);
f.add(t5);


k1.setBounds(160,250,100,10);
k2.setBounds(160,260,100,10);
k3.setBounds(160,270,100,10);

p1.setBounds(160,330,100,10);
p2.setBounds(160,340,100,10);
p3.setBounds(160,350,100,10);
f.add(k1);
f.add(k2);
f.add(k3);
f.add(p1);
f.add(p2);
f.add(p3);







b1.addActionListener(this);
b2.addActionListener(this);
k1.addItemListener(this);
k2.addItemListener(this);
k3.addItemListener(this);
p1.addItemListener(this);
p2.addItemListener(this);
p3.addItemListener(this);




     }
     public void itemStateChanged(ItemEvent e){
        if(e.getSource()==k1)
        t4.setText(cbg.getSelectedCheckbox().getLabel());
  else if(e.getSource()==k2){
      t4.setText(cbg.getSelectedCheckbox().getLabel());
  }
  else {
      t4.setText(cbg.getSelectedCheckbox().getLabel());
  }
  


   if(e.getSource()==p1)
   {
       t5.setText(cb.getSelectedCheckbox().getLabel()+"\n");
   }
   else if(e.getSource()==p2){
    t5.setText(cb.getSelectedCheckbox().getLabel());
   }
    else{
        t5.setText(cb.getSelectedCheckbox().getLabel());
    }
     
        
    if(e.getSource()==v1){
        String x1=v1.getLabel();
        
    }
}

public void actionPerformed(ActionEvent e){
  String x=t1.getText();
  String y=t2.getText();
  String z=t3.getText();
  String p=t4.getText();
  String q=t5.getText();
  
  int ind[];
  ind=u1.getSelectedIndexes();
  String r="";
  for(int i=0;i<ind.length;i++){
      r=r+u1.getItem(i)+"\n";

  }
  
   
 
  

 if(e.getSource()==b1)
 {
    a1.setText(x+"\n"+ y+ "\n "+ z+ " \n"+p+"\n"+q+"\n"+r);
    
    
 }
 else{
     System.exit(0);
 }

    
    
}

    

    
    public static void main(String arfs[]) {
        collections c=new collections();
        
    }
}
