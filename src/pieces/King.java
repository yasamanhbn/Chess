package pieces;

import com.Ground;
import com.Square;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class King extends Piece {
    private ArrayList<Square> pieces;
    private boolean check;
    public King(int row, int column, String color) {
        super(row, column, color);
        type="king";
        pieces = new ArrayList<>();
        check = false;
    }

    @Override
    public void setImage(Square square, String color) {
        Image img,newImage;
        try {
            if (color.equals("white")) {
                img = ImageIO.read(new FileInputStream(".\\images\\whiteKing.png"));
            }
            else {
                img = ImageIO.read(new FileInputStream(".\\images\\blackKing.png"));
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
            pieces.clear();
            //get all the black pieces
            for(int i=0; i<8; i++){
                for(int j=0; j<8; j++){
                    if(squares[i][j].getMyPiece()!=null && !squares[i][j].getMyPiece().getColor().equals(super.getColor())){
                        pieces.add(squares[i][j]);
                    }
                }
            }
            //go up
            if(getRow()!=7){
                if(squares[getRow()+1][getColumn()].getMyPiece()==null ||(squares[getRow()+1][getColumn()].getMyPiece()!=null && !squares[getRow()+1][getColumn()].getMyPiece().getColor().equals(super.getColor()))){
                    for(Square s : pieces){
                        s.getMyPiece().findPossibleMove(ground);
                       boolean result = s.getMyPiece().getPossibleMoves().contains(squares[getRow()+1][getColumn()]);
                       if(result)
                           check = true;
                    }
                    if(!check)
                        super.addSquare(squares[getRow() + 1][getColumn()]);
                    check = false;
                }

            }
            //go down
            if(super.getRow()!=0){
                if(squares[getRow()-1][getColumn()].getMyPiece()==null || (squares[getRow()-1][getColumn()].getMyPiece()!=null && !squares[getRow()-1][getColumn()].getMyPiece().getColor().equals(super.getColor()))){
                    for(Square s : pieces){
                        s.getMyPiece().findPossibleMove(ground);
                        boolean result = s.getMyPiece().getPossibleMoves().contains(squares[getRow()-1][getColumn()]);
                        if(result)
                            check = true;
                    }
                    if(!check)
                        super.addSquare(squares[getRow() - 1][getColumn()]);
                    check=false;
                }
            }
            if(getColumn()!=0){
                if(squares[getRow()][getColumn()-1].getMyPiece()==null || (squares[getRow()][getColumn()-1].getMyPiece()!=null && !squares[getRow()][getColumn()-1].getMyPiece().getColor().equals(super.getColor()))){
                    for(Square s : pieces){
                        s.getMyPiece().findPossibleMove(ground);
                        boolean result = s.getMyPiece().getPossibleMoves().contains(squares[getRow()][getColumn()-1]);
                        if(result)
                            check = true;
                    }
                    if(!check)
                        super.addSquare(squares[getRow()][getColumn() - 1]);
                    check = false;
                }
            }
            if(getColumn()!=7){
                if(squares[getRow()][getColumn()+1].getMyPiece()==null || (squares[getRow()][getColumn()+1].getMyPiece()!=null && !squares[getRow()][getColumn()+1].getMyPiece().getColor().equals(super.getColor()))){
                    for(Square s : pieces){
                        s.getMyPiece().findPossibleMove(ground);
                        boolean result = s.getMyPiece().getPossibleMoves().contains(squares[getRow()][getColumn()+1]);
                        if(result)
                            check = true;
                    }
                    if(!check)
                        super.addSquare(squares[getRow()][getColumn() + 1]);
                    check = false;
                }
        }
        if(getColumn()!=0 && getRow()!=0) {
            if (squares[getRow()-1][getColumn() -1].getMyPiece() == null || (squares[getRow()-1][getColumn() - 1].getMyPiece() != null && !squares[getRow()-1][getColumn()-1].getMyPiece().getColor().equals(super.getColor()))) {
                for (Square s : pieces) {
                    s.getMyPiece().findPossibleMove(ground);
                    boolean result = s.getMyPiece().getPossibleMoves().contains(squares[getRow() - 1][getColumn() - 1]);
                    if (result)
                        check = true;
                }
                if (!check)
                    super.addSquare(squares[getRow() - 1][getColumn() - 1]);
                check = false;
            }
        }
        if(getColumn()!=7 && getRow()!=0) {
            if (squares[getRow() - 1][getColumn() + 1].getMyPiece() == null || (squares[getRow() - 1][getColumn() + 1].getMyPiece() != null && !squares[getRow()-1][getColumn()+1].getMyPiece().getColor().equals(super.getColor()))) {
                for (Square s : pieces) {
                    s.getMyPiece().findPossibleMove(ground);
                    boolean result = s.getMyPiece().getPossibleMoves().contains(squares[getRow() - 1][getColumn() + 1]);
                    if (result)
                        check = true;
                }
                if (!check)
                    super.addSquare(squares[getRow() - 1][getColumn() + 1]);
                check = false;
            }
        }
        if(getColumn()!=0 && getRow()!=7) {
            if (squares[getRow() + 1][getColumn() -1].getMyPiece() == null || (squares[getRow() + 1][getColumn() - 1].getMyPiece() != null && !squares[getRow() + 1][getColumn() - 1].getMyPiece().getColor().equals(super.getColor()))) {
                for (Square s : pieces) {
                    s.getMyPiece().findPossibleMove(ground);
                    boolean result = s.getMyPiece().getPossibleMoves().contains(squares[getRow() + 1][getColumn() - 1]);
                    if (result)
                        check = true;
                }
                if (!check)
                    super.addSquare(squares[getRow() + 1][getColumn() - 1]);
                check = false;
            }
        }
        if(getColumn()!=7 && getRow()!=7) {
            if (squares[getRow() + 1][getColumn() + 1].getMyPiece() == null || (squares[getRow() + 1][getColumn() + 1].getMyPiece() != null && !squares[getRow() + 1][getColumn() + 1].getMyPiece().getColor().equals(super.getColor()))) {
                for (Square s : pieces) {
                    s.getMyPiece().findPossibleMove(ground);
                    boolean result = s.getMyPiece().getPossibleMoves().contains(squares[getRow() + 1][getColumn() + 1]);
                    if (result)
                        check = true;
                }
                if (!check)
                    super.addSquare(squares[getRow() + 1][getColumn() + 1]);
                check = false;
            }
        }
    }
}
