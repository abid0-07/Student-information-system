package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JLabel label;
    private int count=0;
    private int xAxis=10;
    private int yAxis=10;
    private int width=200;
    private int height=50;


    public SecondPage(){
        mainPanel = new JPanel();

        mainPanel.setBounds(0,0,1000,800);
        mainPanel.setBackground(Color.CYAN);
        mainPanel.setLayout(null);


        this.add(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void createNewLabel(String text){
        label = new JLabel();
        label.setFont(new Font("Serif", Font.PLAIN,16));
        label.setSize(width,height);
        label.setBackground(new Color(204,255,255));
        label.setOpaque(true);
        label.setText(text);
        label.setHorizontalAlignment(JLabel.CENTER);



        if(count==0){
            label.setLocation(xAxis,yAxis);
            xAxis += (20+width);

        }
        if(count%4 == 0 ){
            yAxis += (20+height);
            xAxis=10;
            label.setLocation(xAxis,yAxis);

        }

        if(count%4!=1||count%4!=2|| count%4!=3 ) {
            label.setLocation(xAxis, yAxis);
            xAxis += (20 + width);
        }


        count++;
        mainPanel.add(label);
    }

    public void searchStudent(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
