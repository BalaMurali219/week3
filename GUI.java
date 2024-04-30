import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField;
    private JTextField emailField;
    private JButton registerButton;

    public EventRegistrationForm() {

        setTitle("Event Registration Form");
        setSize(350, 150);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        getContentPane().add(panel);

        panel.add(new JLabel("Name:"));
        nameField = new JTextField(20);
        panel.add(nameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField(20);
        panel.add(emailField);

        panel.add(new JLabel(""));

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        panel.add(registerButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();

        if (name.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("Registration Details: Name - " + name + ", Email - " + email);
            JOptionPane.showMessageDialog(this, "Registration successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            nameField.setText("");
            emailField.setText("");
        }
    }

    public static void main(String[] args) {
        EventRegistrationForm form = new EventRegistrationForm();
        form.setVisible(true);
    }
}
