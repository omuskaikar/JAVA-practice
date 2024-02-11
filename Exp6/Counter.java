package Exp6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Counter extends JFrame{
    private int counts = 0;

    public Counter() {
        setTitle("Counter");
        setSize(600, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 5));

        JLabel count = new JLabel("Count :");
        JTextField counter = new JTextField();
        JButton add = new JButton("increase");
        JButton sub = new JButton("decrease");
        JButton clr = new JButton("clear");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counts += 1;
                counter.setText(Integer.toString(counts));
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counts -= 1;
                counter.setText(Integer.toString(counts));
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.setText("");
                counts = 0;
            }
        });
        panel.add(count);
        panel.add(counter);
        panel.add(add);
        panel.add(sub);
        panel.add(clr);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run(){
                new Counter();
        }            
        });
    }
}
