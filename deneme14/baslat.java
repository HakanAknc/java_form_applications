package deneme14;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form14 f14 = new form14();
                f14.setVisible(true);
            }
        });
    }
}
