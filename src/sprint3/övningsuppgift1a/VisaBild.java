package sprint3.övningsuppgift1a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisaBild extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    ImageIcon image = new ImageIcon("src/sprint3/övningsuppgift1a/img.png");
    ImageIcon image2 = new ImageIcon("src/sprint3/övningsuppgift1a/img_2.png");
    JLabel label = new JLabel(image);
    JLabel label2 = new JLabel(image2);
    JButton button = new JButton("Växla bild 1");
    JButton button2 = new JButton("Växla bild 2");

    VisaBild() {
        setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(1, 2));
        panel.setBackground(Color.WHITE);
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(Color.WHITE);
        add(panel);
        add(panel2);
        panel.add(label);
        panel.add(label2);
        panel2.add(button);
        panel2.add(button2);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        VisaBild vb = new VisaBild();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ImageIcon newImage = new ImageIcon("src/sprint3/övningsuppgift1a/img_1.png");
        if (e.getSource() == button) {
            if (label.getIcon() == image) {
                label.setIcon(newImage);
            } else {
                label.setIcon(image);
            }

        } else if (e.getSource() == button2) {
            if (label2.getIcon() == image2) {
                label2.setIcon(newImage);
            } else {
                label2.setIcon(image2);
            }
        }
    }
}