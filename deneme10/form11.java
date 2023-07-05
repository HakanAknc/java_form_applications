package deneme10;

import javax.swing.*;

public class form11 extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JCheckBox internetCheckBox;
    private JCheckBox sinemaCheckBox;
    private JCheckBox müzikCheckBox;
    private JRadioButton erkekRadioButton;
    private JRadioButton kadınRadioButton;
    private JCheckBox tiyatroCheckBox;
    private JButton gönderButton;
    private JComboBox comboBox1;

    form11(){
        add(panel);
        setTitle("Kullanıcı girişi örneği");
        setSize(600,400);
    }
}
