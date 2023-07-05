package deneme13;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class form14 extends JFrame{
    private JPanel panel;
    private JSlider rs;
    private JSlider gs;
    private JSlider bs;
    private JButton button1;

    static int r,g,b;

    form14(){
        add(panel);
        setTitle("Deneme 14");
        setSize(500,500);

        r=g=b=0;

        rs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                r = (int) rs.getValue();
                g = (int) gs.getValue();
                b = (int) bs.getValue();
                button1.setBackground(new Color(r,g,b));
                rs.setBackground(new Color(r,g,b));
                button1.setText(Integer.toString(r)+"-"+Integer.toString(g)+"-"+Integer.toString(b));
            }
        });
        gs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                r = (int) rs.getValue();
                g = (int) gs.getValue();
                b = (int) bs.getValue();
                button1.setBackground(new Color(r,g,b));
                gs.setBackground(new Color(r,g,b));
                button1.setText(Integer.toString(r)+"-"+Integer.toString(g)+"-"+Integer.toString(b));
            }
        });
        bs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                r = (int) rs.getValue();
                g = (int) gs.getValue();
                b = (int) bs.getValue();
                button1.setBackground(new Color(r,g,b));
                bs.setBackground(new Color(r,g,b));
                button1.setText(Integer.toString(r)+"-"+Integer.toString(g)+"-"+Integer.toString(b));
            }
        });
    }
}
