package pieces;

import com.Ground;
import com.Square;

public class Rook extends Piece {

    public Rook(int row, int column, String color) {
        super(row, column, color);
        type="Rook";
    }

    @Override
    public void findPossibleMove(Ground g) {
        super.clearArray();
        Square[][] squares = g.getSquars();
        //got to up
            for(int i=super.getRow()+1; i<8; i++){
                if(squares[i][super.getColumn()].getMyPiece()==null)
                    super.addSquare(squares[i][super.getColumn()]);
                else if(!super.getColor().equals(squares[super.getRow()][i].getMyPiece().getColor())){
                    super.addSquare(squares[i][super.getColumn()]);
                    break;
                }
                else  break;
            }
        //go to down
            for(int i=super.getRow()-1; i>=0; i--){
                if(squares[i][super.getColumn()].getMyPiece()==null)
                    super.addSquare(squares[i][super.getColumn()]);
                else if(!super.getColor().equals(squares[super.getRow()][i].getMyPiece().getColor())){
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
