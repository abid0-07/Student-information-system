package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class searchStudent extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JLabel idLabel;
    private JTextField idTextField;
    private String id;
    private JButton submitButton;
    private JButton clearButton;

    int xAxis = 100;
    int yAxis = 150;
    private int width=200;
    private int height=50;

    searchStudent(){
        mainPanel = new JPanel();
        mainPanel.setBounds(0,0,1000,800);
        mainPanel.setBackground(Color.CYAN);
        mainPanel.setLayout(null);

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

        mainPanel.add(idLabel);
        mainPanel.add(idTextField);
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
            if (e.getSource()==submitButton){
                id = idTextField.getText();
                File studentFile = new File("Students.txt");
                try {
                    FileReader reader = new FileReader(studentFile);
                    while(reader.read()!=-1 ){
                        
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(e.getSource()==clearButton){}
    }
}
