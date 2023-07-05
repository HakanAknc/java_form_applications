package deneme07;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form7 f7 = new form7();
                f7.setVisible(true);

                form8 f8 = new form8();
                f8.setVisible(true);

                form9 f9 = new form9();
                f9.setVisible(true);

                form10 f10 = new form10();
                f10.setVisible(true);

                form11 f11 = new form11();
                f11.setVisible(true);

                form12 f12 = new form12();
                f12.setVisible(true);
            }
        });
    }
}
