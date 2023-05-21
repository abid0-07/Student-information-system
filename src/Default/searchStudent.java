package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class searchStudent extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JLabel idLabel;
    private JTextField idTextField;
    private String id;
    private JButton submitButton;
    private JButton clearButton;
    private JButton mainMenuButton;
    private JLabel headingLabel;

    int xAxis = 100;
    int yAxis = 150;
    private int width=200;
    private int height=50;

    searchStudent(){
        mainPanel = new JPanel();
        mainPanel.setBounds(0,0,1000,800);
        mainPanel.setBackground(Color.CYAN);
        mainPanel.setLayout(null);

        mainMenuButton = new JButton("Back");
        mainMenuButton.setFont(new Font("Serif", Font.PLAIN,16));
        mainMenuButton.setLocation(20,50);
        mainMenuButton.setSize(width,height);
        mainMenuButton.setFocusable(false);
        mainMenuButton.addActionListener(this);

        headingLabel= new JLabel("Search Student");
        headingLabel.setFont(new Font("Serif", Font.ITALIC,18));
        headingLabel.setHorizontalAlignment(JLabel.CENTER);
        headingLabel.setSize(width,height);
        headingLabel.setLocation(350,50);
        headingLabel.setBackground(Color.lightGray);
        headingLabel.setOpaque(true);

        idLabel = new JLabel("ID");
        idLabel.setFont(new Font("Serif", Font.PLAIN,16));
        idLabel.setHorizontalAlignment(JLabel.CENTER);
        idLabel.setSize(width,height);
        idLabel.setLocation(xAxis,yAxis);
        idLabel.setBackground(new Color(204,255,255));
        idLabel.setOpaque(true);

        xAxis = (xAxis + width + 10);
        yAxis = 150;

        idTextField = new JTextField();
        idTextField.setSize(width,height);
        idTextField.setLocation(xAxis,yAxis);

        xAxis = 100;
        yAxis = 250;

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


        mainPanel.add(headingLabel);
        mainPanel.add(idLabel);
        mainPanel.add(idTextField);
        mainPanel.add(submitButton);
        mainPanel.add(clearButton);
        mainPanel.add(mainMenuButton);

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
            if (e.getSource()==submitButton){
                searchStudent();

            }
            if(e.getSource()==clearButton){
                idTextField.setText("");
            }
            if(e.getSource()==mainMenuButton){
                new MainPage();
                this.dispose();
            }
    }
    public void searchStudent(){
        id = idTextField.getText();
//                System.out.println(id);
        File studentFile = new File("Students.txt");
        try {
            boolean count = false;
            Scanner inputFile = new Scanner(studentFile);
            viewStudent viewStudent = new viewStudent();
            while(inputFile.hasNextLine()){
                String line = inputFile.nextLine();
//                        System.out.println(line);
                String[] studentInfo = line.split(" ");
                if(Objects.equals(studentInfo[0], id)) {
//                            System.out.println(id+"is found");

                    this.dispose();
                    for (String part: studentInfo){
                        viewStudent.createNewLabel(part);
                    }
                    count = true;
                    break;
                }

            }
            if(count==false){
                viewStudent.createNewLabel("ID not Found");

            }
            inputFile.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void searchStudent(String id){

    }
}
