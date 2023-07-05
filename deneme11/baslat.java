package deneme11;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form11 f11 = new form11();
                f11.setVisible(true);

                form12 f12 = new form12();
                f12.setVisible(true);
            }
        });
    }
}
