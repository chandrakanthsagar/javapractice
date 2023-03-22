
import java.util.*;
import java.awt.*;
import java.awt.event.*;





public class TestMouseListener extends Frame implements MouseListener{
    Label j;
    TestMouseListener(){
        addMouseListener(this);
        j=new Label();
        j.setBounds(40,40,290,60);
        add(j);
        setSize(500,500);
        setLayout(null);
        setVisible(true);

    }


public void mouseEntered(MouseEvent k) {
    j.setText("mouse  curser entered into window");
    
}
public void mouseExited(MouseEvent k) {
    j.setText("mouse  curser entered outof window");
    
}
public void mousePressed(MouseEvent k) {
    j.setText("mouse  pressed");
    
}
public void mouseClicked(MouseEvent k) {
    j.setText("mouse  clicked");
}
public void mouseReleased(MouseEvent k) {
    j.setText("mouse  realesed");
    
}


public static void main(String args[]){
 new TestMouseListener();
}
}
