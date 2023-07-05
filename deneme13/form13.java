package deneme13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class form13 extends JFrame{
    private JPanel panel;
    private JButton button1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;

    DefaultComboBoxModel kmodel = new DefaultComboBoxModel();
    DefaultComboBoxModel mmodel = new DefaultComboBoxModel();
    DefaultComboBoxModel ymodel = new DefaultComboBoxModel();

    static int k,m,y;

    form13(){
        add(panel);
        setTitle("Deneme 13");
        setSize(500,500);

        ArrayList<String> sayi = new ArrayList<>();
        for (int i=0; i<256; i++){
            sayi.add(Integer.toString(i));
        }
        kmodel.addAll(sayi);
        mmodel.addAll(sayi);
        ymodel.addAll(sayi);

        comboBox1.setModel(mmodel);
        comboBox2.setModel(kmodel);
        comboBox3.setModel(ymodel);

        comboBox1.setSelectedIndex(0);
        comboBox2.setSelectedIndex(0);
        comboBox3.setSelectedIndex(0);

        comboBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                k = (int) comboBox2.getSelectedIndex();
                m = (int) comboBox1.getSelectedIndex();
                y = (int) comboBox3.getSelectedIndex();
                button1.setBackground(new Color(k,m,y));
            }
        });
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                k = (int) comboBox2.getSelectedIndex();
                m = (int) comboBox1.getSelectedIndex();
                y = (int) comboBox3.getSelectedIndex();
                button1.setBackground(new Color(k,m,y));
            }
        });
        comboBox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                k = (int) comboBox2.getSelectedIndex();
                m = (int) comboBox1.getSelectedIndex();
                y = (int) comboBox3.getSelectedIndex();
                button1.setBackground(new Color(k,m,y));
            }
        });
    }
}
