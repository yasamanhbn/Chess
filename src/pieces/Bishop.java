package pieces;

import com.Ground;
import com.Square;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Bishop extends Piece {

    public Bishop(int row, int column, String color) {
        super(row, column, color);
        type="Bishop";
    }

    @Override
    public void setImage(Square square,String color) {
        Image img,newImage;
        try {
            if (color.equals("white")) {
                img = ImageIO.read(new FileInputStream(".\\images\\whiteBishop.png"));
            }
            else {
                img = ImageIO.read(new FileInputStream(".\\images\\blackBishop.png"));
            }
            newImage = img.getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            square.setIcon(new ImageIcon(newImage));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void findPossibleMove(Ground ground) {
        super.clearArray();
        Square[][] squares = ground.getSquares();
        //up and right
        int column = super.getColumn()+1;
        for(int i=super.getRow()+1; i<8;i++ ) {
            if (column != 8) {
                if (squares[i][column].getMyPiece() == null) {
                    super.addSquare(squares[i][column]);
                } else if (!super.getColor().equals(squares[i][column].getMyPiece().getColor())) {
                    super.addSquare(squares[i][column]);
                    break;
                } else break;
            }
            else break;
            column++;
        }
            //up and left
         column = super.getColumn()-1;
           for(int i=super.getRow()+1; i<8;i++ ){
              if(column!=-1){
                 if(squares[i][column].getMyPiece()==null){
                      super.addSquare(squares[i][column]);
                 }
                 else if(!super.getColor().equals(squares[i][column].getMyPiece().getColor())){
                      super.addSquare(squares[i][column]);
                      break;
                 }
                 else break;
              }
           else break;
           column--;
        }
        //down and right
         column = super.getColumn()+1;
        for(int i=super.getRow()-1; i>=0;i--) {
            if (column != 8) {
                if (squares[i][column].getMyPiece() == null) {
                    super.addSquare(squares[i][column]);
                } else if (!super.getColor().equals(squares[i][column].getMyPiece().getColor())) {
                    super.addSquare(squares[i][column]);
                    break;
                } else break;
            }
            else break;
            column++;
        }
        //down and left
        column = super.getColumn()-1;
        for(int i=super.getRow()-1; i>=0;i--){
            if(column!=-1){
                if(squares[i][column].getMyPiece()==null){
                    super.addSquare(squares[i][column]);
                }
                else if(!super.getColor().equals(squares[i][column].getMyPiece().getColor())){
                    super.addSquare(squares[i][column]);
                    break;
                }
                else break;
            }
            else break;
            column--;
        }
    }
}
