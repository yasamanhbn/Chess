package pieces;

import com.Ground;
import com.Square;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Rook extends Piece {

    public Rook(int row, int column, String color) {
        super(row, column, color);
        type="Rook";
    }

    @Override
    public void setImage(Square square, String color) {
        Image img,newImage;
        try {
            if (color.equals("white")) {
                img = ImageIO.read(new FileInputStream(".\\images\\whiteRook.png"));
            }
            else {
                img = ImageIO.read(new FileInputStream(".\\images\\blackRook.png"));
            }
            newImage = img.getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            square.setIcon(new ImageIcon(newImage));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void findPossibleMove(Ground g) {
        super.clearArray();
        Square[][] squares = g.getSquares();
        //got to up
            for(int i=super.getRow()+1; i<8; i++){
                if(squares[i][super.getColumn()].getMyPiece()==null)
                    super.addSquare(squares[i][super.getColumn()]);
                else if(!super.getColor().equals(squares[i][super.getColumn()].getMyPiece().getColor())){
                    super.addSquare(squares[i][super.getColumn()]);
                    break;
                }
                else  break;
            }
        //go to down
            for(int i=super.getRow()-1; i>=0; i--){
                if(squares[i][super.getColumn()].getMyPiece()==null)
                    super.addSquare(squares[i][super.getColumn()]);
                else if(!super.getColor().equals(squares[i][super.getColumn()].getMyPiece().getColor())){
                    super.addSquare(squares[i][super.getColumn()]);
                    break;
                }
                else  break;
            }
        //go to Right
            for(int i=super.getColumn()+1; i<8; i++){
               if(squares[super.getRow()][i].getMyPiece()==null)
                   super.addSquare(squares[super.getRow()][i]);
               else if(!super.getColor().equals(squares[super.getRow()][i].getMyPiece().getColor())){
                   super.addSquare(squares[super.getRow()][i]);
                   break;
               }
               else  break;
            }
        //go to Left
            for(int i=super.getColumn()-1; i>=0; i--){
                if(squares[super.getRow()][i].getMyPiece()==null)
                    super.addSquare(squares[super.getRow()][i]);
                else if(!super.getColor().equals(squares[super.getRow()][i].getMyPiece().getColor())){
                    super.addSquare(squares[super.getRow()][i]);
                    break;
                }
                else  break;
            }
        //end of the method
    }

}
