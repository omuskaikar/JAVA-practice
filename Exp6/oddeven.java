package Exp6;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class oddeven extends JFrame {
    private JLabel evenLabel, oddLabel;
    private JTextField listTextField;
    private JButton filterButton;
    private LinkedList<Integer> evenNumbers, oddNumbers;

    public oddeven() {
        setTitle("Odd Even");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel numberLabel = new JLabel("Number List:");
        listTextField = new JTextField();
        evenLabel = new JLabel("Even Numbers: ");
        oddLabel = new JLabel("Odd Numbers: ");
        filterButton = new JButton("Filter");

        evenNumbers = new LinkedList<>();
        oddNumbers = new LinkedList<>();

        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chars = listTextField.getText();
                String[] numbers = chars.split(" ");
                
                evenNumbers.clear();
                oddNumbers.clear();
                
                for (String numStr : numbers) {
                    int number = Integer.parseInt(numStr);
                    if (number % 2 == 0) {
                        evenNumbers.add(number);
                    } else {
                        oddNumbers.add(number);
                    }
                }
                evenLabel.setText("Even Numbers: " + formatNumbers(evenNumbers));
                oddLabel.setText("Odd Numbers: " + formatNumbers(oddNumbers));
            }
        });

        panel.add(numberLabel);
        panel.add(listTextField);
        panel.add(new JLabel());
        panel.add(filterButton);
        panel.add(evenLabel);
        panel.add(oddLabel);

        add(panel);
        setVisible(true);
    }

    private String formatNumbers(LinkedList<Integer> numbers) {
        StringBuilder result = new StringBuilder();
        for (int num : numbers) {
            result.append(num).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new oddeven();
            }
        });
    }
}
