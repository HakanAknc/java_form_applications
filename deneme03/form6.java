package deneme03;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class form6 extends JFrame{
    private JPanel panel;
    private JComboBox comboBox1;

    DefaultComboBoxModel model = new DefaultComboBoxModel();

    form6(){
        add(panel);
        setTitle("Dinamik ComboBox 2");
        setSize(600,400);

        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Ali","Ayşe","Betül","Cihan"));
        model.addAll(isimler);
        comboBox1.setModel(model);
    }
}
