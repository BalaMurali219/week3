import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {

    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password";

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginGUI() {
    
        setTitle("Login Page");
        setSize(300, 150);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        setLayout(new GridLayout(3, 2, 5, 5));
        add(new JLabel("Username:"));

        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));

        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel(""));
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });
        add(loginButton);
    }

    private void performLogin() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            JOptionPane.showMessageDialog(this, "Login successful", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        LoginGUI loginGUI = new LoginGUI();
        loginGUI.setVisible(true);
    }
}
