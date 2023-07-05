package deneme03;

import javax.swing.*;

public class form8 extends JFrame{
    private JPanel panel;
    private JSpinner spinner1;

    SpinnerNumberModel model = new SpinnerNumberModel();

    form8(){
        add(panel);
        setTitle("Spinner");
        setSize(600,400);

        model.setMinimum(0);
        model.setMaximum(100);
        model.setStepSize(3);
        spinner1.setModel(model);
    }
}
