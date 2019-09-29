package com;
import pieces.Piece;

import javax.swing.*;
import java.awt.*;

public class Square extends JButton {
   private int row,column;
   private Piece myPiece;
    public Square(int row, int column, Piece myPiece) {
        super();
        this.row = row;
        this.column = column;
        this.myPiece = myPiece;
        if ((column % 2 == 1 && row % 2 == 1) || (column % 2 == 0 && row% 2 == 0)) {
            this.setBackground(Color.WHITE);
        }
        else {
            this.setBackground(Color.BLACK);
        }
    }

    public Piece getMyPiece() {
        return myPiece;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setMyPiece(Piece myPiece) {
        this.myPiece = myPiece;
    }
}
