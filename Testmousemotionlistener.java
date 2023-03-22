
import java.awt.*;
import java.awt.event.*;
 class Testmousemotionlistener  extends Frame implements MouseMotionListener{
    Testmousemotionlistener(){
        addMouseMotionListener(this);  
          
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseDragged(MouseEvent e) {  
        Graphics g=getGraphics();  
        g.setColor(Color.green);  
        g.fillOval(e.getX(),e.getY(),10,10);  
    }  
    public void mouseMoved(MouseEvent e) 
{
	Graphics g=getGraphics();  
    g.setColor(Color.gray);  
    g.fillOval(e.getX(),e.getY(),10,10);
	
}
public static void main(String args[]) {
    new Testmousemotionlistener();
}  

    }
    

