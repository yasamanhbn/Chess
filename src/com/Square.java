package com;

import pieces.Piece;

public class Square {
   private int row,column;
   private Piece myPiece;
    public Square(int row, int column, Piece myPiece) {
        this.row = row;
        this.column = column;
        this.myPiece = myPiece;
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
}
