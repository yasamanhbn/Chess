package Graghics;

import com.Ground;
import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    private static JPanel information;
    private static JLabel text;
    public Board(){
        super("Chess");
        this.setLayout(new BorderLayout());
        information = new JPanel();
        setWhiteBack();
        information.setPreferredSize(new Dimension(400,800));
        text = new JLabel();
        text.setFont(new Font("Courier", Font.BOLD,35));
        text.setForeground(new Color(53, 206, 255));
        information.add(text);
        this.add(information,BorderLayout.WEST);
        this.add(new Ground(),BorderLayout.CENTER);
        this.setSize(1600,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
     static void setText(String t){
        text.setText(t);
    }
     static void setWhiteBack(){
        information.setBackground(Color.white);
    }
     static void setBlackBack(){
        information.setBackground(Color.black);
    }
}