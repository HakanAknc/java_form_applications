package deneme12;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form12 f12 = new form12();
                f12.setVisible(true);

                form13 f13 = new form13();
                f13.setVisible(true);
            }
        });
    }
}
