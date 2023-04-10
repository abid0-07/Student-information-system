package Default;

import Person.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainPage extends JFrame implements ActionListener  {
    private JButton viewButton;
    private JButton noButton;
    private JLabel textLabel;

    private JPanel panelView;


    MainPage(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        panelView = new JPanel();
        panelView.setBounds(0,0,600,600);
        panelView.setBackground(Color.CYAN);
        panelView.setLayout(null);

        viewButton = new JButton("View");
        viewButton.setFont(new Font("Serif", Font.PLAIN,12));
        viewButton.setLocation(250,50);
        viewButton.setSize(60,30);
        viewButton.setFocusable(false);
        viewButton.addActionListener(this);

        panelView.add(viewButton);
        this.add(panelView);
//

        this.setSize(600,600);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewButton){
            try {
                new Student();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
