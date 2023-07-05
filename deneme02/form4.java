package deneme02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form4 extends JFrame{
    private JPanel panel;
    private JLabel lbl1;

    form4(){
        add(panel);
        setTitle("Resimli Button 3");
        setSize(600,400);

        lbl1.setSize(200,90);
        lbl1.setOpaque(true);

        Image kirmizi = new ImageIcon(this.getClass().getResource("/bkirmizi.png")).getImage();  //kırmızı
        lbl1.setIcon(new ImageIcon(kirmizi));

        Image mavi = new ImageIcon(this.getClass().getResource("/bmavi.png")).getImage();  //mavi

        Image yesil = new ImageIcon(this.getClass().getResource("/byesil.png")).getImage();   //yesil

        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbl1.setIcon(new ImageIcon(mavi));     // mouse üzerinden geçince renk değiştiren ivent
                super.mouseEntered(e);
            }
        });
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                lbl1.setIcon(new ImageIcon(kirmizi));   // kalan renk iventi
                super.mouseExited(e);
            }
        });
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                lbl1.setIcon(new ImageIcon(yesil));    // basıldığı zaman renk değiştiren ivent
                super.mouseReleased(e);
            }
        });
    }
}
