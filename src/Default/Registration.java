package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Registration extends JFrame implements ActionListener{
    // Admin registration
    private JPanel mainPanel;
    private JLabel name;
    private JTextField nameField;
    private JLabel designation;
    private JTextField designationField;
    private JLabel phoneNumber;
    private JTextField phoneNumberField;
    private JLabel emailAddress;
    private JTextField emailAddressField;
    private JButton submitButton;

    private JButton clearButton;

    Registration(){
        // Panel that contains all the information fields
        mainPanel = new JPanel();
        mainPanel.setBounds(0,0,620,620);
        mainPanel.setBackground(new Color(25, 209, 209));
        mainPanel.setLayout(null);

        //Name label and text field
        name = new JLabel("Name");
        name.setLocation(30,60);
        name.setSize(90,30);
        name.setFont(new Font("Roboto", Font.PLAIN,16));
        nameField = new JTextField();
        nameField.setEditable(true);
        nameField.setLocation(141,60);
        nameField.setSize(250,30);


        designation= new JLabel("Designation");
        designation.setLocation(30,100);
        designation.setSize(90,30);
        designation.setFont(new Font("Roboto", Font.PLAIN,16));
        designationField = new JTextField();
        designationField.setEditable(true);
        designationField.setLocation(141,100);
        designationField.setSize(250,30);

        phoneNumber = new JLabel("Phone");
        phoneNumber.setLocation(30,140);
        phoneNumber.setSize(90,30);
        phoneNumber.setFont(new Font("Roboto", Font.PLAIN,16));
        phoneNumberField = new JTextField();
        phoneNumberField.setEditable(true);
        phoneNumberField.setLocation(141,140);
        phoneNumberField.setSize(250,30);

        emailAddress = new JLabel("Email");
        emailAddress.setLocation(30,180);
        emailAddress.setSize(90,30);
        emailAddress.setFont(new Font("Roboto", Font.PLAIN,16));
        emailAddressField=new JTextField();
        emailAddressField.setEditable(true);
        emailAddressField.setLocation(141,180);
        emailAddressField.setSize(250,30);

        submitButton = new JButton("Submit");
        submitButton.setFocusable(false);
        submitButton.setLocation(200,300);
        submitButton.setSize(100,30);
        submitButton.addActionListener(this);


        clearButton = new JButton("Clear");
        clearButton.setFocusable(false);
        clearButton.setLocation(50,300);
        clearButton.setSize(100,30);
        clearButton.addActionListener(this);

        mainPanel.add(name);
        mainPanel.add(nameField);
        mainPanel.add(designation);
        mainPanel.add(designationField);
        mainPanel.add(phoneNumber);
        mainPanel.add(phoneNumberField);
        mainPanel.add(emailAddress);
        mainPanel.add(emailAddressField);
        mainPanel.add(submitButton);
        mainPanel.add(clearButton);
        this.add(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(620,620);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
