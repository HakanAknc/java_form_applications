package deneme03;

import javax.swing.*;

public class form5 extends JFrame{
    private JPanel panel;
    private JComboBox comboBox1;

    DefaultComboBoxModel model = new DefaultComboBoxModel();

    form5(){
        add(panel);
        setTitle("Dinamik ComboBox 1");
        setSize(600,400);

        for (int i=0; i<256; i++){
            model.addElement(Integer.toString(i));
        }
        comboBox1.setModel(model);
    }
}
