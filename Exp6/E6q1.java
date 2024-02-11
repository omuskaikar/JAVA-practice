package Exp6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class E6q1 extends JFrame {
    private JTextField nameField, streetField, cityField, pincodeField;
    public E6q1() {
        setTitle("Info Window ");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel streetLabel = new JLabel("Street:");
        streetField = new JTextField();
        JLabel cityLabel = new JLabel("city:");
        cityField = new JTextField();
        JLabel pincodeLabel = new JLabel("pincode:");
        pincodeField = new JTextField();

        JButton myButton = new JButton("Change text");
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String street = streetField.getText();
                String city = cityField.getText();
                String pincode = pincodeField.getText();

                if (!name.isEmpty() && !street.isEmpty() && !city.isEmpty() && !pincode.isEmpty()) {
                    Font font = new Font("Arial", Font.ITALIC, 32);
                    nameField.setFont(font);
                    streetField.setFont(font);
                    cityField.setFont(font);
                    pincodeField.setFont(font);
                    nameField.setText(name);
                    streetField.setText(street);
                    cityField.setText(city);
                    pincodeField.setText(pincode);

                }
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(streetLabel);
        panel.add(streetField);
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(pincodeLabel);
        panel.add(pincodeField);
        panel.add(myButton);

        add(panel);
        setVisible(true);

    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new E6q1();
            }
        });
    }
}
