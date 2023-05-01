package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

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
    JButton submitButton;
    JButton clearButton;
    JTextField idText;
    JTextField nameText;
    JTextField phoneText;
    JTextField emailText;

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

        idText = new JTextField();
        idText.setSize(width,height);
        idText.setLocation(xAxis,yAxis);




        nameText = new JTextField();
        nameText.setSize(width,height);
        nameText.setLocation(xAxis,yAxis+height+10);


        phoneText = new JTextField();
        phoneText.setSize(width,height);
        phoneText.setLocation(xAxis,yAxis+(height*2)+10);


        emailText = new JTextField();
        emailText.setSize(width,height);
        emailText.setLocation(xAxis,yAxis+(height*3)+10);



        xAxis = 20;
        yAxis = yAxis+(height*5)+10;

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Serif", Font.PLAIN,16));
        submitButton.setLocation(xAxis,yAxis);
        submitButton.setSize(width,height);
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);

        clearButton = new JButton("Clear");
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
        if(e.getSource()==submitButton){
            id = idText.getText();
            name = nameText.getText();
            phone = phoneText.getText();
            email = emailText.getText();

//            Boolean idCheck = containsOnlyNumber();
            Boolean emailCheck = isValidEmail() ;
            if(emailCheck) {


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

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else {
                System.out.println("Problem email");
            }
        }

        if(e.getSource()==clearButton){
            idText.setText("");
            nameText.setText("");
            phoneText.setText("");
            emailText.setText("");
        }
    }

//    private boolean containsOnlyNumber(){
//        if(id == null || id.isEmpty()){
//            return false;
//        }
//        for (int i = 0; i < id.length();i++){
//            if((!Character.isDigit(id.charAt(i)) || id.charAt(i)== '-') ){
//                return false;
//            }
//        }
//        return true;
//    }
    private boolean isValidEmail(){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +"[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        if(email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }

}

