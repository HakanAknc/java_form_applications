package deneme13;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class form15 extends JFrame{
    private JPanel panel;
    private JSlider vs;
    private JSlider fs;
    private JSlider os;
    private JLabel vl;
    private JLabel fl;
    private JLabel ol;
    private JButton button1;
    private JLabel hf;

    static  int v,f;
    static float o;

    form15(){
        add(panel);
        setTitle("Vize Final Hesaplama");
        setSize(500,500);

        v=f=0;
        o = 0f;

        vs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                v = (int) vs.getValue();
                f = (int) fs.getValue();
                o = (float) ((v * 0.4) + (f * 0.6));
                os.setValue(Math.round(o));
                vl.setText("VİZE = "+ Integer.toString(v));
                fl.setText("FİNAL = "+Integer.toString(f));
                ol.setText("ORTALAMA = "+Float.toString(o));
                if (o>=60 && o<=100) os.setBackground(Color.GREEN);
                else if (o>=55 && o<60) os.setBackground(Color.YELLOW);
                else os.setBackground(Color.RED);
                button1.setText(Integer.toString(v)+"-"+Integer.toString(f));
                button1.setText(Float.toString(o));
            }
        });
        fs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                v = (int) vs.getValue();
                f = (int) fs.getValue();
                o = (float) ((float) v*0.4 + f*0.6);
                os.setValue(Math.round(o));    //0'dan yukarıysa üste aşağıysa alta yuvarlar
                vl.setText("VİZE = "+ Integer.toString(v));
                fl.setText("FİNAL = "+ Integer.toString(f));
                ol.setText("ORTALAMA = "+ Float.toString(o));
                if (o>=60 && o<=100) os.setBackground(Color.GREEN);
                else if (o>=55 && o<60) os.setBackground(Color.ORANGE);
                else os.setBackground(Color.RED);
                button1.setText(Integer.toString(v)+"-"+Integer.toString(f));
                button1.setText(Float.toString(o));

            }
        });

    }
}
