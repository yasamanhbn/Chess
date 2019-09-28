package com;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ground ground = new Ground();
        ground.printGround();
        Square[][] squares = ground.getSquares();
        Scanner sc = new Scanner(System.in);

        int firstRow = sc.nextInt();
        int firstColumn = sc.nextInt();
        int secondRow = sc.nextInt();
        int secondColumn = sc.nextInt();
        squares[firstRow][firstColumn].getMyPiece().findPossibleMove(ground);
        boolean result = squares[firstRow][firstColumn].getMyPiece().getPossibleMoves().contains(squares[secondRow][secondColumn]);
        if(result){
            squares[secondRow][secondColumn].setMyPiece(squares[firstRow][firstColumn].getMyPiece());
            squares[firstRow][firstColumn].setMyPiece(null);
        }
        ground.printGround();
    }
}
