package deneme02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form2 extends JFrame{
    private JPanel panel;
    private JButton button1;
    private JLabel lbl1;

    form2(){
        add(panel);
        setTitle("Resimli Button 1");
        setSize(600,400);

        lbl1.setSize(200,90);  //labelin boyutu
        lbl1.setOpaque(true);

        Image kirmizi = new ImageIcon(this.getClass().getResource("/bkirmizi.png")).getImage();  //kırmızı
        lbl1.setIcon(new ImageIcon(kirmizi));

        Image mavi = new ImageIcon(this.getClass().getResource("/bmavi.png")).getImage();  //mavi

        Image yesil = new ImageIcon(this.getClass().getResource("/byesil.png")).getImage();   //yesil

        // Create Listener
        button1.addMouseListener(new MouseAdapter() {   // bu ivent buttonun üzerine gelince renk değiştiriyor
            @Override
            public void mouseEntered(MouseEvent e) {
                button1.setBackground(new Color(0,0,255));  //buttonun rengini değiştirdik
                super.mouseEntered(e);

            }
        });
        button1.addMouseListener(new MouseAdapter() {  // bu ivent buttonun üzerinden çekilince aynı rengine geri dönüyor
            @Override
            public void mouseExited(MouseEvent e) {
                button1.setBackground(new Color(255,0,0));
                super.mouseExited(e);
            }
        });
        button1.addMouseListener(new MouseAdapter() {  // bu ivent buttonu tıkladığında renk değiştirir çektiğinde geri döner
            @Override
            public void mouseReleased(MouseEvent e) {
                button1.setBackground(new Color(0,255,0));
                super.mouseReleased(e);
            }
        });
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbl1.setIcon(new ImageIcon(mavi));
                super.mouseEntered(e);
            }
        });
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                lbl1.setIcon(new ImageIcon(kirmizi));
                super.mouseExited(e);
            }
        });
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                lbl1.setIcon(new ImageIcon(yesil));
                super.mouseReleased(e);
            }
        });
    }
}
