package deneme13;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form13 f13 = new form13();
                f13.setVisible(true);

                form14 f14 = new form14();
                f14.setVisible(true);

                form15 f15 = new form15();
                f15.setVisible(true);
            }
        });
    }
}
