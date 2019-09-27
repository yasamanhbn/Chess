package pieces;

import com.Ground;
import com.Square;

public class Bishop extends Piece {

    public Bishop(int row, int column, String color) {
        super(row, column, color);
        type="Bishop";
    }

    @Override
    public void findPossibleMove(Ground ground) {
        super.clearArray();
        Square[][] squares = ground.getSquars();
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
