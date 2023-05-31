package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class addStudent extends JFrame implements ActionListener {
    String id;
    String name;
    String phone;
    String email;
    int xAxis = 20;
    int yAxis = 100;
    final int count = 10;
    private int width=200;
    private int height=50;
    private JPanel mainPanel;
    JButton submitButton;
    JButton clearButton;
    JButton mainMenuButton;
    JTextField idText;
    JTextField nameText;
    JTextField phoneText;
    JTextField emailText;
    JLabel idLabel;
    JLabel nameLabel;
    JLabel phoneLabel;
    JLabel emailLabel;
    JLabel titleLabel;
    JLabel messageLabel;

    addStudent(){
        mainPanel = new JPanel();

        mainPanel.setBounds(0,0,1000,800);
        mainPanel.setBackground(Color.CYAN);
        mainPanel.setLayout(null);

        initializationLabel();
        initializeTextField();
        initializeButton();

        mainPanel.add(titleLabel);
        mainPanel.add(idLabel);
        mainPanel.add(nameLabel);
        mainPanel.add(phoneLabel);
        mainPanel.add(emailLabel);
        mainPanel.add(messageLabel);

        mainPanel.add(idText);
        mainPanel.add(nameText);
        mainPanel.add(phoneText);
        mainPanel.add(emailText);
        mainPanel.add(submitButton);
        mainPanel.add(clearButton);
        mainPanel.add(mainMenuButton);

        this.add(mainPanel);
        this.setTitle("Student Information System");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitButton){
            id = idText.getText();
            name = nameText.getText();
            phone = phoneText.getText();
            email = emailText.getText();

            boolean idCheck = existingID(id);


            Boolean emailCheck = isValidEmail() ;
            if(emailCheck && idCheck == false) {
                try {
                    System.out.println("In try block");
                    File studentFile = new File("Students.txt");
                    FileWriter writer = new FileWriter(studentFile, true);
//                    writer.write("\n");
                    writer.write(id);
                    System.out.println(id);
                    writer.write(" ");
                    writer.write(name);
                    writer.write(" ");
                    writer.write(phone);
                    writer.write(" ");
                    writer.write(email + "\n");
                    writer.close();
                    String text = "Data Added";
                    setMessageLabel(text);

                    this.dispose();
                    new MainPage();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else {
//                System.out.println("Problem email");
                String text = "Problem with email or ID already Exists";
                setMessageLabel(text);
//                this.dispose();
//                new MainPage();

            }
        }

        if(e.getSource()==clearButton){
            idText.setText("");
            nameText.setText("");
            phoneText.setText("");
            emailText.setText("");
        }
        if(e.getSource()==mainMenuButton){
            this.dispose();
            new MainPage();
        }
    }

    private boolean existingID(String id){
        boolean count = false;
        File studentFile = new File("Students.txt");
        try {
            Scanner inputFile = new Scanner(studentFile);
            while(inputFile.hasNextLine()){
                String line = inputFile.nextLine();
                String[] studentInfo = line.split(" ");
                if(Objects.equals(studentInfo[0], id)) {
                    count = true;
                }
            }
            inputFile.close();
            if(count==false){
                return false;

            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return true;
    }
    private boolean isValidEmail(){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +"[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        if(email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }
    private void initializationLabel(){
        xAxis = 350;
        yAxis = 30;
        titleLabel = new JLabel("Add Student");
        titleLabel.setFont(new Font("Serif", Font.ITALIC,18));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setSize(width,height);
        titleLabel.setLocation(xAxis,yAxis);
        titleLabel.setBackground(Color.lightGray);
        titleLabel.setOpaque(true);



        xAxis = 20;
        yAxis = 100;
        idLabel = new JLabel("ID");
        idLabel.setFont(new Font("Serif", Font.PLAIN,16));
        idLabel.setHorizontalAlignment(JLabel.CENTER);
        idLabel.setSize(width,height);
        idLabel.setLocation(xAxis,yAxis);
        idLabel.setBackground(new Color(204,255,255));
        idLabel.setOpaque(true);

        yAxis = yAxis+height+count;
        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Serif", Font.PLAIN,16));
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setSize(width,height);
        nameLabel.setLocation(xAxis,yAxis);
        nameLabel.setBackground(new Color(204,255,255));
        nameLabel.setOpaque(true);

        yAxis += (height+count);
        phoneLabel = new JLabel("Phone");
        phoneLabel.setFont(new Font("Serif", Font.PLAIN,16));
        phoneLabel.setHorizontalAlignment(JLabel.CENTER);
        phoneLabel.setSize(width,height);
        phoneLabel.setLocation(xAxis,yAxis);
        phoneLabel.setBackground(new Color(204,255,255));
        phoneLabel.setOpaque(true);

        yAxis += (height+count);
        emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Serif", Font.PLAIN,16));
        emailLabel.setHorizontalAlignment(JLabel.CENTER);
        emailLabel.setSize(width,height);
        emailLabel.setLocation(xAxis,yAxis);
        emailLabel.setBackground(new Color(204,255,255));
        emailLabel.setOpaque(true);

        messageLabel = new JLabel();
    }
    private void initializeTextField(){
        xAxis = 250;
        yAxis = 100;

        idText = new JTextField();
        idText.setSize(width,height);
        idText.setLocation(xAxis,yAxis);



        yAxis += (height+count);
        nameText = new JTextField();
        nameText.setSize(width,height);
        nameText.setLocation(xAxis,yAxis);

        yAxis +=(height +count);
        phoneText = new JTextField();
        phoneText.setSize(width,height);
        phoneText.setLocation(xAxis,yAxis);

        yAxis +=(height +count);
        emailText = new JTextField();
        emailText.setSize(width,height);
        emailText.setLocation(xAxis,yAxis);

    }
    private void initializeButton(){
        xAxis = 20;
        yAxis = 350;

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Serif", Font.PLAIN,16));
        submitButton.setLocation(xAxis,yAxis);
        submitButton.setSize(width,height);
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);

        xAxis=xAxis+width + count;
        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Serif", Font.PLAIN,16));
        clearButton.setLocation(xAxis,yAxis);
        clearButton.setSize(width,height);
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);

        xAxis = xAxis + width +count;
        mainMenuButton = new JButton("Back");
        mainMenuButton.setFont(new Font("Serif", Font.PLAIN,16));
        mainMenuButton.setLocation(xAxis,yAxis);
        mainMenuButton.setSize(width,height);
        mainMenuButton.setFocusable(false);
        mainMenuButton.addActionListener(this);
    }

    private void setMessageLabel(String text){
        xAxis = 230;
        yAxis = 450;

        width = 400;
        height = 50;

        messageLabel.setText(text);
        messageLabel.setFont(new Font("Serif", Font.ITALIC,18));
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setSize(width,height);
        messageLabel.setLocation(xAxis,yAxis);
        messageLabel.setBackground(Color.lightGray);
        messageLabel.setOpaque(true);
    }

}

