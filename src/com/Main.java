package com;


public class Main {

    public static void main(String[] args) {

        Ground ground = new Ground();
        ground.printGround();
        Square[][] squares = ground.getSquars();
        for(int i=0; i<8 ; i++){
            for(int j=0;j<8;j++) {
                squares[i][j].getMyPiece().findPossibleMove(ground);
                squares[i][j].getMyPiece().printPossibleMove();
            }
        }
    }
}
