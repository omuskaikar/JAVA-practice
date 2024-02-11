package Exp6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class E6q3 extends JFrame {
    
    public E6q3() {
        setTitle("Registrarion Form");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel namelabel = new JLabel("Name");
        JTextField nameField = new JTextField();
        JLabel Genderlabel = new JLabel("Gender");
        JTextField GenderField = new JTextField();
        JLabel Passwordlabel = new JLabel("Password");
        JPasswordField PasswordField = new JPasswordField();

        JLabel ConfirmPasswordlabel = new JLabel("ConfirmPassword");
        JPasswordField COnfirmPasswordField = new JPasswordField();

        JButton submit = new JButton("Submit");

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!nameField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Form submitted sucessfully");
                }
            }
        });

        panel.add(namelabel);
        panel.add(nameField);
        panel.add(Genderlabel);
        panel.add(GenderField);
        panel.add(Passwordlabel);
        panel.add(PasswordField);
        panel.add(ConfirmPasswordlabel);
        panel.add(COnfirmPasswordField);
        panel.add(submit);

        add(panel);
        setVisible(true);

    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new E6q3();
            }
        });
    }
}