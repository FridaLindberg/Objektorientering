package sprint3.övningsuppgift2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mätarställning extends JFrame implements ActionListener {
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel label1 = new JLabel("Mätarställning nu:");
    JLabel label2 = new JLabel("Mätarställning för ett år sen:");
    JLabel label3 = new JLabel("Antal liter förbrukad bensin:");
    JLabel skrivUt = new JLabel("Skriv in i fälten");
    Bil bil = new Bil();
    JTextField field1 = new JTextField();
    JTextField field2 = new JTextField();
    JTextField field3 = new JTextField();

    Mätarställning() {
        setLayout(new GridLayout(2, 1));
        panel1.setLayout(new GridLayout(3, 2));
        panel2.setLayout(new FlowLayout());
        add(panel1);
        add(panel2);
        panel1.add(label1);
        panel1.add(field1);
        panel1.add(label2);
        panel1.add(field2);
        panel1.add(label3);
        panel1.add(field3);
        panel2.add(skrivUt);
        field1.addActionListener(this);
        field2.addActionListener(this);
        field3.addActionListener(this);
        setSize(500,150);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Mätarställning m = new Mätarställning();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!field1.getText().isEmpty() && !field2.getText().isEmpty() && !field3.getText().isEmpty()) {
            bil.setDagensMätare(Double.parseDouble(field1.getText()));
            bil.setFörraMätaren(Double.parseDouble(field2.getText()));
            bil.setFörbrukadBensin(Double.parseDouble(field3.getText()));
            skrivUt.setText(bil.utskrift());
        }
        else {
            skrivUt.setText("Fyll i alla fält");
        }
    }
}

