package sprint3.övningsuppgift7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Huvudprogram extends JFrame implements MouseListener {

    JPanel panel = new JPanel();
    JButton button = new JButton("Ändra färg");
    Huvudprogram(){
        button.addMouseListener(this);
        add(panel);
        panel.setSize(200,200);
        button.setSize(50,50);
        panel.add(button);
        setSize(200,200);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        button.setBackground(Color.RED);

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
