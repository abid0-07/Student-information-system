package Default;

import javax.swing.*;
import java.awt.*;

public class SecondPage extends JFrame{
    private JPanel mainPanel;
    private JLabel label;
    private int count=0;
    private int xAxis=10;
    private int yAxis=10;
    private int width=150;
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
        label.setFont(new Font("Serif", Font.PLAIN,12));
        label.setSize(width,height);
        label.setBackground(new Color(204,255,255));
        label.setOpaque(true);

        if(count==0){
            label.setLocation(xAxis,yAxis);
            xAxis += (20+width);
            label.setText(text);
            count++;
        }
        else if(count%4!=0){
            label.setLocation(xAxis,yAxis);
            xAxis += (20+width);
            label.setText(text);
            count++;
        }
        else if(count%4 == 0 ){
            yAxis += (20+height);
            xAxis=10;
            label.setLocation(xAxis,yAxis);
            label.setText(text);
            count++;
        }
        mainPanel.add(label);
    }

}
