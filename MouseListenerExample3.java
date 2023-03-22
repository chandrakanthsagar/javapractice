import java.awt.*;  
import java.awt.event.*;  
public class MouseListenerExample3 extends Frame implements MouseListener,MouseMotionListener{  
    Frame f=new Frame("mouse listener Actions");
    Label j;
    MouseListenerExample3(){  

        
        addMouseListener(this);  
		addMouseMotionListener(this);
        j=new Label();
        j.setBounds(40,40,290,60);
        add(j);
          
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        Graphics g=getGraphics();  
        g.setColor(Color.black);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }  
    public void mouseEntered(MouseEvent e) {
        j.setText("mouse  curser entered into window");
    }  
    public void mouseExited(MouseEvent e) {
        j.setText("mouse  curser entered outof window");
    }  
    public void mousePressed(MouseEvent e) {
        j.setText("mouse  pressed");
    }  
    public void mouseReleased(MouseEvent e) {
        j.setText("mouse  realesed");
    } 
	//mouse motion listener methods
	public void mouseDragged(MouseEvent e) {  
    Graphics g=getGraphics();  
    g.setColor(Color.green);  
    g.fillOval(e.getX(),e.getY(),20,20);  
}  
public void mouseMoved(MouseEvent e) 
{
	Graphics g=getGraphics();  
    g.setColor(Color.RED);  
    g.fillOval(e.getX(),e.getY(),20,20);
	
}  
      
public static void main(String[] args) {  
    new MouseListenerExample3();  
}  
}   