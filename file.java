import java.awt.*;
import java.awt.event.*;

public class file  extends Frame {
Frame f=new Frame();

    file(){
        Checkbox c2=new Checkbox();
        

        Checkbox c1=new Checkbox("geder");
        Checkbox c3=new Checkbox("skjsljf",true);
        Checkbox c4=new Checkbox("hhdh",null,true);
        CheckboxGroup cbg;
        cbg =new CheckboxGroup();
        Checkbox k1=new Checkbox("Male",cbg,true);
        Checkbox k2=new Checkbox("Female",cbg,false);
        Checkbox k3=new Checkbox("other",cbg,false);
        TextArea a1=new TextArea("");
        TextArea a2=new TextArea("ramaaajlj");
        TextArea a3=new TextArea(3,4);
        f.add(a1);
        f.add(a2);
        f.add(a3);

        f.add(c1);
        f.add(c2);
        f.add(c3);
       f. add(c4);
       f.add(k1);
       f.add(k2);
       f.add(k3);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        c1.setBounds(50,100,100,10);
        c2.setBounds(50,180,100,80);
        c3.setBounds(50,280,100,700);
        c4.setBounds(50,180,100,20);
        k1.setBounds(160,100,100,20);
        k2.setBounds(160,140,100,20);
        k3.setBounds(160,180,100,20);
        a1.setBounds(350,100,100,80);
        a2.setBounds(350,240,100,80);
        a3.setBounds(350,380,100,80);
    }
    public static void main(String arg[]){
        file n=new file();
    }

    
}
