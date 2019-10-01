package Graghics;

import com.Ground;
import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    private JPanel information;
    public Board(){
        super("Chess");
        this.setLayout(new BorderLayout());
        information = new JPanel();
        setWhiteBack();
        information.setPreferredSize(new Dimension(400,800));
        this.add(information,BorderLayout.WEST);
        this.add(new Ground(),BorderLayout.CENTER);
        this.setSize(1600,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void setWhiteBack(){
        information.setBackground(Color.white);
    }
    public void setBlackBack(){
        information.setBackground(Color.black);
    }
}