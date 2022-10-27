package sprint3.övningsuppgift4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.*;

public class TextEditor extends JFrame {

    JPanel grund = new JPanel();
    JPanel knappar = new JPanel();
    JLabel label = new JLabel("Filnamn:");
    JTextField textField = new JTextField();
    JButton öppna = new JButton("Öppna");
    JButton spara = new JButton("Spara");
    JButton skrivUt = new JButton("Skriv ut");
    JButton avsluta = new JButton("Avsluta");
    JTextArea textArea = new JTextArea(20,50);
    JScrollPane scroll = new JScrollPane(textArea);

    TextEditor(){

        grund.setLayout(new BorderLayout());
        add(grund);
        knappar.setLayout(new GridLayout(1,6));
        knappar.add(label);
        knappar.add(textField);
        knappar.add(öppna);
        öppna.setEnabled(false);
        knappar.add(spara);
        spara.setEnabled(false);
        knappar.add(skrivUt);
        knappar.add(avsluta);
        grund.add(knappar, BorderLayout.NORTH);
        grund.add(scroll);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textField.addActionListener(e -> {
            öppna.setEnabled(true);
            spara.setEnabled(true);
        });
        öppna.addActionListener(e -> {
            try(BufferedReader r = new BufferedReader(new FileReader(textField.getText()))){
                textArea.read(r, null);
            } catch (Exception exc) {
                System.out.println("Error in reader");
                exc.printStackTrace();
            }});
        spara.addActionListener(e -> {
            try(PrintWriter w = new PrintWriter(new FileWriter(textField.getText(), true))){
                textArea.write(w);
            }
            catch (Exception exc) {
                System.out.println("Error in writer");
                exc.printStackTrace();
            }
        });
        skrivUt.addActionListener(e -> {
            try {
                textArea.print();
            } catch (Exception exc) {
                System.out.println("Error in printer");
                exc.printStackTrace();
            }
        });
        avsluta.addActionListener(e -> {
            System.exit(0);
        });

    }

    public static void main(String[] args) {
        TextEditor te = new TextEditor();
    }


}
