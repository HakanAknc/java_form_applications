package deneme05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form6 extends JFrame{
    private JPanel panel;
    private JPasswordField passwordField1;
    private JButton button1;

    form6(){
        add(panel);
        setTitle("PasswordField");
        setSize(600,400);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] ps = passwordField1.getPassword();
                button1.setText(ps.toString());
            }
        });
    }
}
