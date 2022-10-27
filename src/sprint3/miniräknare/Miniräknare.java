package sprint3.miniräknare;

import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Fungerar för två operander endast!!!! ska försöka ändra
public class Miniräknare extends JFrame implements ActionListener {
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JButton ett = new JButton("1");
    JButton två = new JButton("2");
    JButton tre = new JButton("3");
    JButton fyra = new JButton("4");
    JButton fem = new JButton("5");
    JButton sex = new JButton("6");
    JButton sju = new JButton("7");
    JButton åtta = new JButton("8");
    JButton nio = new JButton("9");
    JButton noll = new JButton("0");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton gånger = new JButton("*");
    JButton delat = new JButton("/");
    JButton likamed = new JButton("=");
    JTextField field = new JTextField();
    String operator = "";
  {
    }

    Miniräknare() throws ScriptException {
        setLayout(new BorderLayout());
        add(panel1);
        add(panel2, BorderLayout.SOUTH);
        panel1.setLayout(new GridLayout(5,3));
        panel1.add(nio); nio.addActionListener(this); nio.setBackground(new Color(154,222,255));
        panel1.add(åtta); åtta.addActionListener(this); åtta.setBackground(new Color(154,222,255));
        panel1.add(sju); sju.addActionListener(this); sju.setBackground(new Color(154,222,255));
        panel1.add(sex); sex.addActionListener(this); sex.setBackground(new Color(154,222,255));
        panel1.add(fem); fem.addActionListener(this); fem.setBackground(new Color(154,222,255));
        panel1.add(fyra); fyra.addActionListener(this); fyra.setBackground(new Color(154,222,255));
        panel1.add(tre); tre.addActionListener(this); tre.setBackground(new Color(154,222,255));
        panel1.add(två); två.addActionListener(this); två.setBackground(new Color(154,222,255));
        panel1.add(ett); ett.addActionListener(this); ett.setBackground(new Color(154,222,255));
        panel1.add(plus); plus.addActionListener(this); plus.setBackground(new Color(148,255,141));
        panel1.add(noll); noll.addActionListener(this); noll.setBackground(new Color(154,222,255));
        panel1.add(minus); minus.addActionListener(this); minus.setBackground(new Color(148,255,141));
        panel1.add(gånger); gånger.addActionListener(this); gånger.setBackground(new Color(148,255,141));
        panel1.add(likamed); likamed.addActionListener(this); likamed.setBackground(new Color(255,141,206));
        panel1.add(delat); delat.addActionListener(this); delat.setBackground(new Color(148,255,141));
        panel2.setLayout(new BorderLayout());
        panel2.add(field);
        setSize(250,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws ScriptException {
        Miniräknare m = new Miniräknare();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==nio){
            field.setText(field.getText()+ nio.getText());
        }
        else if(e.getSource()==åtta){
            field.setText(field.getText()+ åtta.getText());

        }
        else if(e.getSource()==sju){
            field.setText(field.getText()+ sju.getText());

        }
        else if(e.getSource()==sex){
            field.setText(field.getText()+ sex.getText());

        }
        else if(e.getSource()==fem){
            field.setText(field.getText()+ fem.getText());

        }
        else if(e.getSource()==fyra){
            field.setText(field.getText()+ fyra.getText());

        }
        else if(e.getSource()==tre){
            field.setText(field.getText()+ tre.getText());

        }
        else if(e.getSource()==två){
            field.setText(field.getText()+ två.getText());

        }
        else if(e.getSource()==ett){
            field.setText(field.getText()+ ett.getText());

        }
        else if(e.getSource()==noll){
            field.setText(field.getText()+ noll.getText());

        }
        else if(e.getSource()==plus){
            field.setText(field.getText()+ plus.getText());
            operator = "+";

        }
        else if(e.getSource()==minus){
            field.setText(field.getText()+ minus.getText());
            operator = "-";

        }
        else if(e.getSource()==gånger){
            field.setText(field.getText()+ gånger.getText());
            operator = "*";

        }
        else if(e.getSource()==delat){
            field.setText(field.getText()+ delat.getText());
            operator = "/";

        }
        else if(e.getSource()==likamed){
            String input = field.getText();
            String operator = "";
            String firstNumber = "";
            String secondNumber = "";
            if (input.equals("")) {
                System.out.println("Fel! Tomt uttryck.");
                System.exit(0);
            } else if (!(input.contains("+") || input.contains("*") || input.contains("/") || input.contains("-"))) {
                System.out.println("Fel! Måste innehålla en giltig operator");
                System.exit(0);
            } else if (input.contains("+")) {
                operator = "+";
            } else if (input.contains("*")) {
                operator = "*";
            } else if (input.contains("/")) {
                operator = "/";
            } else if (input.contains("-")) {
                operator = "-";
            }
            switch ((operator)) {
                case "+":
                    firstNumber = input.substring(0, input.indexOf("+"));
                    secondNumber = input.substring(input.indexOf("+") + 1);
                    break;
                case "*":
                    firstNumber = input.substring(0, input.indexOf("*"));
                    secondNumber = input.substring(input.indexOf("*") + 1);
                    break;
                case "/":
                    firstNumber = input.substring(0, input.indexOf("/"));
                    secondNumber = input.substring(input.indexOf("/") + 1);
                    if (secondNumber.equals("0")) {
                        System.out.println("Fel! Kan inte dela med 0.");
                        System.exit(0);
                    }
                    break;
                case "-":
                    firstNumber = input.substring(0, input.substring(1).indexOf("-") + 1);
                    secondNumber = input.substring(input.substring(1).indexOf("-") + 1 + 1);
                    break;
            }
            double firstNumberDouble = 0;
            double secondNumberDouble = 0;
            double result = 0;
            try {
                firstNumberDouble = Double.parseDouble(firstNumber);
                secondNumberDouble = Double.parseDouble(secondNumber);
            } catch (NumberFormatException ex) {
                System.out.println("Fel! Måste innehålla två reella operander och en operator");
                System.exit(0);
            }
            switch (operator) {
                case "+":
                    result = firstNumberDouble + secondNumberDouble;
                    break;
                case "*":
                    result = firstNumberDouble * secondNumberDouble;
                    break;
                case "/":
                    result = firstNumberDouble / secondNumberDouble;
                    break;
                case "-":
                    result = firstNumberDouble - secondNumberDouble;
                    break;
            }
            field.setText(field.getText() + " = " + result);


            }
        }
    }

