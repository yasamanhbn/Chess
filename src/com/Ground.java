package com;

import pieces.*;

import javax.swing.*;
import java.awt.*;

public class Ground extends JPanel {
    //first index=>row
    //second index=>column
    private Square[][] ground;


    public Ground(){
        super();
        this.setLayout(new GridLayout(8, 8));
        ground = new Square[8][8];
        setPieceToGround();

    }

    public Square[][] getSquares() {
        return ground;
    }
    private void setPieceToGround(){
        //rook
        ground[0][0]=new Square(0,0,new Rook(0,0,"white"));
        ground[0][0].getMyPiece().setImage(ground[0][0],"white");
        this.add(ground[0][0]);
        //knight
        ground[0][1]=new Square(0,0,new Knight(0,1,"white"));
        ground[0][1].getMyPiece().setImage(ground[0][1],"white");
        this.add(ground[0][1]);
        //bishop
        ground[0][2]=new Square(0,2,new Bishop(0,2,"white"));
        ground[0][2].getMyPiece().setImage(ground[0][2],"white");
        this.add(ground[0][2]);
        //queen
        ground[0][3]=new Square(0,3,new Queen(0,3,"white"));
        ground[0][3].getMyPiece().setImage(ground[0][3],"white");
        this.add(ground[0][3]);
        //king
        ground[0][4]=new Square(0,4,new King(0,4,"white"));
        ground[0][4].getMyPiece().setImage(ground[0][4],"white");
        this.add(ground[0][4]);
        //bishop
        ground[0][5]=new Square(0,5,new Bishop(0,5,"white"));
        ground[0][5].getMyPiece().setImage(ground[0][5],"white");
        this.add(ground[0][5]);
        //knight
        ground[0][6]=new Square(0,6,new Knight(0,6,"white"));
        ground[0][6].getMyPiece().setImage(ground[0][6],"white");
        this.add(ground[0][6]);
        //rook
        ground[0][7]=new Square(0,7,new Rook(0,7,"white"));
        ground[0][7].getMyPiece().setImage(ground[0][7],"white");
        this.add(ground[0][7]);
        //white pawn
        for(int i=0; i<8 ;i++){
            ground[1][i]=new Square(1,i,new Pawn(1,i,"white"));
            ground[1][i].getMyPiece().setImage(ground[1][i],"white");
            this.add(ground[1][i]);
        }
        //create empty square
        for(int i=2;i<6;i++){
            for(int j=0; j<8 ;j++){
                ground[i][j]=new Square(i,j,null);
                this.add(ground[i][j]);
            }
        }
        //black pawn
        for(int i=0; i<8 ;i++){
            ground[6][i] = new Square(6, i, new Pawn(6, i, "black"));
            ground[6][i].getMyPiece().setImage(ground[6][i], "black");
            this.add(ground[6][i]);
        }
        //black
        ground[7][0]=new Square(7,0,new Rook(7,0,"black"));
        ground[7][0].getMyPiece().setImage(ground[7][0],"black");
        this.add(ground[7][0]);
        //knight
        ground[7][1]=new Square(7,0,new Knight(7,1,"black"));
        this.ground[7][1].getMyPiece().setImage(ground[7][1],"black");
        this.add(ground[7][1]);
        //bishop
        ground[7][2]=new Square(7,2,new Bishop(7,2,"black"));
        this.ground[7][2].getMyPiece().setImage(ground[7][2],"black");
        this.add(ground[7][2]);
        //queen
        ground[7][3]=new Square(7,3,new Queen(7,3,"black"));
        ground[7][3].getMyPiece().setImage(ground[7][3],"black");
        this.add(ground[7][3]);
        //king
        ground[7][4]=new Square(7,4,new King(7,4,"black"));
        ground[7][4].getMyPiece().setImage(ground[7][4],"black");
        this.add(ground[7][4]);
        //bishop
        ground[7][5]=new Square(7,5,new Bishop(7,5,"black"));
        this.ground[7][5].getMyPiece().setImage(ground[7][5],"black");
        this.add(ground[7][5]);
        //knight
        ground[7][6]=new Square(7,6,new Knight(7,6,"black"));
        this.ground[7][6].getMyPiece().setImage(ground[7][6],"black");
        this.add(ground[7][6]);
        //rook
        ground[7][7]=new Square(7,7,new Rook(7,7,"black"));
        this.ground[7][7].getMyPiece().setImage(ground[7][7],"black");
        this.add(ground[7][7]);
    }

    private void createChessBoard() {
        this.setLayout(new GridLayout(8, 8));
        for (int ii = 0; ii < 8; ii++) {
            for (int jj = 0; jj < 8; jj++) {
                JButton b = new JButton();
                if ((jj % 2 == 1 && ii % 2 == 1) || (jj % 2 == 0 && ii % 2 == 0)) {
                    b.setBackground(Color.WHITE);
                } else {
                    b.setBackground(Color.BLACK);
                }
//                chessBoardSquares[ii][jj] = b;
            }
        }
    }

    public void printGround(){
        for(int i=0 ; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                if (ground[i][j].getMyPiece() != null)
                    System.out.print(ground[i][j].getMyPiece().getType() + "|");
                else
                    System.out.print("    |");
            }
            System.out.println();
        }
    }
}
