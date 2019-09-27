package com;

import pieces.*;

public class Ground {
    //first index=>row
    //second index=>column
    private Square[][] ground;


    public Ground(){
        ground = new Square[8][8];
        for(int i=0; i<8 ;i++){
            ground[1][i]=new Square(1,i,new Pawn(1,i,"white"));
            ground[6][i]=new Square(6,i,new Pawn(6,i,"black"));
        }
        ground[0][0]=new Square(0,0,new Rook(0,0,"white"));
        ground[0][7]=new Square(0,7,new Rook(0,7,"white"));
        ground[0][1]=new Square(0,0,new Knight(0,1,"white"));
        ground[0][6]=new Square(0,6,new Knight(0,6,"white"));
        ground[0][2]=new Square(0,2,new Bishop(0,2,"white"));
        ground[0][5]=new Square(0,5,new Bishop(0,5,"white"));
        ground[0][3]=new Square(0,3,new Queen(0,3,"white"));
        ground[0][4]=new Square(0,4,new King(0,4,"white"));
        //black
        ground[7][0]=new Square(7,0,new Rook(7,0,"black"));
        ground[7][7]=new Square(7,7,new Rook(7,7,"black"));
        ground[7][1]=new Square(7,0,new Knight(7,1,"black"));
        ground[7][6]=new Square(7,6,new Knight(7,6,"black"));
        ground[7][2]=new Square(7,2,new Bishop(7,2,"black"));
        ground[7][5]=new Square(7,5,new Bishop(7,5,"black"));
        ground[7][3]=new Square(7,3,new Queen(7,3,"black"));
        ground[7][4]=new Square(7,4,new King(7,4,"black"));
        //create empty square
        for(int i=2;i<6;i++){
            for(int j=0; j<8 ;j++){
                ground[i][j]=new Square(i,j,null);
            }
        }
    }

    public Square[][] getSquars() {
        return ground;
    }

    public void setPieceToGround(Square sq){
        ground[sq.getRow()][sq.getColumn()]=sq;
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
