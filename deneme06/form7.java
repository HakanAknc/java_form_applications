package deneme06;

import javax.swing.*;

public class form7 extends JFrame{
    private JPanel panel;
    private JList list1;

    DefaultListModel<String> liste_model = new DefaultListModel<>();

    form7(){     // değerleri kendimiz girdik.
        add(panel);
        setTitle("Liste 1");
        setSize(400,400);

        liste_model.add(0,"İstanbul");
        liste_model.add(1,"Ankara");
        liste_model.add(2,"İzmir");
        liste_model.add(3,"Antalya");
        liste_model.add(4,"Konya");
        list1.setModel(liste_model);
    }
}
