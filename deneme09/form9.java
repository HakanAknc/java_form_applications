package deneme09;

import javax.swing.*;

public class form9 extends JFrame{
    private JPanel panel;

    form9(){
        add(panel);
        setTitle("Message Dialogs");
        setSize(600,400);  // Formdan önce ekrana mesj verir

        JOptionPane.showMessageDialog(null,"Form şu an oluştu!","Form oluşumu",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Form şu an oluştu!","Form oluşumu",JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Form şu an oluştu!","Form oluşumu",JOptionPane.OK_OPTION);
    }
}
