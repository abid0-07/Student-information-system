package Default;

import Person.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainPage extends JFrame implements ActionListener  {
    private JButton viewButton;
    private JButton searchButton;
    private JButton addButton;

    private JPanel panelView;
    private int width=300;
    private int height=80;
    private int xAxis= 80;
    private int yAxis = 100;

    MainPage(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        panelView = new JPanel();
        panelView.setBounds(0,0,1000,800);
        panelView.setBackground(Color.CYAN);
        panelView.setLayout(null);

        searchButton = new JButton("Search Student by ID");
        searchButton.setFont(new Font("Serif", Font.PLAIN,16));
        searchButton.setLocation(xAxis + width,yAxis);
        searchButton.setSize(width,height);
        searchButton.setFocusable(false);
        searchButton.addActionListener(this);

        viewButton = new JButton("View Student List");
        viewButton.setFont(new Font("Serif", Font.PLAIN,16));
        viewButton.setLocation(xAxis+width,yAxis+height);
        viewButton.setSize(width,height);
        viewButton.setFocusable(false);
        viewButton.addActionListener(this);



        addButton = new JButton("Add Student to the list");
        addButton.setFont(new Font("Serif", Font.PLAIN,16));
        addButton.setLocation(xAxis+width,yAxis+height*2);
        addButton.setSize(width,height);
        addButton.setFocusable(false);
        addButton.addActionListener(this);

        panelView.add(viewButton);
        panelView.add(searchButton);
        panelView.add(addButton);
        this.add(panelView);
//

        this.setSize(1000,800);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==searchButton){

        }
        if(e.getSource()==viewButton){
            try {
                new Student();
//                this.dispose();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        if(e.getSource()==addButton){
//            SecondPage secondPage = new SecondPage();
//            secondPage.addNewStudent();
            this.dispose();
            new addStudent();

        }
    }
}
