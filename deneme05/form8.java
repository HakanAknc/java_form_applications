package deneme05;

import javax.swing.*;

public class form8 extends JFrame{
    private JPanel panel;
    private JTextArea textArea1;

    form8(){
        add(panel);
        setTitle("TextArea, TexrPane, EditorPane");
        setSize(600,400);

        String s = "Bugün hava yağmurlu. \n \n Bereket yağıyor :)";  // \n bir alt satıra geçer
        textArea1.setText(s);
    }
}
