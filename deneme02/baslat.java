package deneme02;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form2 f2 = new form2();
                f2.setVisible(true);

                form3 f3 = new form3();
                f3.setVisible(true);

                form4 f4 = new form4();
                f4.setVisible(true);
            }
        });
    }
}
