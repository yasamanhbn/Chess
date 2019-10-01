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
        setBackground(this);
    }
    public void setBackground(Square square){
        if ((square.getColumn() % 2 == 1 && square.getRow() % 2 == 1) || (square.getColumn() % 2 == 0 && square.getRow()% 2 == 0)) {
            square.setBackground(Color.WHITE);
        }
        else {
            square.setBackground(new Color(42, 42, 42));
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
    public void removeImage(Square square){
       square.setIcon(null);
    }
}
