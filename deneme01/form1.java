package deneme01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame{   // miras alındı
    private JPanel panel;
    private JButton btn1;

    form1(){
        add(panel);  // formun değişken ismi panel
        setTitle("İlk form uygulamamız"); //formun ismi
        setSize(600,400);  // formun boyutu

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setText("ONAY");
            }
        });
    }
}
