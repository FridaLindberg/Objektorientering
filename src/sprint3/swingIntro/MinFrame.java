package sprint3.swingIntro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinFrame extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hallå");
    JCheckBox red = new JCheckBox("Red");
    JCheckBox yellow = new JCheckBox("Yellow");
    JCheckBox blue = new JCheckBox("Blue");

    MinFrame() {
        setTitle("Swing");
        panel.setLayout(new GridLayout(4,1));
        panel.setBackground(Color.WHITE);
        panel.add(red); panel.add(yellow); panel.add(blue);
        red.addActionListener(this);
        yellow.addActionListener(this);
        blue.addActionListener(this);
        panel.add(label);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MinFrame m = new MinFrame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (red.isSelected()&&yellow.isSelected()&&blue.isSelected()){
            label.setText("brown");
            panel.setBackground(Color.DARK_GRAY);
        }
        else if (red.isSelected()&&blue.isSelected()){
            label.setText("purple");
            panel.setBackground(Color.MAGENTA);
        }
        else if (red.isSelected()&&yellow.isSelected()){
            label.setText("orange");
            panel.setBackground(Color.ORANGE);
        }
        else if (yellow.isSelected()&&blue.isSelected()){
            label.setText("green");
            panel.setBackground(Color.GREEN);
        }
        else if(red.isSelected()){
            label.setText("röd");
            panel.setBackground(Color.RED);
        }
        else if(yellow.isSelected()){
            label.setText("yellow");
            panel.setBackground(Color.YELLOW);
        }
        else if ( blue.isSelected()){
            label.setText("blue");
            panel.setBackground(Color.BLUE);
        }
        else {
            label.setText("no color");
            panel.setBackground(Color.WHITE);
        }
    }
}

