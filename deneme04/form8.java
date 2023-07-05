package deneme04;

import javax.swing.*;

public class form8 extends JFrame{
    private JPanel panel;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;

    form8(){
        add(panel);
        setTitle("RadioButton");
        setSize(600,400);

        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);
        bg.add(radioButton3);
        bg.add(radioButton4);
        bg.add(radioButton5);
        bg.add(radioButton6);

    }
}
