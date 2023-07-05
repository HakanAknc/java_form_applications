package deneme01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class form2 extends JFrame{
    private JPanel panel;
    private JButton btn1;

    form2(){
        add(panel);
        setTitle("İkinci form uygulamamız");
        setSize(600,400);

        Random r = new Random();

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sayi = r.nextInt(100);
                btn1.setText(Integer.toString(sayi));

            }
        });
    }
}
