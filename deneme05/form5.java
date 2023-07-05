package deneme05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form5 extends JFrame{
    private JPanel panel;
    private JButton button1;

    static boolean durum;

    form5(){
        add(panel);
        setTitle("Toggle Button");
        setSize(600,400);

        durum = true;

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (durum) {
                    panel.setBackground(new Color(25,25,25));
                    button1.setText("AYDINLIK");
                    durum=false;
                }else {
                    panel.setBackground(new Color(242,242,242));
                    button1.setText("KARANLIK");
                    durum=true;
                }
            }
        });
    }
}