import java.awt.*;
import java.awt.event.*;

class Ep extends Frame implements ActionListener {
    Frame f = new Frame();
    Label l1 = new Label("username");
    Label l2 = new Label("password");
    Label l3 = new Label();
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    Button b1 = new Button("Enter");

    Ep() {
        l1.setBounds(30, 60, 70, 30);
        l2.setBounds(30, 100, 70, 30);
        l3.setBounds(100, 180, 150, 30);

        t1.setBounds(70, 60, 100, 30);
        t2.setBounds(70, 100, 100, 30);

        b1.setBounds(100, 150, 100, 30);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        b1.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300, 300);

    }

    public void actionPerformed(ActionEvent e) {
        l1.getText();
        l2.getText();
        l3.setText("data saved" + e.getSource());
    }

    public static void main(String[] args) {
        Ep e1 = new Ep();
    }
}
