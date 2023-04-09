package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Login extends JFrame{
    private JPanel panel;
    private JLabel userName;
    private JTextField userNameText;
    private JLabel password;
    private JPasswordField passwordField;
    private JCheckBox showPassword;
    private JButton submitButton;
    private JButton forgetButton;

    Login(){
        panel = new JPanel();
        panel.setBounds(0,0,420,420);
        panel.setBackground(new Color(25, 209, 209));
        panel.setLayout(null);


        userName = new JLabel("Username");
        userName.setLocation(10,50);
        userName.setSize(90,30);
        userName.setFont(new Font("Roboto", Font.PLAIN,16));
        userNameText = new JTextField();
        userNameText.setEditable(true);
        userNameText.setLocation(110,50);
        userNameText.setSize(250,30);

        password = new JLabel("Password");
        password.setLocation(10,100);
        password.setSize(90,30);
        password.setFont(new Font("Roboto", Font.PLAIN,16));
        passwordField = new JPasswordField();
        passwordField.setEditable(true);
        passwordField.setLocation(110,100);
        passwordField.setSize(250,30);

        showPassword = new JCheckBox();
        showPassword.setText("Show Password");
        showPassword.setLocation(20,150);
        showPassword.setSize(250,30);
        showPassword.setBackground(null);



        panel.add(userName);
        panel.add(userNameText);
        panel.add(password);
        panel.add(passwordField);
        panel.add(showPassword);
        this.add(panel);


        this.setSize(420,420);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
