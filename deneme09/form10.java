package deneme09;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form10 extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JButton button1;

    form10(){
        add(panel);
        setTitle("Message Dialogs 1");
        setSize(600,400);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textField1.getText());
                if (a<0 || a>100){
                    JOptionPane.showMessageDialog(null,"Lütfen 0 ile 100 arasında sayı giriniz!","Hatalı sayı",JOptionPane.ERROR_MESSAGE);
                }else {
                    // yapılacak işlemler
                }
            }
        });
    }
}
