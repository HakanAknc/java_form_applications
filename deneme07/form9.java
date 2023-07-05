package deneme07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form9 extends JFrame{
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JPanel solpanel;
    private JPanel sagpanel;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton button6;

    boolean sol = true;
    boolean sag = true;

    form9(){
        add(panel);
        setTitle("Panel");
        setSize(600,400);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sol){
                    solpanel.setVisible(false);
                    sol = false;
                }else {
                    solpanel.setVisible(true);
                    sol = true;
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sag){
                    sagpanel.setVisible(false);
                    sag = false;
                }else {
                    sagpanel.setVisible(true);
                    sag = true;
                }
            }
        });
    }
}
