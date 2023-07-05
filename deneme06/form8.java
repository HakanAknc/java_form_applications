package deneme06;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form8 extends JFrame{
    private JPanel panel;
    private JTable table1;
    private JButton button1;

    DefaultTableModel model = new DefaultTableModel();

    form8(){
        add(panel);
        setTitle("Table");
        setSize(400,400);

        model.setRowCount(3);  //sütün sayısı
        model.setColumnCount(3);  // satır sayısı

        table1.setModel(model);
        //table1.setTableHeader(null);  # Kendi atatdığı A B C yi kaldırır

        // Satır ve sütüna ekleme yapar
        table1.setValueAt(25,0,0);  // 0 satır 0 sütün 25
        table1.setValueAt(12,0,1);  // 0 satır 1 sütün 12
        table1.setValueAt(17,0,2);

        //System.out.println(table1.getValueAt(0,0));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(table1.getSelectedRow()+"-"+table1.getSelectedColumn());
                System.out.println(table1.getValueAt(table1.getSelectedRow(),table1.getSelectedColumn()));
            }
        });
    }
}
