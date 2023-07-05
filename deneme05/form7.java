package deneme05;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class form7 extends JFrame{
    private JPanel panel;
    private JFormattedTextField formattedTextField1;
    private JButton button1;

    form7(){
        add(panel);
        setTitle("FormattedTextField");
        setSize(600,400);

        try {
            MaskFormatter mf = new MaskFormatter("(05##) LLL UU AA");
            mf.install(formattedTextField1);  //yukardaki özelliği yüklememizi sağlıyor
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // # : Sadece sayısal veri girmenizi ister
        // L = lower : sadece küçük harf ister
        // U = upper : sadece büyük harf ister
        // A = alpha : sadece sayı ve harf girişi ister
    }
}
