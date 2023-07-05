package deneme11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form12 extends JFrame{
    private JPanel panel;
    private JButton BASButton;
    private JButton BASButton1;
    private JButton BASButton2;
    private JButton BASButton3;
    private JButton BASButton4;
    private JButton BASButton5;

    form12(){
        add(panel);
        setTitle("Final hazırlık 2");
        setSize(500,500);

        BASButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BASButton.setText("Hakan Akıncı");
            }
        });
        BASButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BASButton1.setText("Linkedin: hakanakinci7");
            }
        });
        BASButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BASButton2.setText("GitHub: HakanAknc");
            }
        });
        BASButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BASButton3.setText("Instagram: hakan_akinci7");
            }
        });
        BASButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BASButton4.setText("Twitter: @hakan_akinci7");
            }
        });
        BASButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BASButton5.setText("Discord: Hakan_Akıncı#3434");
            }
        });
    }
}
