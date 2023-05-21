package Default;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class viewStudent extends JFrame implements ActionListener, AdjustmentListener {
    private JPanel mainPanel;
    private JLabel label;
    private JLabel headingLabel;
    protected JButton mainMenuButton;

    private int count=0;
    private int xAxis=10;
    private int yAxis=10;
    private int width=200;
    private int height=50;
    private JScrollBar scrollBar;


    public viewStudent(){
        mainPanel = new JPanel();

        mainPanel.setBounds(0,0,1000,800);
        mainPanel.setBackground(Color.CYAN);
        mainPanel.setLayout(null);

        initializationPart();

        mainPanel.add(mainMenuButton);
        mainPanel.add(headingLabel);
        this.add(mainPanel);
        this.add(scrollBar);
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


    private void initializationPart(){
        mainMenuButton = new JButton("Back");
        mainMenuButton.setFont(new Font("Serif", Font.PLAIN,16));
        mainMenuButton.setLocation(5,5);
        mainMenuButton.setSize(width,height);
        mainMenuButton.setFocusable(false);
        mainMenuButton.addActionListener(this) ;

        headingLabel = new JLabel("Student List");
        headingLabel.setFont(new Font("Serif", Font.ITALIC,20));
        headingLabel.setLocation(350,5);
        headingLabel.setSize(width,height);
        headingLabel.setFocusable(false);
        headingLabel.setBackground(Color.lightGray);
        headingLabel.setOpaque(true);
        headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headingLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        scrollBar = new JScrollBar(Scrollbar.VERTICAL,0,1,0,255);
        scrollBar.setBounds(950,0,50,700);
        scrollBar.addAdjustmentListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        new MainPage();
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        
    }
}
