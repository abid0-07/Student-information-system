package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame implements ActionListener {
    private JButton yesButton;
    private JButton noButton;
    private JLabel textLabel;

    private JPanel panelView;


    MainPage(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        panelView = new JPanel();
        panelView.setBounds(0,0,420,420);
        panelView.setBackground(Color.CYAN);
        panelView.setLayout(null);
//        mainLabel = new JLabel("");

        textLabel = new JLabel("Do you have an account?");
        textLabel.setLocation(100,50);
        textLabel.setSize(230,130);
        textLabel.setFont(new Font("Roboto", Font.PLAIN, 20));

        yesButton = new JButton("Yes");
        yesButton.setFocusable(false);
        yesButton.setBackground(Color.GREEN);
        yesButton.setLocation(250,150);
        yesButton.setSize(80,30);
        yesButton.addActionListener(this);

        noButton = new JButton("No");
        noButton.setFocusable(false);
        noButton.setBackground(Color.RED);
        noButton.setLocation(100,150);
        noButton.setSize(80,30);
        noButton.addActionListener(this);

        panelView.add(yesButton);
        panelView.add(noButton);
        panelView.add(textLabel);
        this.add(panelView);
//

        this.setSize(420,420);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == yesButton){
            this.setVisible(false);
            this.dispose();
            new Login();

        }
        if(e.getSource() == noButton){
            this.setVisible(false);
            this.dispose();
            new Registration();
        }
    }
}
