import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class projectGreen  extends JFrame implements ActionListener {
    

    JFrame j;
    JButton j1=new JButton("URBANFOREST");
    JButton j2=new JButton("GLADEPLACE");
    JButton j3=new JButton("DOWNLOAD PERMISSION CERTIFICATE");
    projectGreen(){
        j1.setBounds(150, 150, 200, 50);
        j2.setBounds(150, 250, 200, 50);
        j3.setBounds(150,350,200,50);
        add(j1);
        add(j2);
        add(j3);
        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);
        setLayout(null);
setVisible(true);
setSize(400,400);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==j1){
            screen2 t=new screen2();
        }
        if(e.getSource()==j2){
            screen4 t1=new screen4();
        }
        if(e.getSource()==j3){
            screen6 tt=new screen6();
        }
    }
public static void main(String agrs[]){
    new projectGreen();
}

}
