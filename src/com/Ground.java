package com;

import Graghics.SquaresListener;
import pieces.*;

import javax.swing.*;
import java.awt.*;

public class Ground extends JPanel {
    //first index=>row
    //second index=>column
    private Square[][] ground;
    private SquaresListener squaresListener;
    public Ground(){
        super();
        this.setLayout(new GridLayout(8, 8));
        ground = new Square[8][8];
        squaresListener = new SquaresListener(this);
        setPieceToGround();
    }

    public Square[][] getSquares() {
        return ground;
    }

    private void setPieceToGround(){
        //rook
        ground[0][0]=new Square(0,0,new Rook(0,0,"white"));
        ground[0][0].getMyPiece().setImage(ground[0][0],"white");
        ground[0][0].addMouseListener(squaresListener);
        this.add(ground[0][0]);
        //knight
        ground[0][1]=new Square(0,1,new Knight(0,1,"white"));
        ground[0][1].getMyPiece().setImage(ground[0][1],"white");
        ground[0][1].addMouseListener(squaresListener);
        this.add(ground[0][1]);
        //bishop
        ground[0][2]=new Square(0,2,new Bishop(0,2,"white"));
        ground[0][2].getMyPiece().setImage(ground[0][2],"white");
        ground[0][2].addMouseListener(squaresListener);
        this.add(ground[0][2]);
        //king
        ground[0][3]=new Square(0,3,new King(0,3,"white"));
        ground[0][3].getMyPiece().setImage(ground[0][3],"white");
        ground[0][3].addMouseListener(squaresListener);
        this.add(ground[0][3]);
        //queen
        ground[0][4]=new Square(0,4,new Queen(0,4,"white"));
        ground[0][4].getMyPiece().setImage(ground[0][4],"white");
        ground[0][4].addMouseListener(squaresListener);
        this.add(ground[0][4]);
        //bishop
        ground[0][5]=new Square(0,5,new Bishop(0,5,"white"));
        ground[0][5].getMyPiece().setImage(ground[0][5],"white");
        ground[0][5].addMouseListener(squaresListener);
        this.add(ground[0][5]);
        //knight
        ground[0][6]=new Square(0,6,new Knight(0,6,"white"));
        ground[0][6].getMyPiece().setImage(ground[0][6],"white");
        ground[0][6].addMouseListener(squaresListener);
        this.add(ground[0][6]);
        //rook
        ground[0][7]=new Square(0,7,new Rook(0,7,"white"));
        ground[0][7].getMyPiece().setImage(ground[0][7],"white");
        ground[0][7].addMouseListener(squaresListener);
        this.add(ground[0][7]);
        //white pawn
        for(int i=0; i<8 ;i++){
            ground[1][i]=new Square(1,i,new Pawn(1,i,"white"));
            ground[1][i].getMyPiece().setImage(ground[1][i],"white");
            ground[1][i].addMouseListener(squaresListener);
            this.add(ground[1][i]);
        }
        //create empty square
        for(int i=2;i<6;i++){
            for(int j=0; j<8 ;j++){
                ground[i][j]=new Square(i,j,null);
                ground[i][j].addMouseListener(squaresListener);
                this.add(ground[i][j]);
            }
        }
        //black pawn
        for(int i=0; i<8 ;i++){
            ground[6][i] = new Square(6, i, new Pawn(6, i, "black"));
            ground[6][i].getMyPiece().setImage(ground[6][i], "black");
            ground[6][i].addMouseListener(squaresListener);
            this.add(ground[6][i]);
        }
        //black
        ground[7][0]=new Square(7,0,new Rook(7,0,"black"));
        ground[7][0].getMyPiece().setImage(ground[7][0],"black");
        ground[7][0].addMouseListener(squaresListener);
        this.add(ground[7][0]);
        //knight
        ground[7][1]=new Square(7,1,new Knight(7,1,"black"));
        this.ground[7][1].getMyPiece().setImage(ground[7][1],"black");
        this.ground[7][1].addMouseListener(squaresListener);
        this.add(ground[7][1]);
        //bishop
        ground[7][2]=new Square(7,2,new Bishop(7,2,"black"));
        this.ground[7][2].getMyPiece().setImage(ground[7][2],"black");
        this.ground[7][2].addMouseListener(squaresListener);
        this.add(ground[7][2]);
        //king
        ground[7][3]=new Square(7,3,new King(7,3,"black"));
        ground[7][3].getMyPiece().setImage(ground[7][3],"black");
        ground[7][3].addMouseListener(squaresListener);
        this.add(ground[7][3]);
        //queen
        ground[7][4]=new Square(7,4,new Queen(7,4,"black"));
        ground[7][4].getMyPiece().setImage(ground[7][4],"black");
        ground[7][4].addMouseListener(squaresListener);
        this.add(ground[7][4]);
        //bishop
        ground[7][5]=new Square(7,5,new Bishop(7,5,"black"));
        this.ground[7][5].getMyPiece().setImage(ground[7][5],"black");
        this.ground[7][5].addMouseListener(squaresListener);
        this.add(ground[7][5]);
        //knight
        ground[7][6]=new Square(7,6,new Knight(7,6,"black"));
        this.ground[7][6].getMyPiece().setImage(ground[7][6],"black");
        this.ground[7][6].addMouseListener(squaresListener);
        this.add(ground[7][6]);
        //rook
        ground[7][7]=new Square(7,7,new Rook(7,7,"black"));
        this.ground[7][7].getMyPiece().setImage(ground[7][7],"black");
        this.ground[7][7].addMouseListener(squaresListener);
        this.add(ground[7][7]);
    }
}
