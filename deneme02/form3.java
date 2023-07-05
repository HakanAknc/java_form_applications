package deneme02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form3 extends JFrame{
    private JPanel panel;
    private JButton button1;

    form3(){
        add(panel);
        setTitle("Resimli Button 2");
        setSize(600,400);


        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button1.setBackground(new Color(0,0,255));  // buttonun üzerinden geçince renk değiştiren ivent
                super.mouseEntered(e);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                button1.setBackground(new Color(255,0,0));   // buttonda da kalan son renk iventi
                super.mouseExited(e);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                button1.setBackground(new Color(0,255,0));   // buttona basıldığı zaman renk değiştiren ivent
                super.mouseReleased(e);
            }
        });
    }
}
