package pieces;

import com.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Pawn extends Piece {

    public Pawn(int row, int column, String color) {
        super(row, column, color);
        type="Pawn";
    }

    @Override
    public void setImage(Square square, String color) {
        Image img,newImage;
        try {
            if (color.equals("white")) {
                img = ImageIO.read(new FileInputStream(".\\images\\whitePawn.png"));
            }
            else {
                img = ImageIO.read(new FileInputStream(".\\images\\blackPawn.png"));
            }
            newImage = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            square.setIcon(new ImageIcon(newImage));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void findPossibleMove(Ground ground) {
        super.clearArray();
        Square[][] squares = ground.getSquares();
        if (super.getColor().equals("white")) {
            //for first move
            if (super.getRow() == 1) {
                if (squares[super.getRow() + 1][super.getColumn()].getMyPiece() == null)
                    super.addSquare(squares[super.getRow() + 1][super.getColumn()]);
                if (squares[super.getRow() + 2][super.getColumn()].getMyPiece() == null &&
                        squares[super.getRow() + 1][super.getColumn()].getMyPiece() == null)
                    super.addSquare(squares[super.getRow() + 2][super.getColumn()]);
            }
            else {
                if (squares[super.getRow() + 1][super.getColumn()].getMyPiece() == null)
                    super.addSquare(squares[super.getRow() + 1][super.getColumn()]);
            }
            //move for capturing
            if (super.getRow() != 7 && super.getColumn() != 0 && super.getColumn() != 7) {
                if (squares[super.getRow() + 1][super.getColumn() + 1].getMyPiece() != null) {
                    if (squares[super.getRow() + 1][super.getColumn() + 1].getMyPiece().getColor().equals("black"))
                        super.addSquare(squares[super.getRow() + 1][super.getColumn() + 1]);
                }
                if (squares[super.getRow() + 1][super.getColumn() - 1].getMyPiece() != null) {
                    if (squares[super.getRow() + 1][super.getColumn() - 1].getMyPiece().getColor().equals("black"))
                        super.addSquare(squares[super.getRow() + 1][super.getColumn() - 1]);
                }
            }
            else if(super.getColumn() == 0){
                if (squares[super.getRow() + 1][super.getColumn() + 1].getMyPiece() != null) {
                    if (squares[super.getRow() + 1][super.getColumn() + 1].getMyPiece().getColor().equals("black"))
                        super.addSquare(squares[super.getRow() + 1][super.getColumn() + 1]);
                }
            }
            else if(super.getColumn()==7){
                if (squares[super.getRow() + 1][super.getColumn() - 1].getMyPiece() != null) {
                    if (squares[super.getRow() + 1][super.getColumn() + 1].getMyPiece().getColor().equals("black"))
                        super.addSquare(squares[super.getRow() + 1][super.getColumn() + 1]);
                }
            }
        }
        //for black pieces
        else {
            //for first move
            if (super.getRow() == 6) {
                if (squares[super.getRow() - 1][super.getColumn()].getMyPiece() == null)
                    super.addSquare(squares[super.getRow() - 1][super.getColumn()]);
                if (squares[super.getRow() - 2][super.getColumn()].getMyPiece() == null &&
                        squares[super.getRow() - 1][super.getColumn()].getMyPiece() == null)
                    super.addSquare(squares[super.getRow() - 2][super.getColumn()]);
            }
            else {
                if (squares[super.getRow() - 1][super.getColumn()].getMyPiece() == null)
                    super.addSquare(squares[super.getRow() - 1][super.getColumn()]);
            }
            //move for capturing
            if (super.getRow() != 0 && super.getColumn() != 0 && super.getColumn() != 7) {
                if (squares[super.getRow() - 1][super.getColumn() + 1].getMyPiece() != null && squares[super.getRow() - 1][super.getColumn() + 1].getMyPiece().getColor().equals("white"))
                    super.addSquare(squares[super.getRow() - 1][super.getColumn() + 1]);
                if (squares[super.getRow() - 1][super.getColumn() - 1].getMyPiece() != null && squares[super.getRow() - 1][super.getColumn() - 1].getMyPiece().getColor().equals("white"))
                    super.addSquare(squares[super.getRow() - 1][super.getColumn() - 1]);
            }
            else if (super.getColumn() == 0) {
                if (squares[super.getRow() - 1][super.getColumn() + 1].getMyPiece() != null && squares[super.getRow() - 1][super.getColumn() + 1].getMyPiece().getColor().equals("white"))
                    super.addSquare(squares[super.getRow() + 1][super.getColumn() + 1]);
            } else if (super.getColumn() == 7) {
                if (squares[super.getRow() - 1][super.getColumn() - 1].getMyPiece() != null && squares[super.getRow() - 1][super.getColumn() + 1].getMyPiece().getColor().equals("white"))
                    super.addSquare(squares[super.getRow() + 1][super.getColumn() + 1]);
            }
        }
    }
}
