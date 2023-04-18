package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class thirdPage extends JFrame implements ActionListener {
    String id;
    String name;
    String phone;
    String email;
    int xAxis = 20;
    int yAxis = 20;
    private int width=200;
    private int height=50;
    private JPanel mainPanel;

    thirdPage(){
        mainPanel = new JPanel();

        mainPanel.setBounds(0,0,1000,800);
        mainPanel.setBackground(Color.CYAN);
        mainPanel.setLayout(null);





        JLabel idLabel = new JLabel("ID");
        idLabel.setFont(new Font("Serif", Font.PLAIN,16));
        idLabel.setHorizontalAlignment(JLabel.CENTER);
        idLabel.setSize(width,height);
        idLabel.setLocation(xAxis,yAxis);
        idLabel.setBackground(new Color(204,255,255));
        idLabel.setOpaque(true);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Serif", Font.PLAIN,16));
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setSize(width,height);
        nameLabel.setLocation(xAxis,yAxis+height+10);
        nameLabel.setBackground(new Color(204,255,255));
        nameLabel.setOpaque(true);

        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setFont(new Font("Serif", Font.PLAIN,16));
        phoneLabel.setHorizontalAlignment(JLabel.CENTER);
        phoneLabel.setSize(width,height);
        phoneLabel.setLocation(xAxis,yAxis+(height*2)+10);
        phoneLabel.setBackground(new Color(204,255,255));
        phoneLabel.setOpaque(true);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Serif", Font.PLAIN,16));
        emailLabel.setHorizontalAlignment(JLabel.CENTER);
        emailLabel.setSize(width,height);
        emailLabel.setLocation(xAxis,yAxis+(height*3)+10);
        emailLabel.setBackground(new Color(204,255,255));
        emailLabel.setOpaque(true);

        xAxis = (xAxis + width + 10);
        yAxis = 20;

        JTextField idText = new JTextField();
        idText.setSize(width,height);
        idText.setLocation(xAxis,yAxis);
        id = idText.getText();



        JTextField nameText = new JTextField();
        nameText.setSize(width,height);
        nameText.setLocation(xAxis,yAxis+height+10);
        name = nameText.getText();

        JTextField phoneText = new JTextField();
        phoneText.setSize(width,height);
        phoneText.setLocation(xAxis,yAxis+(height*2)+10);
        phone = phoneText.getText();

        JTextField emailText = new JTextField();
        emailText.setSize(width,height);
        emailText.setLocation(xAxis,yAxis+(height*3)+10);
        email = emailText.getText();


        xAxis = 20;
        yAxis = yAxis+(height*5)+10;

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Serif", Font.PLAIN,16));
        submitButton.setLocation(xAxis,yAxis);
        submitButton.setSize(width,height);
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Serif", Font.PLAIN,16));
        clearButton.setLocation(xAxis+width + 10,yAxis);
        clearButton.setSize(width,height);
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);

        mainPanel.add(idLabel);
        mainPanel.add(nameLabel);
        mainPanel.add(phoneLabel);
        mainPanel.add(emailLabel);
        mainPanel.add(idText);
        mainPanel.add(nameText);
        mainPanel.add(phoneText);
        mainPanel.add(emailText);
        mainPanel.add(submitButton);
        mainPanel.add(clearButton);

        this.add(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
