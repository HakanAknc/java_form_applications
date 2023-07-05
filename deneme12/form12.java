package deneme12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form12 extends JFrame{
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    form12(){
        add(panel);
        setTitle("Deneme 12");
        setSize(500,500);

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                button1.setBackground(new Color(0,0,255));  // button da kalan renk iventi
                button1.setText("HAKAN AKINCI");
                super.mouseExited(e);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button1.setBackground(new Color(0,255,0));   // button üzerine gelince değişsen ivent
                button1.setText("Linkedin: hakanakinci7");
                super.mouseEntered(e);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                button1.setBackground(new Color(255,0,0));    // buttona basınca değişen renk iventi
                button1.setText("GitHub: HakanAknc");
                super.mouseReleased(e);
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                button2.setBackground(new Color(100,100,200));
                button2.setText("HAKAN AKINCI");
                super.mouseExited(e);
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button2.setBackground(new Color(200,100,15));
                button2.setText("Instagram: hakan_akinci7");
                super.mouseEntered(e);
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                button2.setBackground(new Color(255,120,150));
                button2.setText("Twitter: @hakan_akinci7");
                super.mouseReleased(e);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                button3.setBackground(new Color(155,155,5));
                button3.setText("HAKAN AKINCI");
                super.mouseExited(e);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button3.setBackground(new Color(45,78,150));
                button3.setText("Discord: Hakan_Akıncı#3434");
                super.mouseEntered(e);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                button3.setBackground(new Color(150,150,154));
                button3.setText("TAKİP ETMEYİ UNUTMAYIN :)  :)");
                super.mouseReleased(e);
            }
        });
    }
}
