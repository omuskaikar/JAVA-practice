package Exp6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {
    JTextField firstno,secondno,resultno;
    public Calculator() {
        setTitle("Calculator");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel first = new JLabel("First No : ");
        firstno = new JTextField();
        JLabel second = new JLabel("Second No : ");
        secondno = new JTextField();
        JLabel result = new JLabel("Result : ");
        resultno = new JTextField();

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton mod = new JButton("%");
        JButton clr = new JButton("CLEAR");

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performCalc("+");
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performCalc("-");
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performCalc("*");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performCalc("/");
            }
        });
        mod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performCalc("%");
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstno.setText("");
                secondno.setText("");
                resultno.setText("");
            }
        });

        panel.add(first);
        panel.add(firstno);
        panel.add(second);
        panel.add(secondno);
        panel.add(result);
        panel.add(resultno);
        panel.add(add);
        panel.add(sub);
        panel.add(mul);
        panel.add(div);
        panel.add(mod);
        panel.add(clr);

        add(panel);
        setVisible(true);
    }

    public void performCalc(String operator) {
        try {
            double firstNumber = Double.parseDouble(firstno.getText());
            double secondNumber = Double.parseDouble(secondno.getText());

            double result = 0;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    } else {
                        resultno.setText("Error: Division by zero");
                        return;
                    }
                    break;
                case "%":
                    result = firstNumber % secondNumber;
                    break;
            }

            resultno.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
            resultno.setText("Error: Invalid input");
        }
    }
    


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
}
