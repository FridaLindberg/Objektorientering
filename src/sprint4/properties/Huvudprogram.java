package sprint4.properties;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Huvudprogram extends JFrame {

    Huvudprogram(){
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("src/sprint4/properties/minaProperties.properties"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String message = p.getProperty("message");
        JPanel panel = new JPanel();
        JLabel label = new JLabel(message);
        add(panel);
        panel.add(label);
        int fontis = Font.PLAIN; //fonten är en int
        String fontName = p.getProperty("fontStyle");
        if(fontName.equals("BOLD")){
            fontis = Font.BOLD;
        }
        int fontSize = Integer.parseInt(p.getProperty("fontSize"));
        label.setFont(new Font("Helvetica Neue", fontis, fontSize));
        int width = Integer.parseInt(p.getProperty("width"));
        int height = Integer.parseInt(p.getProperty("height"));
        setSize(width, height);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Huvudprogram();
    }
}
