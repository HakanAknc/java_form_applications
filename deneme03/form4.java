package deneme03;

import javax.swing.*;

public class form4 extends JFrame{
    private JPanel panel;
    private JComboBox comboBox1;
    DefaultComboBoxModel model = new DefaultComboBoxModel();

    form4(){
        add(panel);
        setTitle("Dinamik ComboBox");
        setSize(600,400);

        model.addElement("Ankara");
        model.addElement("İstanbul");
        model.addElement("Konya");
        model.addElement("Antalya");
        model.addElement("Trabzon");
        comboBox1.setModel(model);
    }
}
