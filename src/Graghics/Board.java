package Graghics;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    private JPanel chessPanel;
    private JButton[][] chessBoardSquares = new JButton[8][8];
    public Board(){
        super("Chess");
        this.setLayout(new BorderLayout());
        chessPanel = new JPanel();
        createChessBoard();
        this.add(chessPanel,BorderLayout.CENTER);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void createChessBoard() {
        chessPanel.setLayout(new GridLayout(8,8));
        for (int ii = 0; ii <8; ii++) {
            for (int jj = 0; jj <8; jj++) {
                JButton b = new JButton();
                if ((jj % 2 == 1 && ii % 2 == 1) || (jj % 2 == 0 && ii % 2 == 0)) {
                    b.setBackground(Color.WHITE);
                }
                else {
                    b.setBackground(Color.BLACK);
                }
                chessBoardSquares[ii][jj]=b;
            }
        }
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                chessPanel.add(chessBoardSquares[i][j]);
            }
        }
    }
}