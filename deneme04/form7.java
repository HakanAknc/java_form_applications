package deneme04;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class form7 extends JFrame{
    private JPanel panel;
    private JCheckBox pythonCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox cCheckBox;
    private JCheckBox cCheckBox1;
    private JCheckBox cCheckBox2;
    private JCheckBox HTMLCheckBox;
    private JCheckBox CSSCheckBox;
    private JCheckBox javaScriptCheckBox;
    private JCheckBox flutterCheckBox;

    form7(){
        add(panel);
        setTitle("CheckBox ve RadioButton");
        setSize(600,400);

        pythonCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (pythonCheckBox.isSelected()) System.out.println("Python seçildi");  //isSelected() true ve false değeri döndürür
                else System.out.println("Python seçimi iptal edildi");
            }
        });
        javaCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (javaCheckBox.isSelected()) System.out.println("Java seçildi");
                else System.out.println("Java seçimi iptal edildi");
            }
        });
        cCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (cCheckBox.isSelected()) System.out.println("C++ seçildi");
                else System.out.println("C++ seçimi iptal edildi");
            }
        });
    }
}
