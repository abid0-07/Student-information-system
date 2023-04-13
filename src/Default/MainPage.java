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


    MainPage(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        panelView = new JPanel();
        panelView.setBounds(0,0,1000,800);
        panelView.setBackground(Color.CYAN);
        panelView.setLayout(null);

        searchButton = new JButton("Search");
        searchButton.setFont(new Font("Serif", Font.PLAIN,16));
        searchButton.setLocation(180,50);
        searchButton.setSize(80,50);
        searchButton.setFocusable(false);
        searchButton.addActionListener(this);

        viewButton = new JButton("View");
        viewButton.setFont(new Font("Serif", Font.PLAIN,12));
        viewButton.setLocation(250,50);
        viewButton.setSize(60,50);
        viewButton.setFocusable(false);
        viewButton.addActionListener(this);



        addButton = new JButton("Add");
        addButton.setFont(new Font("Serif", Font.PLAIN,12));
        addButton.setLocation(300,50);
        addButton.setSize(60,50);
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
        if (e.getSource()==searchButton){}
        if(e.getSource()==viewButton){
            try {
                new Student();
//                this.dispose();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        if(e.getSource()==addButton){}
    }
}
